package net.celsiusqc.create_weaponry.fluid;

import com.mojang.math.Vector3f;
import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.FastColor;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {

    //Gold
    public static final ResourceLocation MOLTEN_GOLD_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/gold/still");
    public static final ResourceLocation MOLTEN_GOLD_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/gold/flowing");
    public static final ResourceLocation MOLTEN_OVERLAY_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "misc/in_soap_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateWeaponry.MOD_ID);


    public static final RegistryObject<FluidType> MOLTEN_GOLD_TYPE = FLUID_TYPES.register("molten_gold_fluid",
            () -> new BaseFluidType(
                    MOLTEN_GOLD_STILL_RL,
                    MOLTEN_GOLD_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xeac528),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));


    //Iron
    public static final ResourceLocation MOLTEN_IRON_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/iron/still");
    public static final ResourceLocation MOLTEN_IRON_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/iron/flowing");

    public static final RegistryObject<FluidType> MOLTEN_IRON_TYPE = FLUID_TYPES.register("molten_iron_fluid",
            () -> new BaseFluidType(
                    MOLTEN_IRON_STILL_RL,
                    MOLTEN_IRON_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0x832c04),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));
    //Aquite
    public static final ResourceLocation MOLTEN_AQUITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/aquite/still");
    public static final ResourceLocation MOLTEN_AQUITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/aquite/flowing");

    public static final RegistryObject<FluidType> MOLTEN_AQUITE_TYPE = FLUID_TYPES.register("molten_aquite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_AQUITE_STILL_RL,
                    MOLTEN_AQUITE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0x84c0cd),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));
    //Charoite
    public static final ResourceLocation MOLTEN_CHAROITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/charoite/still");
    public static final ResourceLocation MOLTEN_CHAROITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/charoite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_CHAROITE_TYPE = FLUID_TYPES.register("molten_charoite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_CHAROITE_STILL_RL,
                    MOLTEN_CHAROITE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xcabccf),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));
    //Diopside
    public static final ResourceLocation MOLTEN_DIOPSIDE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diopside/still");
    public static final ResourceLocation MOLTEN_DIOPSIDE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diopside/flowing");
    public static final RegistryObject<FluidType> MOLTEN_DIOPSIDE_TYPE = FLUID_TYPES.register("molten_diopside_fluid",
            () -> new BaseFluidType(
                    MOLTEN_DIOPSIDE_STILL_RL,
                    MOLTEN_DIOPSIDE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0x80d380),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Pyrope
    public static final ResourceLocation MOLTEN_PYROPE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/pyrope/still");
    public static final ResourceLocation MOLTEN_PYROPE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/pyrope/flowing");
    public static final RegistryObject<FluidType> MOLTEN_PYROPE_TYPE = FLUID_TYPES.register("molten_pyrope_fluid",
            () -> new BaseFluidType(
                    MOLTEN_PYROPE_STILL_RL,
                    MOLTEN_PYROPE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xdaafbc),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));


    //Horizonite
    public static final ResourceLocation MOLTEN_HORIZONITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/horizonite/still");
    public static final ResourceLocation MOLTEN_HORIZONITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/horizonite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_HORIZONITE_TYPE = FLUID_TYPES.register("molten_horizonite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_HORIZONITE_STILL_RL,
                    MOLTEN_HORIZONITE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xd5be80),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));


    //Brass
    public static final ResourceLocation MOLTEN_BRASS_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/brass/still");
    public static final ResourceLocation MOLTEN_BRASS_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/brass/flowing");
    public static final RegistryObject<FluidType> MOLTEN_BRASS_TYPE = FLUID_TYPES.register("molten_brass_fluid",
            () -> new BaseFluidType(
                    MOLTEN_BRASS_STILL_RL,
                    MOLTEN_BRASS_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xc6b29a),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Copper
    public static final ResourceLocation MOLTEN_COPPER_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/copper/still");
    public static final ResourceLocation MOLTEN_COPPER_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/copper/flowing");
    public static final RegistryObject<FluidType> MOLTEN_COPPER_TYPE = FLUID_TYPES.register("molten_copper_fluid",
            () -> new BaseFluidType(
                    MOLTEN_COPPER_STILL_RL,
                    MOLTEN_COPPER_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xe4af9d),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Diamond
    public static final ResourceLocation MOLTEN_DIAMOND_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diamond/still");
    public static final ResourceLocation MOLTEN_DIAMOND_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diamond/flowing");
    public static final RegistryObject<FluidType> MOLTEN_DIAMOND_TYPE = FLUID_TYPES.register("molten_diamond_fluid",
            () -> new BaseFluidType(
                    MOLTEN_DIAMOND_STILL_RL,
                    MOLTEN_DIAMOND_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xa2e0db),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Netherite
    public static final ResourceLocation MOLTEN_NETHERITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/netherite/still");
    public static final ResourceLocation MOLTEN_NETHERITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/netherite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_NETHERITE_TYPE = FLUID_TYPES.register("molten_netherite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_NETHERITE_STILL_RL,
                    MOLTEN_NETHERITE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xa6a5a6),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Steel
    public static final ResourceLocation MOLTEN_STEEL_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/steel/still");
    public static final ResourceLocation MOLTEN_STEEL_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/steel/flowing");
    public static final RegistryObject<FluidType> MOLTEN_STEEL_TYPE = FLUID_TYPES.register("molten_steel_fluid",
            () -> new BaseFluidType(
                    MOLTEN_STEEL_STILL_RL,
                    MOLTEN_STEEL_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xb4b5b7),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Zinc
    public static final ResourceLocation MOLTEN_ZINC_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/zinc/still");
    public static final ResourceLocation MOLTEN_ZINC_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/zinc/flowing");
    public static final RegistryObject<FluidType> MOLTEN_ZINC_TYPE = FLUID_TYPES.register("molten_zinc_fluid",
            () -> new BaseFluidType(
                    MOLTEN_ZINC_STILL_RL,
                    MOLTEN_ZINC_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xb4b6ae),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Calorite
    public static final ResourceLocation MOLTEN_CALORITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/calorite/still");
    public static final ResourceLocation MOLTEN_CALORITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/calorite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_CALORITE_TYPE = FLUID_TYPES.register("molten_calorite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_CALORITE_STILL_RL,
                    MOLTEN_CALORITE_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xc8989b),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));

    //Desh
    public static final ResourceLocation MOLTEN_DESH_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/desh/still");
    public static final ResourceLocation MOLTEN_DESH_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/desh/flowing");
    public static final RegistryObject<FluidType> MOLTEN_DESH_TYPE = FLUID_TYPES.register("molten_desh_fluid",
            () -> new BaseFluidType(
                    MOLTEN_DESH_STILL_RL,
                    MOLTEN_DESH_FLOWING_RL,
                    MOLTEN_OVERLAY_RL,
                    0xFFFFFFFF,
                    colorVecFromHex(0xd9bd9d),  //Values are divided by 255
                    FluidType.Properties.create()
                            .lightLevel(15)
                            .density(15)
                            .viscosity(1)
                            .canSwim(false)
                            .canHydrate(false)
                            .canConvertToSource(false)
                            .canPushEntity(true)
                            .temperature(9000)
                            .supportsBoating(false)
                            .canDrown(false)
                            .sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));









    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
    static Vector3f colorVecFromHex(int color) {
        return new Vector3f(FastColor.ARGB32.red(color)/255f, FastColor.ARGB32.green(color)/255f, FastColor.ARGB32.blue(color)/255f);
    }
}
