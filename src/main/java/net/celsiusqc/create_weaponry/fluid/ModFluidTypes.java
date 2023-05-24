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


    public static final RegistryObject<FluidType> MOLTEN_GOLD_TYPE = FLUID_TYPES.register("molten_gold",
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
    //Charoite
    public static final ResourceLocation MOLTEN_CHAROITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/charoite/still");
    public static final ResourceLocation MOLTEN_CHAROITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/charoite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_CHAROITE_TYPE = FLUID_TYPES.register("molten_charoite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_CHAROITE_STILL_RL,
                    MOLTEN_CHAROITE_FLOWING_RL,
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
    //Diopside
    public static final ResourceLocation MOLTEN_DIOPSIDE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diopside/still");
    public static final ResourceLocation MOLTEN_DIOPSIDE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/diopside/flowing");
    public static final RegistryObject<FluidType> MOLTEN_DIOPSIDE_TYPE = FLUID_TYPES.register("molten_diopside_fluid",
            () -> new BaseFluidType(
                    MOLTEN_DIOPSIDE_STILL_RL,
                    MOLTEN_DIOPSIDE_FLOWING_RL,
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

    //Pyrope
    public static final ResourceLocation MOLTEN_PYROPE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/pyrope/still");
    public static final ResourceLocation MOLTEN_PYROPE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/pyrope/flowing");
    public static final RegistryObject<FluidType> MOLTEN_PYROPE_TYPE = FLUID_TYPES.register("molten_pyrope_fluid",
            () -> new BaseFluidType(
                    MOLTEN_PYROPE_STILL_RL,
                    MOLTEN_PYROPE_FLOWING_RL,
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

    //Falsite
    public static final ResourceLocation MOLTEN_FALSITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/falsite/still");
    public static final ResourceLocation MOLTEN_FALSITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/falsite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_FALSITE_TYPE = FLUID_TYPES.register("molten_falsite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_FALSITE_STILL_RL,
                    MOLTEN_FALSITE_FLOWING_RL,
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

    //Horizonite
    public static final ResourceLocation MOLTEN_HORIZONITE_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/horizonite/still");
    public static final ResourceLocation MOLTEN_HORIZONITE_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/horizonite/flowing");
    public static final RegistryObject<FluidType> MOLTEN_HORIZONITE_TYPE = FLUID_TYPES.register("molten_horizonite_fluid",
            () -> new BaseFluidType(
                    MOLTEN_HORIZONITE_STILL_RL,
                    MOLTEN_HORIZONITE_FLOWING_RL,
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

    //Ventium
    public static final ResourceLocation MOLTEN_VENTIUM_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/ventium/still");
    public static final ResourceLocation MOLTEN_VENTIUM_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/ventium/flowing");
    public static final RegistryObject<FluidType> MOLTEN_VENTIUM_TYPE = FLUID_TYPES.register("molten_ventium_fluid",
            () -> new BaseFluidType(
                    MOLTEN_VENTIUM_STILL_RL,
                    MOLTEN_VENTIUM_FLOWING_RL,
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






    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
    static Vector3f colorVecFromHex(int color) {
        return new Vector3f(FastColor.ARGB32.red(color)/255f, FastColor.ARGB32.green(color)/255f, FastColor.ARGB32.blue(color)/255f);
    }
}
