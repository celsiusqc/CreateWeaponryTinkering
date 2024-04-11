package net.celsiusqc.create_wt.items.custom;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.custom.weapon_types.GlaiveItem;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Glaives {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Glaives

    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new GlaiveItem(Tiers.WOOD, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new GlaiveItem(Tiers.STONE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new GlaiveItem(Tiers.GOLD, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new GlaiveItem(Tiers.IRON, 3, -3.4f, 3.0f, props()));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new GlaiveItem(Tiers.DIAMOND, 3, -3.3f, 3.0f, props()));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () -> new GlaiveItem(Tiers.NETHERITE, 3, -3.3f, 3.0f, props()));
    public static final RegistryObject<Item> COPPER_GLAIVE = ITEMS.register("copper_glaive", () -> new GlaiveItem(ToolTiers.COPPER, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> HORIZONITE_GLAIVE = ITEMS.register("horizonite_glaive", () -> new GlaiveItem(ToolTiers.HORIZONITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> AQUITE_GLAIVE = ITEMS.register("aquite_glaive", () -> new GlaiveItem(ToolTiers.AQUITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> ZINC_GLAIVE = ITEMS.register("zinc_glaive", () -> new GlaiveItem(ToolTiers.ZINC, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> BRASS_GLAIVE = ITEMS.register("brass_glaive", () -> new GlaiveItem(ToolTiers.BRASS, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> STEEL_GLAIVE = ITEMS.register("steel_glaive", () -> new GlaiveItem(ToolTiers.STEEL, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> PYROPE_GLAIVE = ITEMS.register("pyrope_glaive", () -> new GlaiveItem(ToolTiers.PYROPE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> CHAROITE_GLAIVE = ITEMS.register("charoite_glaive", () -> new GlaiveItem(ToolTiers.CHAROITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> DIOPSIDE_GLAIVE = ITEMS.register("diopside_glaive", () -> new GlaiveItem(ToolTiers.DIOPSIDE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> DESH_GLAIVE = ITEMS.register("desh_glaive", () -> new GlaiveItem(ToolTiers.DESH, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> CALORITE_GLAIVE = ITEMS.register("calorite_glaive", () -> new GlaiveItem(ToolTiers.CALORITE, 3, -3.5f, 3.0f, props()));

    //Glaive Heads
    public static final RegistryObject<Item> GOLDEN_GLAIVE_HEAD = ITEMS.register("golden_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_GLAIVE_HEAD = ITEMS.register("iron_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GLAIVE_HEAD = ITEMS.register("diamond_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GLAIVE_HEAD = ITEMS.register("netherite_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_GLAIVE_HEAD = ITEMS.register("copper_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_GLAIVE_HEAD = ITEMS.register("horizonite_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_GLAIVE_HEAD = ITEMS.register("aquite_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_GLAIVE_HEAD = ITEMS.register("zinc_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_GLAIVE_HEAD = ITEMS.register("brass_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_GLAIVE_HEAD = ITEMS.register("steel_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_GLAIVE_HEAD = ITEMS.register("pyrope_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_GLAIVE_HEAD = ITEMS.register("charoite_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_GLAIVE_HEAD = ITEMS.register("diopside_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_GLAIVE_HEAD = ITEMS.register("desh_glaive_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_GLAIVE_HEAD = ITEMS.register("calorite_glaive_head", () -> new Item(new Item.Properties()));



    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
