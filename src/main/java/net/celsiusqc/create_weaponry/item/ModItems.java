package net.celsiusqc.create_weaponry.item;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.fluid.ModFluids;
import net.celsiusqc.create_weaponry.item.custom.weapons.GlaiveItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.HammerItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.KatanaItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.MaceItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponry.MOD_ID);

    //TOOLS                                                                                                                            attack      speed

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", () -> new HammerItem(Tiers.WOOD, 7, -3.4f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", () -> new HammerItem(Tiers.STONE, 7, -3.4f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(Tiers.IRON, 7, -3.4f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer", () -> new HammerItem(Tiers.GOLD, 7, -3.3f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(Tiers.DIAMOND, 7, -3.2f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(Tiers.NETHERITE, 7, -3.2f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new GlaiveItem(Tiers.WOOD, 3, -3.5f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new GlaiveItem(Tiers.STONE, 3, -3.5f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new GlaiveItem(Tiers.GOLD, 3, -3.5f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new GlaiveItem(Tiers.IRON, 3, -3.4f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new GlaiveItem(Tiers.DIAMOND, 3, -3.3f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () -> new GlaiveItem(Tiers.NETHERITE, 3, -3.3f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () -> new KatanaItem(Tiers.WOOD, 2, -2.9f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () -> new KatanaItem(Tiers.STONE, 2, -2.9f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () -> new KatanaItem(Tiers.GOLD, 2, -2.9f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new KatanaItem(Tiers.IRON, 2, -2.8f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () -> new KatanaItem(Tiers.DIAMOND, 2, -2.7f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () -> new KatanaItem(Tiers.NETHERITE, 2, -2.7f, 3.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> WOODEN_MACE = ITEMS.register("wooden_mace", () -> new MaceItem(Tiers.WOOD, 1, -3.4f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> STONE_MACE = ITEMS.register("stone_mace", () -> new MaceItem(Tiers.STONE, 1, -3.4f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> GOLDEN_MACE = ITEMS.register("golden_mace", () -> new MaceItem(Tiers.GOLD, 1, -3.4f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new MaceItem(Tiers.IRON, 1, -3.3f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new MaceItem(Tiers.DIAMOND, 1, -3.2f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> NETHERITE_MACE = ITEMS.register("netherite_mace", () -> new MaceItem(Tiers.NETHERITE, 1, -3.2f, 2.0f, 2.0f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    //Iron Buckets

        //Molten Gold
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));

        //Molten Iron
    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
        //Molten Aquite
        public static final RegistryObject<Item> MOLTEN_AQUITE_BUCKET = ITEMS.register("molten_aquite_bucket",
                () -> new BucketItem(ModFluids.SOURCE_MOLTEN_AQUITE,
                        new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    //Molten Aquite
    public static final RegistryObject<Item> MOLTEN_CHAROITE_BUCKET = ITEMS.register("molten_charoite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_CHAROITE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_DIOPSIDE_BUCKET = ITEMS.register("molten_diopside_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIOPSIDE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_PYROPE_BUCKET = ITEMS.register("molten_pyrope_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_PYROPE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_FALSITE_BUCKET = ITEMS.register("molten_falsite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_FALSITE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_HORIZONITE_BUCKET = ITEMS.register("molten_horizonite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_HORIZONITE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_VENTIUM_BUCKET = ITEMS.register("molten_ventium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_VENTIUM,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_BRASS,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_DIAMOND_BUCKET = ITEMS.register("molten_diamond_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIAMOND,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_NETHERITE_BUCKET = ITEMS.register("molten_netherite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NETHERITE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_STEEL_BUCKET = ITEMS.register("molten_steel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_STEEL,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ZINC,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_CALORITE_BUCKET = ITEMS.register("molten_calorite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_CALORITE,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_DESH_BUCKET = ITEMS.register("molten_desh_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DESH,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_OSTRUM_BUCKET = ITEMS.register("molten_ostrum_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_OSTRUM,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));


    //Patterns

    public static final RegistryObject<Item> STONE_PATTERN = ITEMS.register("stone_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    //Casts
    public static final RegistryObject<Item> PICKAXE_HEAD_SAND_CAST = ITEMS.register("pickaxe_head_sand_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> AXE_HEAD_SAND_CAST = ITEMS.register("axe_head_sand_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> SWORD_HEAD_SAND_CAST = ITEMS.register("sword_head_sand_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> SHOVEL_HEAD_SAND_CAST = ITEMS.register("shovel_head_sand_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> HOE_HEAD_SAND_CAST = ITEMS.register("hoe_head_sand_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> PICKAXE_HEAD_GOLD_CAST = ITEMS.register("pickaxe_head_gold_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> AXE_HEAD_GOLD_CAST = ITEMS.register("axe_head_gold_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> SWORD_HEAD_GOLD_CAST = ITEMS.register("sword_head_gold_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> SHOVEL_HEAD_GOLD_CAST = ITEMS.register("shovel_head_gold_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> HOE_HEAD_GOLD_CAST = ITEMS.register("hoe_head_gold_cast",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));


        //Heads

    //Stone
    public static final RegistryObject<Item> STONE_AXE_HEAD= ITEMS.register("stone_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> STONE_HOE_HEAD= ITEMS.register("stone_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> STONE_PICKAXE_HEAD= ITEMS.register("stone_pickaxe_head",
                () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> STONE_SHOVEL_HEAD= ITEMS.register("stone_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> STONE_SWORD_HEAD= ITEMS.register("stone_sword_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    //Iron
    public static final RegistryObject<Item> IRON_AXE_HEAD= ITEMS.register("iron_axe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> IRON_HOE_HEAD= ITEMS.register("iron_hoe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD= ITEMS.register("iron_pickaxe_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD= ITEMS.register("iron_shovel_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));
    public static final RegistryObject<Item> IRON_SWORD_HEAD= ITEMS.register("iron_sword_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.create_weaponry)));




    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModTab.create_weaponry);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
