package net.celsiusqc.create_weaponry.item;

import net.celsiusqc.cp_tweaks.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class WeaponTiers {
        //Steel
        public static final Tier COPPER = new ForgeTier(
                2,
                131,
                5,
                2,
                13,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/copper"))));

        public static final Tier AQUITE = new ForgeTier(
                2,
                270,
                5,
                2,
                20,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/aquite"))));

        public static final Tier ZINC = new ForgeTier(
                2,
                250,
                7,
                2,
                14,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/zinc"))));

        public static final Tier BRASS = new ForgeTier(
                2,
                450,
                7,
                3,
                12,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/brass"))));

        public static final Tier STEEL = new ForgeTier(
                2,
                1000,
                6,
                3,
                14,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/steel"))));

        public static final Tier PYROPE = new ForgeTier(
                0,
                200,
                8,
                1,
                22,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "gems/pyrope"))));

        public static final Tier HORIZONITE = new ForgeTier(
                3,
                250,
                8,
                2,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "gems/horizonite"))));

        public static final Tier CHAROITE = new ForgeTier(
                3,
                1561,
                8,
                3,
                10,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "gems/charoite"))));

        public static final Tier DIOPSIDE = new ForgeTier(
                3,
                1661,
                7,
                5,
                12,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "gems/diopside"))));

        public static final Tier DESH = new ForgeTier(
                4,
                2189,
                10,
                7,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/desh"))));

        public static final Tier CALORITE = new ForgeTier(
                4,
                2354,
                10,
                8,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/calorite"))));


}