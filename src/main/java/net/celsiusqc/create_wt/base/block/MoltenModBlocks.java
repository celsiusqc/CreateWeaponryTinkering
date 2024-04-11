package net.celsiusqc.create_wt.base.block;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.fluid.ModFluids;
import net.celsiusqc.create_wt.items.Misc;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MoltenModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateWeaponryTinkering.MOD_ID);

    // Molten Material Blocks

    // Molten Gold
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Iron
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Aquite
    public static final RegistryObject<LiquidBlock> MOLTEN_AQUITE_BLOCK = BLOCKS.register("molten_aquite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_AQUITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Charoite
    public static final RegistryObject<LiquidBlock> MOLTEN_CHAROITE_BLOCK = BLOCKS.register("molten_charoite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CHAROITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Diopside
    public static final RegistryObject<LiquidBlock> MOLTEN_DIOPSIDE_BLOCK = BLOCKS.register("molten_diopside_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIOPSIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Pyrope
    public static final RegistryObject<LiquidBlock> MOLTEN_PYROPE_BLOCK = BLOCKS.register("molten_pyrope_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_PYROPE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Horizonite
    public static final RegistryObject<LiquidBlock> MOLTEN_HORIZONITE_BLOCK = BLOCKS.register("molten_horizonite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_HORIZONITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Brass
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = BLOCKS.register("molten_brass_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Copper
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Diamond
    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND_BLOCK = BLOCKS.register("molten_diamond_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIAMOND, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Netherite
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = BLOCKS.register("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Steel
    public static final RegistryObject<LiquidBlock> MOLTEN_STEEL_BLOCK = BLOCKS.register("molten_steel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Zinc
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = BLOCKS.register("molten_zinc_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Calorite
    public static final RegistryObject<LiquidBlock> MOLTEN_CALORITE_BLOCK = BLOCKS.register("molten_calorite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CALORITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    // Molten Desh
    public static final RegistryObject<LiquidBlock> MOLTEN_DESH_BLOCK = BLOCKS.register("molten_desh_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DESH, BlockBehaviour.Properties.copy(Blocks.LAVA)));









    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Misc.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
