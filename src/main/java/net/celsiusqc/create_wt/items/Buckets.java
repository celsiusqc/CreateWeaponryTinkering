package net.celsiusqc.create_wt.items;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Buckets {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    // Molten Material Buckets

    // Molten Gold
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Iron
    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Aquite
    public static final RegistryObject<Item> MOLTEN_AQUITE_BUCKET = ITEMS.register("molten_aquite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_AQUITE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Charoite
    public static final RegistryObject<Item> MOLTEN_CHAROITE_BUCKET = ITEMS.register("molten_charoite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_CHAROITE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Diopside
    public static final RegistryObject<Item> MOLTEN_DIOPSIDE_BUCKET = ITEMS.register("molten_diopside_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIOPSIDE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Pyrope
    public static final RegistryObject<Item> MOLTEN_PYROPE_BUCKET = ITEMS.register("molten_pyrope_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_PYROPE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Horizonite
    public static final RegistryObject<Item> MOLTEN_HORIZONITE_BUCKET = ITEMS.register("molten_horizonite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_HORIZONITE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Brass
    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_BRASS,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Copper
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Diamond
    public static final RegistryObject<Item> MOLTEN_DIAMOND_BUCKET = ITEMS.register("molten_diamond_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIAMOND,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Netherite
    public static final RegistryObject<Item> MOLTEN_NETHERITE_BUCKET = ITEMS.register("molten_netherite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NETHERITE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Steel
    public static final RegistryObject<Item> MOLTEN_STEEL_BUCKET = ITEMS.register("molten_steel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_STEEL,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Zinc
    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ZINC,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Calorite
    public static final RegistryObject<Item> MOLTEN_CALORITE_BUCKET = ITEMS.register("molten_calorite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_CALORITE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Molten Desh
    public static final RegistryObject<Item> MOLTEN_DESH_BUCKET = ITEMS.register("molten_desh_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DESH,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
