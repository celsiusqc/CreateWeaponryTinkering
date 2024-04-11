package net.celsiusqc.create_wt.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CreateWeaponryTinkeringConfig {
    public static ForgeConfigSpec.BooleanValue enableTinyTools;
    public static ForgeConfigSpec.BooleanValue enableGlaives;
    public static ForgeConfigSpec.BooleanValue enableHammers;
    public static ForgeConfigSpec.BooleanValue enableKatanas;
    public static ForgeConfigSpec.BooleanValue enableMaces;
    public static ForgeConfigSpec.BooleanValue enableVanillaRecipeOverwrite;

    public static final ForgeConfigSpec CONFIG;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        enableTinyTools = builder
                .comment("Should Tiny Tools be enabled?")
                .define("items.enableTinyTools", true);

        enableGlaives = builder
                .comment("Should Glaives be enabled?")
                .define("items.enableGlaives", true);

        enableHammers = builder
                .comment("Should Hammers be enabled?")
                .define("items.enableHammers", true);

        enableKatanas = builder
                .comment("Should Katanas be enabled?")
                .define("items.enableKatanas", true);

        enableMaces = builder
                .comment("Should Maces be enabled?")
                .define("items.enableMaces", true);

        enableVanillaRecipeOverwrite = builder
                .comment("Should Vanilla Tool (Axes, Swords, Iron Pickaxe, etc) recipes be overwritten to use the Molten Fluid system and Heads crafting system? If turned on, the only way to progress is with Tiny Pickaxe system.")
                .define("items.enableVanillaRecipeOverwrite", true);

        CONFIG = builder.build();
    }
}

