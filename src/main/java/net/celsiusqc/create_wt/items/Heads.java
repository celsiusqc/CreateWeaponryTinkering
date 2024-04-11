package net.celsiusqc.create_wt.items;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Heads {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);


    //Heads

    //Iron
    public static final RegistryObject<Item> IRON_AXE_HEAD= ITEMS.register("iron_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_HOE_HEAD= ITEMS.register("iron_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD= ITEMS.register("iron_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD= ITEMS.register("iron_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SWORD_HEAD= ITEMS.register("iron_sword_head",
            () -> new Item(new Item.Properties()));

    //Diamond
    public static final RegistryObject<Item> DIAMOND_AXE_HEAD= ITEMS.register("diamond_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HOE_HEAD= ITEMS.register("diamond_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_HEAD= ITEMS.register("diamond_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_HEAD= ITEMS.register("diamond_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SWORD_HEAD= ITEMS.register("diamond_sword_head",
            () -> new Item(new Item.Properties()));

    //Netherite
    public static final RegistryObject<Item> NETHERITE_AXE_HEAD= ITEMS.register("netherite_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HOE_HEAD= ITEMS.register("netherite_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PICKAXE_HEAD= ITEMS.register("netherite_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_HEAD= ITEMS.register("netherite_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SWORD_HEAD= ITEMS.register("netherite_sword_head",
            () -> new Item(new Item.Properties()));
    //Gold
    public static final RegistryObject<Item> GOLDEN_AXE_HEAD= ITEMS.register("golden_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HOE_HEAD= ITEMS.register("golden_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_HEAD= ITEMS.register("golden_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_HEAD= ITEMS.register("golden_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SWORD_HEAD= ITEMS.register("golden_sword_head",
            () -> new Item(new Item.Properties()));
    //Copper
    public static final RegistryObject<Item> COPPER_AXE_HEAD= ITEMS.register("copper_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE_HEAD= ITEMS.register("copper_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE_HEAD= ITEMS.register("copper_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL_HEAD= ITEMS.register("copper_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SWORD_HEAD= ITEMS.register("copper_sword_head",
            () -> new Item(new Item.Properties()));

//Blue Skies
    //Aquite
    public static final RegistryObject<Item> AQUITE_AXE_HEAD= ITEMS.register("aquite_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_HOE_HEAD= ITEMS.register("aquite_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_PICKAXE_HEAD= ITEMS.register("aquite_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_SHOVEL_HEAD= ITEMS.register("aquite_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUITE_SWORD_HEAD= ITEMS.register("aquite_sword_head",
            () -> new Item(new Item.Properties()));

    //Charoite
    public static final RegistryObject<Item> CHAROITE_AXE_HEAD= ITEMS.register("charoite_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_HOE_HEAD= ITEMS.register("charoite_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_PICKAXE_HEAD= ITEMS.register("charoite_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_SHOVEL_HEAD= ITEMS.register("charoite_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAROITE_SWORD_HEAD= ITEMS.register("charoite_sword_head",
            () -> new Item(new Item.Properties()));

    //Diopside
    public static final RegistryObject<Item> DIOPSIDE_AXE_HEAD= ITEMS.register("diopside_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_HOE_HEAD= ITEMS.register("diopside_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_PICKAXE_HEAD= ITEMS.register("diopside_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_SHOVEL_HEAD= ITEMS.register("diopside_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIOPSIDE_SWORD_HEAD= ITEMS.register("diopside_sword_head",
            () -> new Item(new Item.Properties()));

    //Horizonite
    public static final RegistryObject<Item> HORIZONITE_AXE_HEAD= ITEMS.register("horizonite_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_HOE_HEAD= ITEMS.register("horizonite_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_PICKAXE_HEAD= ITEMS.register("horizonite_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_SHOVEL_HEAD= ITEMS.register("horizonite_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIZONITE_SWORD_HEAD= ITEMS.register("horizonite_sword_head",
            () -> new Item(new Item.Properties()));

    //Pyrope
    public static final RegistryObject<Item> PYROPE_AXE_HEAD= ITEMS.register("pyrope_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_HOE_HEAD= ITEMS.register("pyrope_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_PICKAXE_HEAD= ITEMS.register("pyrope_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_SHOVEL_HEAD= ITEMS.register("pyrope_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROPE_SWORD_HEAD= ITEMS.register("pyrope_sword_head",
            () -> new Item(new Item.Properties()));

//Create
    //Zinc
    public static final RegistryObject<Item> ZINC_AXE_HEAD= ITEMS.register("zinc_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HOE_HEAD= ITEMS.register("zinc_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_PICKAXE_HEAD= ITEMS.register("zinc_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SHOVEL_HEAD= ITEMS.register("zinc_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SWORD_HEAD= ITEMS.register("zinc_sword_head",
            () -> new Item(new Item.Properties()));
    //Brass
    public static final RegistryObject<Item> BRASS_AXE_HEAD= ITEMS.register("brass_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HOE_HEAD= ITEMS.register("brass_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_PICKAXE_HEAD= ITEMS.register("brass_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SHOVEL_HEAD= ITEMS.register("brass_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SWORD_HEAD= ITEMS.register("brass_sword_head",
            () -> new Item(new Item.Properties()));

//Ad Astra
    //Steel
    public static final RegistryObject<Item> STEEL_AXE_HEAD= ITEMS.register("steel_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE_HEAD= ITEMS.register("steel_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE_HEAD= ITEMS.register("steel_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL_HEAD= ITEMS.register("steel_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SWORD_HEAD= ITEMS.register("steel_sword_head",
            () -> new Item(new Item.Properties()));
    //Desh
    public static final RegistryObject<Item> DESH_AXE_HEAD= ITEMS.register("desh_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_HOE_HEAD= ITEMS.register("desh_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_PICKAXE_HEAD= ITEMS.register("desh_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_SHOVEL_HEAD= ITEMS.register("desh_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESH_SWORD_HEAD= ITEMS.register("desh_sword_head",
            () -> new Item(new Item.Properties()));
    //Calorite
    public static final RegistryObject<Item> CALORITE_AXE_HEAD= ITEMS.register("calorite_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_HOE_HEAD= ITEMS.register("calorite_hoe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_PICKAXE_HEAD= ITEMS.register("calorite_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_SHOVEL_HEAD= ITEMS.register("calorite_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALORITE_SWORD_HEAD= ITEMS.register("calorite_sword_head",
            () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
