package net.celsiusqc.create_weaponry.fluid;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.block.ModBlocks;
import net.celsiusqc.create_weaponry.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateWeaponry.MOD_ID);

    //Molten Gold
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(ModItems.MOLTEN_GOLD_BUCKET);

    //Molten Iron

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_iron_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}