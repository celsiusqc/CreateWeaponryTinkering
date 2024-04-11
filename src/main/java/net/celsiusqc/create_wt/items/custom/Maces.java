package net.celsiusqc.create_wt.items.custom;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.custom.weapon_types.GlaiveItem;
import net.celsiusqc.create_wt.items.custom.weapon_types.MaceItem;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Maces {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Maces
    public static final RegistryObject<Item> WOODEN_MACE = ITEMS.register("wooden_mace", () -> new MaceItem(Tiers.WOOD, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> STONE_MACE = ITEMS.register("stone_mace", () -> new MaceItem(Tiers.STONE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> GOLDEN_MACE = ITEMS.register("golden_mace", () -> new MaceItem(Tiers.GOLD, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new MaceItem(Tiers.IRON, 1, -3.3f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new MaceItem(Tiers.DIAMOND, 1, -3.2f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> NETHERITE_MACE = ITEMS.register("netherite_mace", () -> new MaceItem(Tiers.NETHERITE, 1, -3.2f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> COPPER_MACE = ITEMS.register("copper_mace", () -> new MaceItem(ToolTiers.COPPER, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> HORIZONITE_MACE = ITEMS.register("horizonite_mace", () -> new MaceItem(ToolTiers.HORIZONITE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> AQUITE_MACE = ITEMS.register("aquite_mace", () -> new MaceItem(ToolTiers.AQUITE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> ZINC_MACE = ITEMS.register("zinc_mace", () -> new MaceItem(ToolTiers.ZINC, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> BRASS_MACE = ITEMS.register("brass_mace", () -> new MaceItem(ToolTiers.BRASS, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> STEEL_MACE = ITEMS.register("steel_mace", () -> new MaceItem(ToolTiers.STEEL, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> PYROPE_MACE = ITEMS.register("pyrope_mace", () -> new MaceItem(ToolTiers.PYROPE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> CHAROITE_MACE = ITEMS.register("charoite_mace", () -> new MaceItem(ToolTiers.CHAROITE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> DIOPSIDE_MACE = ITEMS.register("diopside_mace", () -> new MaceItem(ToolTiers.DIOPSIDE, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> DESH_MACE = ITEMS.register("desh_mace", () -> new MaceItem(ToolTiers.DESH, 1, -3.4f, 2.0f, 2.0f, props()));
    public static final RegistryObject<Item> CALORITE_MACE = ITEMS.register("calorite_mace", () -> new MaceItem(ToolTiers.CALORITE, 1, -3.4f, 2.0f, 2.0f, props()));
    //Mace Heads
    public static final RegistryObject<Item> GOLDEN_MACE_HEAD = ITEMS.register("golden_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_MACE_HEAD = ITEMS.register("iron_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_MACE_HEAD = ITEMS.register("diamond_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MACE_HEAD = ITEMS.register("netherite_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_MACE_HEAD = ITEMS.register("copper_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_MACE_HEAD = ITEMS.register("horizonite_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_MACE_HEAD = ITEMS.register("aquite_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_MACE_HEAD = ITEMS.register("zinc_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_MACE_HEAD = ITEMS.register("brass_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_MACE_HEAD = ITEMS.register("steel_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_MACE_HEAD = ITEMS.register("pyrope_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_MACE_HEAD = ITEMS.register("charoite_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_MACE_HEAD = ITEMS.register("diopside_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_MACE_HEAD = ITEMS.register("desh_mace_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_MACE_HEAD = ITEMS.register("calorite_mace_head", () -> new Item(new Item.Properties()));



    private static Item.Properties props() {
        return new Item.Properties();
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
