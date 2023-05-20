package net.celsiusqc.create_weaponry.block.entity;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.block.ModBlocks;
import net.celsiusqc.create_weaponry.block.entity.custom.BrushingBlockEntity;
import net.celsiusqc.create_weaponry.block.entity.custom.ForgeBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateWeaponry.MOD_ID);

    public static final RegistryObject<BlockEntityType<BrushingBlockEntity>> BRUSHING_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("brushing_block_entity", () ->
                    BlockEntityType.Builder.of(BrushingBlockEntity::new,
                            ModBlocks.SUSPICIOUS_DIRT.get(), ModBlocks.SUSPICIOUS_SAND.get(),
                            ModBlocks.SUSPICIOUS_GRAVEL.get(), ModBlocks.SUSPICIOUS_STONE.get()).build(null));

    public static final RegistryObject<BlockEntityType<ForgeBlockEntity>> FORGE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("forge_block_entity", () ->
                    BlockEntityType.Builder.of(ForgeBlockEntity::new,
                            ModBlocks.FORGE.get()).build(null));




    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}