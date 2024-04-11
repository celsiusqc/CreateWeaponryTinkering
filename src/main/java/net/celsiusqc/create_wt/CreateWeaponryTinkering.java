package net.celsiusqc.create_wt;

import net.celsiusqc.create_wt.base.block.MoltenModBlocks;
import net.celsiusqc.create_wt.fluid.ModFluidTypes;
import net.celsiusqc.create_wt.fluid.ModFluids;
import net.celsiusqc.create_wt.items.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateWeaponryTinkering.MOD_ID)
public class CreateWeaponryTinkering {


    public static final String MOD_ID = "create_wt";
    public static final String ARMOR_DIR = MOD_ID + ":textures/models/armor/";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public CreateWeaponryTinkering() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        net.celsiusqc.create_wt.items.ModCreativeModTab.register(modEventBus);
        modEventBus.addListener(this::setup);
        MoltenModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        Misc.register(modEventBus);
        Buckets.register(modEventBus);
        Heads.register(modEventBus);
        Patterns.register(modEventBus);
        TinyTools.register(modEventBus);




        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }



    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void setup(final FMLCommonSetupEvent event) {
        // existing common setup...

        // additional setup, if any...
    }


    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}