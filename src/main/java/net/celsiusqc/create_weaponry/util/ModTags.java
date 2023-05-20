package net.celsiusqc.create_weaponry.util;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_FLINT_TOOL = tag("needs_flint_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CreateWeaponry.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BRUSHES = forgeTag("brushes");
        public static final TagKey<Item> FIBER_PLANTS = forgeTag("fiber_plants");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CreateWeaponry.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
