package net.celsiusqc.create_wt.block;

import net.celsiusqc.create_wt.fluid.MoltenLavaFluidProperties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class MoltenLavaFluidBlock extends FluidBlock {
    public MoltenLavaFluidBlock() {
        super((FlowableFluid) MoltenLavaFluidProperties.STILL, Settings.copy(Blocks.LAVA));
    }
}