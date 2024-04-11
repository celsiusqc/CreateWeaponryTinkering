package net.celsiusqc.create_wt.fluid;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.base.block.MoltenModBlocks;
import net.celsiusqc.create_wt.items.Buckets;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateWeaponryTinkering.MOD_ID);


    //Molten Gold
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(Buckets.MOLTEN_GOLD_BUCKET);

    //Molten Iron
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(Buckets.MOLTEN_IRON_BUCKET);
    //Molten Aquite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_AQUITE = FLUIDS.register("molten_aquite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_AQUITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_AQUITE = FLUIDS.register("flowing_molten_aquite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_AQUITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_AQUITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_AQUITE_TYPE, SOURCE_MOLTEN_AQUITE, FLOWING_MOLTEN_AQUITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_AQUITE_BLOCK)
            .bucket(Buckets.MOLTEN_AQUITE_BUCKET);
    //Molten Charoite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHAROITE = FLUIDS.register("molten_charoite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CHAROITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHAROITE = FLUIDS.register("flowing_molten_charoite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CHAROITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_CHAROITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_CHAROITE_TYPE, SOURCE_MOLTEN_CHAROITE, FLOWING_MOLTEN_CHAROITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_CHAROITE_BLOCK)
            .bucket(Buckets.MOLTEN_CHAROITE_BUCKET);
    //Molten diopside
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DIOPSIDE = FLUIDS.register("molten_diopside",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DIOPSIDE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DIOPSIDE = FLUIDS.register("flowing_molten_diopside",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DIOPSIDE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_DIOPSIDE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DIOPSIDE_TYPE, SOURCE_MOLTEN_DIOPSIDE, FLOWING_MOLTEN_DIOPSIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_DIOPSIDE_BLOCK)
            .bucket(Buckets.MOLTEN_DIOPSIDE_BUCKET);
    //Molten pyrope
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PYROPE = FLUIDS.register("molten_pyrope",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_PYROPE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PYROPE = FLUIDS.register("flowing_molten_pyrope",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_PYROPE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_PYROPE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_PYROPE_TYPE, SOURCE_MOLTEN_PYROPE, FLOWING_MOLTEN_PYROPE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_PYROPE_BLOCK)
            .bucket(Buckets.MOLTEN_PYROPE_BUCKET);


    //Molten Horizonite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_HORIZONITE = FLUIDS.register("molten_horizonite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_HORIZONITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_HORIZONITE = FLUIDS.register("flowing_molten_horizonite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_HORIZONITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_HORIZONITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_HORIZONITE_TYPE, SOURCE_MOLTEN_HORIZONITE, FLOWING_MOLTEN_HORIZONITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_HORIZONITE_BLOCK)
            .bucket(Buckets.MOLTEN_HORIZONITE_BUCKET);


    //Molten Brass
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRASS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_BRASS_TYPE, SOURCE_MOLTEN_BRASS, FLOWING_MOLTEN_BRASS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_BRASS_BLOCK)
            .bucket(Buckets.MOLTEN_BRASS_BUCKET);

    //Molten Copper
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_COPPER_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(Buckets.MOLTEN_COPPER_BUCKET);

    //Molten Diamond
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DIAMOND = FLUIDS.register("molten_diamond",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DIAMOND_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DIAMOND = FLUIDS.register("flowing_molten_diamond",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DIAMOND_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_DIAMOND_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DIAMOND_TYPE, SOURCE_MOLTEN_DIAMOND, FLOWING_MOLTEN_DIAMOND)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_DIAMOND_BLOCK)
            .bucket(Buckets.MOLTEN_DIAMOND_BUCKET);

    //Molten Netherite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NETHERITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NETHERITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_NETHERITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NETHERITE_TYPE, SOURCE_MOLTEN_NETHERITE, FLOWING_MOLTEN_NETHERITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_NETHERITE_BLOCK)
            .bucket(Buckets.MOLTEN_NETHERITE_BUCKET);

    //Molten Steel
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STEEL = FLUIDS.register("molten_steel",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STEEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STEEL = FLUIDS.register("flowing_molten_steel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STEEL_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_STEEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_STEEL_TYPE, SOURCE_MOLTEN_STEEL, FLOWING_MOLTEN_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_STEEL_BLOCK)
            .bucket(Buckets.MOLTEN_STEEL_BUCKET);

    //Molten Steel
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ZINC_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ZINC_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_ZINC_BLOCK)
            .bucket(Buckets.MOLTEN_ZINC_BUCKET);

    //Molten Calorite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CALORITE = FLUIDS.register("molten_calorite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CALORITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CALORITE = FLUIDS.register("flowing_molten_calorite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CALORITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_CALORITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_CALORITE_TYPE, SOURCE_MOLTEN_CALORITE, FLOWING_MOLTEN_CALORITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_CALORITE_BLOCK)
            .bucket(Buckets.MOLTEN_CALORITE_BUCKET);

    //Molten Desh
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DESH = FLUIDS.register("molten_desh",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DESH_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DESH = FLUIDS.register("flowing_molten_desh",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DESH_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_DESH_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DESH_TYPE, SOURCE_MOLTEN_DESH, FLOWING_MOLTEN_DESH)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(MoltenModBlocks.MOLTEN_DESH_BLOCK)
            .bucket(Buckets.MOLTEN_DESH_BUCKET);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
