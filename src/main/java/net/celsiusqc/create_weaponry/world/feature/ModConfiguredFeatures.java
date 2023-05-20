package net.celsiusqc.create_weaponry.world.feature;

import com.google.common.base.Suppliers;
import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, CreateWeaponry.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_OCEANIC_REMAINS = Suppliers.memoize(() -> List.of(
            //OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.OCEANIC_REMAINS.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.OCEANIC_REMAINS.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OCEANIC_REMAINS = CONFIGURED_FEATURES.register("oceanic_remains",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_OCEANIC_REMAINS.get(),4)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SHELL = CONFIGURED_FEATURES.register("shell",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SHELL.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ROCKS = CONFIGURED_FEATURES.register("rocks",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SHELL.get()))))));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
