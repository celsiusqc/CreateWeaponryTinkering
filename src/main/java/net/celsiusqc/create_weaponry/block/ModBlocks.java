package net.celsiusqc.create_weaponry.block;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.fluid.ModFluids;
import net.celsiusqc.create_weaponry.item.ModCreativeModTab;
import net.celsiusqc.create_weaponry.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateWeaponry.MOD_ID);

// Molten Gold
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));

//Molten Iron
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Aquite
    public static final RegistryObject<LiquidBlock> MOLTEN_AQUITE_BLOCK = BLOCKS.register("molten_aquite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_AQUITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Charoite
    public static final RegistryObject<LiquidBlock> MOLTEN_CHAROITE_BLOCK = BLOCKS.register("molten_charoite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CHAROITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_DIOPSIDE_BLOCK = BLOCKS.register("molten_diopside_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIOPSIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PYROPE_BLOCK = BLOCKS.register("molten_pyrope_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_PYROPE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_FALSITE_BLOCK = BLOCKS.register("molten_falsite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_FALSITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_HORIZONITE_BLOCK = BLOCKS.register("molten_horizonite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_HORIZONITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_VENTIUM_BLOCK = BLOCKS.register("molten_ventium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_VENTIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = BLOCKS.register("molten_brass_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND_BLOCK = BLOCKS.register("molten_diamond_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIAMOND, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = BLOCKS.register("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_STEEL_BLOCK = BLOCKS.register("molten_steel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = BLOCKS.register("molten_zinc_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CALORITE_BLOCK = BLOCKS.register("molten_calorite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CALORITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_DESH_BLOCK = BLOCKS.register("molten_desh_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DESH, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_OSTRUM_BLOCK = BLOCKS.register("molten_ostrum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_OSTRUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}