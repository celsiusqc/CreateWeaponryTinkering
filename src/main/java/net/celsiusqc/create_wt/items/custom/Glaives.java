package net.celsiusqc.create_wt.items.custom;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.custom.weapon_types.GlaiveItemType;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Glaives {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Glaive

    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new GlaiveItemType(Tiers.WOOD, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new GlaiveItemType(Tiers.STONE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new GlaiveItemType(Tiers.GOLD, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new GlaiveItemType(Tiers.IRON, 3, -3.4f, 3.0f, props()));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new GlaiveItemType(Tiers.DIAMOND, 3, -3.3f, 3.0f, props()));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () -> new GlaiveItemType(Tiers.NETHERITE, 3, -3.3f, 3.0f, props()));
    public static final RegistryObject<Item> COPPER_GLAIVE = ITEMS.register("copper_glaive", () -> new GlaiveItemType(ToolTiers.COPPER, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> HORIZONITE_GLAIVE = ITEMS.register("horizonite_glaive", () -> new GlaiveItemType(ToolTiers.HORIZONITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> AQUITE_GLAIVE = ITEMS.register("aquite_glaive", () -> new GlaiveItemType(ToolTiers.AQUITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> ZINC_GLAIVE = ITEMS.register("zinc_glaive", () -> new GlaiveItemType(ToolTiers.ZINC, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> BRASS_GLAIVE = ITEMS.register("brass_glaive", () -> new GlaiveItemType(ToolTiers.BRASS, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> STEEL_GLAIVE = ITEMS.register("steel_glaive", () -> new GlaiveItemType(ToolTiers.STEEL, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> PYROPE_GLAIVE = ITEMS.register("pyrope_glaive", () -> new GlaiveItemType(ToolTiers.PYROPE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> CHAROITE_GLAIVE = ITEMS.register("charoite_glaive", () -> new GlaiveItemType(ToolTiers.CHAROITE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> DIOPSIDE_GLAIVE = ITEMS.register("diopside_glaive", () -> new GlaiveItemType(ToolTiers.DIOPSIDE, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> DESH_GLAIVE = ITEMS.register("desh_glaive", () -> new GlaiveItemType(ToolTiers.DESH, 3, -3.5f, 3.0f, props()));
    public static final RegistryObject<Item> CALORITE_GLAIVE = ITEMS.register("calorite_glaive", () -> new GlaiveItemType(ToolTiers.CALORITE, 3, -3.5f, 3.0f, props()));

    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
