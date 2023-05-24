package net.celsiusqc.create_weaponry.fluid;

import com.mojang.math.Vector3f;
import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {

    //Molten Gold
    public static final ResourceLocation MOLTEN_GOLD_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/gold/still");
    public static final ResourceLocation MOLTEN_GOLD_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/gold/flowing");
    public static final ResourceLocation MOLTEN_OVERLAY_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "misc/in_soap_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateWeaponry.MOD_ID);

    public static final RegistryObject<FluidType> MOLTEN_GOLD_FLUID_TYPE = register("molten_gold_fluid",
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
                    SoundEvents.HONEY_DRINK));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(MOLTEN_GOLD_STILL_RL, MOLTEN_GOLD_FLOWING_RL, MOLTEN_OVERLAY_RL,
                0xFFFFFFFF, new Vector3f(229f / 255f, 191f / 255f, 38f / 255f), properties));

                                        //Vector3f is the fog color, we divide by 255 because it is the color value from 0 to 1 instead of 0-255

    }

    public static final ResourceLocation MOLTEN_IRON_STILL_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/iron/still");
    public static final ResourceLocation MOLTEN_IRON_FLOWING_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "block/fluid/iron/flowing");
    public static final ResourceLocation MOLTEN_IRON_OVERLAY_RL = new ResourceLocation(CreateWeaponry.MOD_ID, "misc/in_soap_water");


    //Molten Iron


    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
