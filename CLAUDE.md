# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this is

Create Weaponry Tinkering — a Minecraft mod (weapons: glaive, hammer, katana, mace in ~17 metal
variants, plus tool heads, tinker-style patterns, and molten metal fluids). Published on CurseForge
(project "Create Weaponry", ID 867626).

## Branch-per-version layout (the most important thing to know)

Each Minecraft version lives on its own branch with **different code, namespaces, and maturity**.
There is no shared main; the default branch is `1.21.1-neoforge`.

| Branch | Loader | Namespace | State |
|---|---|---|---|
| `1.20.1-forge` | Forge | `create_wt` | **Complete, released** (~29 classes: items, fluids, tiers, JEI, loot) |
| `1.19.2-forge` | Forge | `create_weaponry` | Complete, released. **Hard-depends on cp_tweaks** (Create Planetary Tweaks — `WeaponTiers` imports its classes; it shares the `net.celsiusqc` package root, so import scans miss it) |
| `1.21.1-neoforge` | NeoForge | `create_wt` | **Unfinished port**: assets only; Java is still the MDK template — no items are registered, in-game you only see "Example Mod Tab" |
| `1.20.1-fabric` | Fabric | `create_wt` | Different scope: blocks/fluids only, **no weapons at all** |

Weapon/head texture PNGs are byte-identical across the three weapon-bearing branches — art changes
are authored once and copied to each branch (adjusting the namespace directory for 1.19.2).

## Build & run

Forge 1.20.1 and 1.19.2 need **Java 17**; NeoForge 1.21.1 uses Java 21 (system default here):

```bash
JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home ./gradlew build      # release jar in build/libs/
JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home ./gradlew runClient  # dev client
```

- First run per branch does a long (10+ min) MCP/decompile setup; later runs take seconds.
- "build/resources/main is not a valid mod file" on launch → stale build dir: `./gradlew clean processResources`.
- No tests exist; verification is `build` + launching `runClient` and checking items in creative/JEI.
- On 1.19.2, most CurseMaven `fg.deobf` dev deps are commented out (ForgeGradle's local deobf breaks
  on them; none are compile deps). Only `create-planetary-tweaks` must stay enabled.

## Versioning

Single source of truth is `gradle.properties` on both Forge branches:
`mod_version` (+ `mc_version` on 1.19.2) → flows into the jar name and is expanded into
`META-INF/mods.toml` by `processResources`. Bump `mod_version` for a release; never hardcode
versions in `build.gradle` or `mods.toml`.

## Architecture notes

- **Pure resource-pack asset pattern** — textures are one hand-drawn PNG per metal, no tint/ItemColor
  code, no atlas configs. Item models reference them directly.
- Glaive/katana/mace use a 3-file Forge `separate_transforms` model chain per metal:
  `<metal>_<weapon>.json` (wrapper) → `..._gui.json` (16×16 GUI sprite) + `..._handheld.json`
  (32×32 in-hand sprite with custom display transforms). Hammer is a single flat 16×16 model.
  The wrapper's own `layer0` points at a model name, not a texture — vestigial, never rendered,
  harmless (inherited from upstream; don't "fix" it without reason).
  A missing `_handheld.json` renders the magenta missing-texture checker in hand while the GUI icon
  looks fine.
- Optional mod integrations are data-driven: recipes under `data/<other_mod_ns>/recipes/` guarded by
  `forge:mod_loaded` conditions, and `blue_skies:` tag entries marked `"required": false`. Metals map:
  zinc/brass→Create, steel→Create Alloyed, desh/calorite→Ad Astra, aquite/charoite/diopside/
  horizonite/pyrope→Blue Skies, plus `create_sa` (Create Stuff & Additions) recipe compat.
- In `mods.toml`, only `cp_tweaks` is mandatory (1.19.2 only); Create, Ad Astra, and Blue Skies are
  optional.

## History / provenance (context for asset work)

The original texture set was copied from Create Weaponry Enhanced (github.com/zachsai/Create_Weaponry_Enhanced;
this GitHub repo is a fork of zachsai's). In Aug 2026 all 317 copied/recolored PNGs were replaced with
generated original art on all three weapon branches (verified zero hash/silhouette matches). Model and
lang JSONs still mirror upstream structure. Keep any new art original — do not reintroduce upstream
textures.

## Releasing

Build the jar on the release branch, then upload via the CurseForge web UI, or the Upload API
(`POST https://minecraft.curseforge.com/api/projects/867626/upload-file`, `X-Api-Token` header).
Jar naming: `create_wt-forge-1.20.1-<ver>.jar` / `create_weaponry-<ver>-1.19.2.jar`.
