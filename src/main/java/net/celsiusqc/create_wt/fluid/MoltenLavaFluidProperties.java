package net.celsiusqc.create_wt.fluid;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;

public class MoltenLavaFluidProperties {
    public static final Fluid STILL = new StillMoltenLava();
    public static final Fluid FLOWING = new FlowingMoltenLava();

    private static class StillMoltenLava extends AbstractMoltenLavaFluid {
        @Override
        public Identifier getFlowingTexture() {
            return null;
        }

        @Override
        public Identifier getStillTexture() {
            return new Identifier("minecraft", "block/lava_still");
        }

        @Override
        public Fluid getFlowing() {
            return FLOWING;
        }

        @Override
        public Fluid getStill() {
            return null;
        }

        @Override
        protected boolean isInfinite(World world) {
            return false;
        }

        @Override
        protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {

        }

        @Override
        protected int getFlowSpeed(WorldView world) {
            return 0;
        }

        @Override
        protected int getLevelDecreasePerBlock(WorldView world) {
            return 0;
        }

        @Override
        protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
            return false;
        }

        @Override
        public int getTickRate(WorldView world) {
            return 0;
        }

        @Override
        protected float getBlastResistance() {
            return 0;
        }

        @Override
        protected BlockState toBlockState(FluidState state) {
            return null;
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

    private static class FlowingMoltenLava extends AbstractMoltenLavaFluid {
        @Override
        public Identifier getFlowingTexture() {
            return new Identifier("minecraft", "block/lava_flow");
        }

        @Override
        public Fluid getFlowing() {
            return null;
        }

        @Override
        public Fluid getStill() {
            return STILL;
        }

        @Override
        protected boolean isInfinite(World world) {
            return false;
        }

        @Override
        protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {

        }

        @Override
        protected int getFlowSpeed(WorldView world) {
            return 0;
        }

        @Override
        protected int getLevelDecreasePerBlock(WorldView world) {
            return 0;
        }

        @Override
        protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
            return false;
        }

        @Override
        public int getTickRate(WorldView world) {
            return 0;
        }

        @Override
        protected float getBlastResistance() {
            return 0;
        }

        @Override
        protected BlockState toBlockState(FluidState state) {
            return null;
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public Identifier getStillTexture() {
            return null;
        }
    }

    private abstract static class AbstractMoltenLavaFluid extends FlowableFluid implements net.celsiusqc.create_wt.fluid.AbstractMoltenLavaFluid {
        @Override
        public void afterMoving(World world, BlockPos pos, FluidState state) { }

        @Override
        public boolean canBeReplacedWith(FluidState fluidState, BlockView blockView, BlockPos pos, Fluid fluid, Entity entity) {
            return false;
        }

        @Override
        public Item getBucketItem() {
            return Items.LAVA_BUCKET;
        }

        @Override
        public int getLevel(FluidState state) {
            return 0;
        }

        public abstract Identifier getFlowingTexture();

        public abstract Identifier getStillTexture();
    }
}