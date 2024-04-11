package net.celsiusqc.create_wt.items.custom;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.custom.weapon_types.GlaiveItem;
import net.celsiusqc.create_wt.items.custom.weapon_types.HammerItem;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Hammers {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Hammers
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", () -> new HammerItem(Tiers.WOOD, 7, -3.4f, props()));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", () -> new HammerItem(Tiers.STONE, 7, -3.4f, props()));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(Tiers.IRON, 7, -3.4f, props()));
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer", () -> new HammerItem(Tiers.GOLD, 7, -3.3f, props()));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(Tiers.DIAMOND, 7, -3.2f, props()));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(Tiers.NETHERITE, 7, -3.2f, props()));
    public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register("copper_hammer", () -> new HammerItem(ToolTiers.COPPER, 7, -3.2f, props()));
    public static final RegistryObject<Item> AQUITE_HAMMER = ITEMS.register("aquite_hammer", () -> new HammerItem(ToolTiers.AQUITE, 7, -3.2f, props()));
    public static final RegistryObject<Item> ZINC_HAMMER = ITEMS.register("zinc_hammer", () -> new HammerItem(ToolTiers.ZINC, 7, -3.2f, props()));
    public static final RegistryObject<Item> BRASS_HAMMER = ITEMS.register("brass_hammer", () -> new HammerItem(ToolTiers.BRASS, 7, -3.2f, props()));
    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register("steel_hammer", () -> new HammerItem(ToolTiers.STEEL, 7, -3.2f, props()));
    public static final RegistryObject<Item> PYROPE_HAMMER = ITEMS.register("pyrope_hammer", () -> new HammerItem(ToolTiers.PYROPE, 7, -3.3f, props()));
    public static final RegistryObject<Item> HORIZONITE_HAMMER = ITEMS.register("horizonite_hammer", () -> new HammerItem(ToolTiers.HORIZONITE, 7, -3.4f, props()));
    public static final RegistryObject<Item> CHAROITE_HAMMER = ITEMS.register("charoite_hammer", () -> new HammerItem(ToolTiers.CHAROITE, 7, -3.2f, props()));
    public static final RegistryObject<Item> DIOPSIDE_HAMMER = ITEMS.register("diopside_hammer", () -> new HammerItem(ToolTiers.DIOPSIDE, 7, -3.2f, props()));
    public static final RegistryObject<Item> DESH_HAMMER = ITEMS.register("desh_hammer", () -> new HammerItem(ToolTiers.DESH, 7, -3.2f, props()));
    public static final RegistryObject<Item> CALORITE_HAMMER = ITEMS.register("calorite_hammer", () -> new HammerItem(ToolTiers.CALORITE, 7, -3.2f, props()));
    //Hammer Head
    public static final RegistryObject<Item> GOLDEN_HAMMER_HEAD = ITEMS.register("golden_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_HAMMER_HEAD = ITEMS.register("iron_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HAMMER_HEAD = ITEMS.register("diamond_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HAMMER_HEAD = ITEMS.register("netherite_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HAMMER_HEAD = ITEMS.register("copper_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_HAMMER_HEAD = ITEMS.register("horizonite_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_HAMMER_HEAD = ITEMS.register("aquite_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HAMMER_HEAD = ITEMS.register("zinc_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HAMMER_HEAD = ITEMS.register("brass_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HAMMER_HEAD = ITEMS.register("steel_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_HAMMER_HEAD = ITEMS.register("pyrope_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_HAMMER_HEAD = ITEMS.register("charoite_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_HAMMER_HEAD = ITEMS.register("diopside_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_HAMMER_HEAD = ITEMS.register("desh_hammer_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_HAMMER_HEAD = ITEMS.register("calorite_hammer_head", () -> new Item(new Item.Properties()));



    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
