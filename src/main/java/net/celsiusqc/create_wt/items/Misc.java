package net.celsiusqc.create_wt.items;
import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Misc {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    public static final RegistryObject<Item> HANDLE= ITEMS.register("handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));


//    // Logo and Branding
//    public static final RegistryObject<Item> CREATE_PLANETARY_TWEAKS_LOGO = ITEMS.register("create_planetary_tweaks_logo",
//            () -> new Item(new Item.Properties()));
//
//    // Seasonal Items
//    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
//            () -> new Item(new Item.Properties()));
//
//    // Special Items with Tooltips
//    public static final RegistryObject<Item> VOID_WORM_GU = ITEMS.register("void_worm_gu",
//            () -> new TinyIronPickaxeTooltip(new Item.Properties()));


//    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
//            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD,
//                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
