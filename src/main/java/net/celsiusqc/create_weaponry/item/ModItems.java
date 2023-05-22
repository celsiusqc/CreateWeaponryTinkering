package net.celsiusqc.create_weaponry.item;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.fluid.ModFluids;
import net.celsiusqc.create_weaponry.item.custom.weapons.GlaiveItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.HammerItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.KatanaItem;
import net.celsiusqc.create_weaponry.item.custom.weapons.MaceItem;
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

    public static final RegistryObject<Item> WOODEN_MOUNTAIN_AXE = ITEMS.register("wooden_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_WOOD, 1, -2.8f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> STONE_MOUNTAIN_AXE = ITEMS.register("stone_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_STONE, 1, 2.8f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> IRON_MOUNTAIN_AXE = ITEMS.register("iron_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_IRON, 1, -2.8f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> GOLDEN_MOUNTAIN_AXE = ITEMS.register("golden_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_GOLD, 1, -2.8f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> DIAMOND_MOUNTAIN_AXE = ITEMS.register("diamond_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_DIAMOND, 1, -2.8f,
            new Item.Properties().tab(ModCreativeModTab.create_weaponry)));

    public static final RegistryObject<Item> NETHERITE_MOUNTAIN_AXE = ITEMS.register("netherite_mountain_axe", () -> new PickaxeItem(ModTiers.MOUNTAIN_NETHERITE, 1, -2.8f,
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

    public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SOAP_WATER,
                    new Item.Properties().tab(ModCreativeModTab.create_weaponry).craftRemainder(Items.BUCKET).stacksTo(1)));

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModTab.create_weaponry);
    }

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
