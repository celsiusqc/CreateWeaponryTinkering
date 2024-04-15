package net.celsiusqc.create_wt.creative_tabs;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.config.CreateWeaponryTinkeringConfig;
import net.celsiusqc.create_wt.items.*;
import net.celsiusqc.create_wt.items.custom.Glaives;
import net.celsiusqc.create_wt.items.custom.Hammers;
import net.celsiusqc.create_wt.items.custom.Katanas;
import net.celsiusqc.create_wt.items.custom.Maces;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WeaponsCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateWeaponryTinkering.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_WT_WEAPON_TAB = CREATIVE_MODE_TABS.register("create_wt_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Glaives.NETHERITE_GLAIVE.get()))
                    .title(Component.translatable("creativetab.create_wt_weapon_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //Conditional items based on config

                        ResourceLocation aquiteTagLocation = new ResourceLocation("forge", "gems/aquite");
                        TagKey<Item> aquiteTagKey = TagKey.create(Registries.ITEM, aquiteTagLocation);
                        ResourceLocation charoiteTagLocation = new ResourceLocation("forge", "gems/charoite");
                        TagKey<Item> charoiteTagKey = TagKey.create(Registries.ITEM, charoiteTagLocation);
                        ResourceLocation pyropeTagLocation = new ResourceLocation("forge", "gems/pyrope");
                        TagKey<Item> pyropeTagKey = TagKey.create(Registries.ITEM, pyropeTagLocation);
                        ResourceLocation diopsideTagLocation = new ResourceLocation("forge", "gems/diopside");
                        TagKey<Item> diopsideTagKey = TagKey.create(Registries.ITEM, diopsideTagLocation);
                        ResourceLocation horizoniteTagLocation = new ResourceLocation("forge", "ingots/horizonite");
                        TagKey<Item> horizoniteTagKey = TagKey.create(Registries.ITEM, horizoniteTagLocation);
                        ResourceLocation steelTagLocation = new ResourceLocation("forge", "ingots/steel");
                        TagKey<Item> steelTagKey = TagKey.create(Registries.ITEM, steelTagLocation);
                        ResourceLocation deshTagLocation = new ResourceLocation("forge", "ingots/desh");
                        TagKey<Item> deshTagKey = TagKey.create(Registries.ITEM, deshTagLocation);
                        ResourceLocation caloriteTagLocation = new ResourceLocation("forge", "ingots/calorite");
                        TagKey<Item> caloriteTagKey = TagKey.create(Registries.ITEM, caloriteTagLocation);

                        if (CreateWeaponryTinkeringConfig.enableGlaives.get()) {
                            // Glaive Heads acceptance
                            pOutput.accept(Glaives.COPPER_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.GOLDEN_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.IRON_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.DIAMOND_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.NETHERITE_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.ZINC_GLAIVE_HEAD.get());
                            pOutput.accept(Glaives.BRASS_GLAIVE_HEAD.get());

                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.STEEL_GLAIVE_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.HORIZONITE_GLAIVE_HEAD.get());
                                pOutput.accept(Glaives.AQUITE_GLAIVE_HEAD.get());
                                pOutput.accept(Glaives.PYROPE_GLAIVE_HEAD.get());
                                pOutput.accept(Glaives.CHAROITE_GLAIVE_HEAD.get());
                                pOutput.accept(Glaives.DIOPSIDE_GLAIVE_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.DESH_GLAIVE_HEAD.get());
                                pOutput.accept(Glaives.CALORITE_GLAIVE_HEAD.get());
                            }

                        }
                        if (CreateWeaponryTinkeringConfig.enableKatanas.get()) {
                            // Katana Heads acceptance
                            pOutput.accept(Katanas.COPPER_KATANA_HEAD.get());
                            pOutput.accept(Katanas.GOLDEN_KATANA_HEAD.get());
                            pOutput.accept(Katanas.IRON_KATANA_HEAD.get());
                            pOutput.accept(Katanas.DIAMOND_KATANA_HEAD.get());
                            pOutput.accept(Katanas.NETHERITE_KATANA_HEAD.get());
                            pOutput.accept(Katanas.ZINC_KATANA_HEAD.get());
                            pOutput.accept(Katanas.BRASS_KATANA_HEAD.get());

                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.STEEL_KATANA_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.HORIZONITE_KATANA_HEAD.get());
                                pOutput.accept(Katanas.AQUITE_KATANA_HEAD.get());
                                pOutput.accept(Katanas.PYROPE_KATANA_HEAD.get());
                                pOutput.accept(Katanas.CHAROITE_KATANA_HEAD.get());
                                pOutput.accept(Katanas.DIOPSIDE_KATANA_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.DESH_KATANA_HEAD.get());
                                pOutput.accept(Katanas.CALORITE_KATANA_HEAD.get());
                            }
                        }
                        if (CreateWeaponryTinkeringConfig.enableHammers.get()) {
                            // Hammer Heads acceptance
                            pOutput.accept(Hammers.COPPER_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.GOLDEN_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.IRON_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.DIAMOND_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.NETHERITE_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.ZINC_HAMMER_HEAD.get());
                            pOutput.accept(Hammers.BRASS_HAMMER_HEAD.get());

                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.STEEL_HAMMER_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.HORIZONITE_HAMMER_HEAD.get());
                                pOutput.accept(Hammers.AQUITE_HAMMER_HEAD.get());
                                pOutput.accept(Hammers.PYROPE_HAMMER_HEAD.get());
                                pOutput.accept(Hammers.CHAROITE_HAMMER_HEAD.get());
                                pOutput.accept(Hammers.DIOPSIDE_HAMMER_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.DESH_HAMMER_HEAD.get());
                                pOutput.accept(Hammers.CALORITE_HAMMER_HEAD.get());
                            }
                        }

                        if (CreateWeaponryTinkeringConfig.enableMaces.get()) {
                            // Mace Heads acceptance
                            pOutput.accept(Maces.COPPER_MACE_HEAD.get());
                            pOutput.accept(Maces.GOLDEN_MACE_HEAD.get());
                            pOutput.accept(Maces.IRON_MACE_HEAD.get());
                            pOutput.accept(Maces.DIAMOND_MACE_HEAD.get());
                            pOutput.accept(Maces.NETHERITE_MACE_HEAD.get());
                            pOutput.accept(Maces.ZINC_MACE_HEAD.get());
                            pOutput.accept(Maces.BRASS_MACE_HEAD.get());

                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Maces.STEEL_MACE_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Maces.HORIZONITE_MACE_HEAD.get());
                                pOutput.accept(Maces.AQUITE_MACE_HEAD.get());
                                pOutput.accept(Maces.PYROPE_MACE_HEAD.get());
                                pOutput.accept(Maces.CHAROITE_MACE_HEAD.get());
                                pOutput.accept(Maces.DIOPSIDE_MACE_HEAD.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Maces.DESH_MACE_HEAD.get());
                                pOutput.accept(Maces.CALORITE_MACE_HEAD.get());
                            }
                        }

                        //Glaives
                        if (CreateWeaponryTinkeringConfig.enableGlaives.get()) {

                            // Accepting base glaive items
                            pOutput.accept(Glaives.WOODEN_GLAIVE.get());
                            pOutput.accept(Glaives.STONE_GLAIVE.get());
                            pOutput.accept(Glaives.COPPER_GLAIVE.get());
                            pOutput.accept(Glaives.GOLDEN_GLAIVE.get());
                            pOutput.accept(Glaives.IRON_GLAIVE.get());
                            pOutput.accept(Glaives.DIAMOND_GLAIVE.get());
                            pOutput.accept(Glaives.NETHERITE_GLAIVE.get());
                            pOutput.accept(Glaives.ZINC_GLAIVE.get());
                            pOutput.accept(Glaives.BRASS_GLAIVE.get());
                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.STEEL_GLAIVE.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.HORIZONITE_GLAIVE.get());
                                pOutput.accept(Glaives.AQUITE_GLAIVE.get());
                                pOutput.accept(Glaives.PYROPE_GLAIVE.get());
                                pOutput.accept(Glaives.CHAROITE_GLAIVE.get());
                                pOutput.accept(Glaives.DIOPSIDE_GLAIVE.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Glaives.DESH_GLAIVE.get());
                                pOutput.accept(Glaives.CALORITE_GLAIVE.get());
                            }
                        }
                        //Katanas
                        if (CreateWeaponryTinkeringConfig.enableKatanas.get()) {

                            // Accepting base katana items
                            pOutput.accept(Katanas.WOODEN_KATANA.get());
                            pOutput.accept(Katanas.STONE_KATANA.get());
                            pOutput.accept(Katanas.COPPER_KATANA.get());
                            pOutput.accept(Katanas.GOLDEN_KATANA.get());
                            pOutput.accept(Katanas.IRON_KATANA.get());
                            pOutput.accept(Katanas.DIAMOND_KATANA.get());
                            pOutput.accept(Katanas.NETHERITE_KATANA.get());
                            pOutput.accept(Katanas.ZINC_KATANA.get());
                            pOutput.accept(Katanas.BRASS_KATANA.get());
                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.STEEL_KATANA.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.HORIZONITE_KATANA.get());
                                pOutput.accept(Katanas.AQUITE_KATANA.get());
                                pOutput.accept(Katanas.PYROPE_KATANA.get());
                                pOutput.accept(Katanas.CHAROITE_KATANA.get());
                                pOutput.accept(Katanas.DIOPSIDE_KATANA.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Katanas.DESH_KATANA.get());
                                pOutput.accept(Katanas.CALORITE_KATANA.get());
                            }
                        }
                        //Hammers
                        if (CreateWeaponryTinkeringConfig.enableHammers.get()) {

                            // Accepting base hammer items
                            pOutput.accept(Hammers.WOODEN_HAMMER.get());
                            pOutput.accept(Hammers.STONE_HAMMER.get());
                            pOutput.accept(Hammers.COPPER_HAMMER.get());
                            pOutput.accept(Hammers.GOLDEN_HAMMER.get());
                            pOutput.accept(Hammers.IRON_HAMMER.get());
                            pOutput.accept(Hammers.DIAMOND_HAMMER.get());
                            pOutput.accept(Hammers.NETHERITE_HAMMER.get());
                            pOutput.accept(Hammers.ZINC_HAMMER.get());
                            pOutput.accept(Hammers.BRASS_HAMMER.get());
                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.STEEL_HAMMER.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.HORIZONITE_HAMMER.get());
                                pOutput.accept(Hammers.AQUITE_HAMMER.get());
                                pOutput.accept(Hammers.PYROPE_HAMMER.get());
                                pOutput.accept(Hammers.CHAROITE_HAMMER.get());
                                pOutput.accept(Hammers.DIOPSIDE_HAMMER.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Hammers.DESH_HAMMER.get());
                                pOutput.accept(Hammers.CALORITE_HAMMER.get());
                            }
                        }
                        //Maces
                        if (CreateWeaponryTinkeringConfig.enableMaces.get()) {
                            pOutput.accept(Maces.WOODEN_MACE.get());
                            pOutput.accept(Maces.STONE_MACE.get());
                            pOutput.accept(Maces.COPPER_MACE.get());
                            pOutput.accept(Maces.GOLDEN_MACE.get());
                            pOutput.accept(Maces.IRON_MACE.get());
                            pOutput.accept(Maces.DIAMOND_MACE.get());
                            pOutput.accept(Maces.NETHERITE_MACE.get());
                            pOutput.accept(Maces.ZINC_MACE.get());
                            pOutput.accept(Maces.BRASS_MACE.get());
                            if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                                pOutput.accept(Maces.STEEL_MACE.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                                pOutput.accept(Maces.HORIZONITE_MACE.get());
                                pOutput.accept(Maces.AQUITE_MACE.get());
                                pOutput.accept(Maces.PYROPE_MACE.get());
                                pOutput.accept(Maces.CHAROITE_MACE.get());
                                pOutput.accept(Maces.DIOPSIDE_MACE.get());
                            }
                            if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                                pOutput.accept(Maces.DESH_MACE.get());
                                pOutput.accept(Maces.CALORITE_MACE.get());
                            }
                        }




                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}