package net.celsiusqc.create_weaponry.init;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.base.FluidRegistryContainer;
import net.celsiusqc.create_weaponry.item.ModCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateWeaponry.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateWeaponry.MOD_ID);

    public static final FluidRegistryContainer EXAMPLE_FLUID = new FluidRegistryContainer(
            "example_fluid",
            FluidType.Properties.create().canSwim(false).canDrown(false).canPushEntity(false).supportsBoating(false).density(6000).temperature(10000).viscosity(10000),
            () -> FluidRegistryContainer.createExtension(
                    new FluidRegistryContainer.ClientExtensions(
                            CreateWeaponry.MOD_ID,
                            "example_fluid"
                    ).fogColor(253, 245, 95)
            ),
            BlockBehaviour.Properties.copy(Blocks.LAVA),
            new Item.Properties()
                    .tab(ModCreativeModTab.create_weaponry)
                    .stacksTo(1)

    );
}
