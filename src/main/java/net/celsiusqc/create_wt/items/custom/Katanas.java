package net.celsiusqc.create_wt.items.custom;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.custom.weapon_types.KatanaItem;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Katanas {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Katanas
    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () -> new KatanaItem(Tiers.WOOD, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () -> new KatanaItem(Tiers.STONE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () -> new KatanaItem(Tiers.GOLD, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new KatanaItem(Tiers.IRON, 2, -2.8f, 3.0f, props()));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () -> new KatanaItem(Tiers.DIAMOND, 2, -2.7f, 3.0f, props()));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () -> new KatanaItem(Tiers.NETHERITE, 2, -2.7f, 3.0f, props()));
    public static final RegistryObject<Item> COPPER_KATANA = ITEMS.register("copper_katana", () -> new KatanaItem(ToolTiers.COPPER, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> HORIZONITE_KATANA = ITEMS.register("horizonite_katana", () -> new KatanaItem(ToolTiers.HORIZONITE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> AQUITE_KATANA = ITEMS.register("aquite_katana", () -> new KatanaItem(ToolTiers.AQUITE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> ZINC_KATANA = ITEMS.register("zinc_katana", () -> new KatanaItem(ToolTiers.ZINC, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> BRASS_KATANA = ITEMS.register("brass_katana", () -> new KatanaItem(ToolTiers.BRASS, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> STEEL_KATANA = ITEMS.register("steel_katana", () -> new KatanaItem(ToolTiers.STEEL, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> PYROPE_KATANA = ITEMS.register("pyrope_katana", () -> new KatanaItem(ToolTiers.PYROPE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> CHAROITE_KATANA = ITEMS.register("charoite_katana", () -> new KatanaItem(ToolTiers.CHAROITE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> DIOPSIDE_KATANA = ITEMS.register("diopside_katana", () -> new KatanaItem(ToolTiers.DIOPSIDE, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> DESH_KATANA = ITEMS.register("desh_katana", () -> new KatanaItem(ToolTiers.DESH, 2, -2.9f, 3.0f, props()));
    public static final RegistryObject<Item> CALORITE_KATANA = ITEMS.register("calorite_katana", () -> new KatanaItem(ToolTiers.CALORITE, 2, -2.9f, 3.0f, props()));

    // Katana Heads
    public static final RegistryObject<Item> GOLDEN_KATANA_HEAD = ITEMS.register("golden_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_KATANA_HEAD = ITEMS.register("iron_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_KATANA_HEAD = ITEMS.register("diamond_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_KATANA_HEAD = ITEMS.register("netherite_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_KATANA_HEAD = ITEMS.register("copper_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_KATANA_HEAD = ITEMS.register("horizonite_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_KATANA_HEAD = ITEMS.register("aquite_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_KATANA_HEAD = ITEMS.register("zinc_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_KATANA_HEAD = ITEMS.register("brass_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_KATANA_HEAD = ITEMS.register("steel_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_KATANA_HEAD = ITEMS.register("pyrope_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_KATANA_HEAD = ITEMS.register("charoite_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_KATANA_HEAD = ITEMS.register("diopside_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_KATANA_HEAD = ITEMS.register("desh_katana_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_KATANA_HEAD = ITEMS.register("calorite_katana_head", () -> new Item(new Item.Properties()));

    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
