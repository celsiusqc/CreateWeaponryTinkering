package net.celsiusqc.create_wt.fluid;

import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public interface AbstractMoltenLavaFluid {
    void afterMoving(World world, BlockPos pos, FluidState state);

    boolean canBeReplacedWith(FluidState fluidState, BlockView blockView, BlockPos pos, Fluid fluid, Entity entity);
}
