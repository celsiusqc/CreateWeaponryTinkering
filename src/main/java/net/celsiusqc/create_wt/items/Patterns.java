package net.celsiusqc.create_wt.items;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Patterns {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    //Patterns

    public static final RegistryObject<Item> BLANK_PATTERN = ITEMS.register("blank_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PICKAXE_HEAD_PATTERN = ITEMS.register("pickaxe_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AXE_HEAD_PATTERN = ITEMS.register("axe_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWORD_HEAD_PATTERN = ITEMS.register("sword_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOVEL_HEAD_PATTERN = ITEMS.register("shovel_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOE_HEAD_PATTERN = ITEMS.register("hoe_head_pattern",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MACE_HEAD_PATTERN = ITEMS.register("mace_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KATANA_HEAD_PATTERN = ITEMS.register("katana_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAMMER_HEAD_PATTERN = ITEMS.register("hammer_head_pattern",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLAIVE_HEAD_PATTERN = ITEMS.register("glaive_head_pattern",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
