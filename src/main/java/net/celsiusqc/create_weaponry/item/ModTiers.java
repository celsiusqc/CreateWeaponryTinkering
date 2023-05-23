package net.celsiusqc.create_weaponry.item;

import net.celsiusqc.create_weaponry.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier COPPER = new ForgeTier(1, 600, 4.0f, 1.0f, 10,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier COPPER_TOOL = new ForgeTier(1, 300, 2.0f, 1.0f, 10,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));

}