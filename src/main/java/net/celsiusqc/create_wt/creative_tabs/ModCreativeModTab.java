package net.celsiusqc.create_wt.creative_tabs;

import jeresources.api.conditionals.Conditional;
import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.config.CreateWeaponryTinkeringConfig;
import net.celsiusqc.create_wt.items.*;
import net.celsiusqc.create_wt.items.custom.Glaives;
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


public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateWeaponryTinkering.MOD_ID);



    public static final RegistryObject<CreativeModeTab> CREATE_WT_TAB = CREATIVE_MODE_TABS.register("create_wt",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Buckets.MOLTEN_GOLD_BUCKET.get()))
                    .title(Component.translatable("creativetab.create_wt_tab"))
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

                        pOutput.accept(Patterns.BLANK_PATTERN.get());
                        pOutput.accept(Patterns.INGOT_PATTERN.get());
                        pOutput.accept(Patterns.GEM_PATTERN.get());
                        pOutput.accept(Patterns.AXE_HEAD_PATTERN.get());
                        pOutput.accept(Patterns.HOE_HEAD_PATTERN.get());
                        pOutput.accept(Patterns.PICKAXE_HEAD_PATTERN.get());
                        pOutput.accept(Patterns.SHOVEL_HEAD_PATTERN.get());
                        pOutput.accept(Patterns.SWORD_HEAD_PATTERN.get());

                        if (CreateWeaponryTinkeringConfig.enableGlaives.get()) {
                            // Always accept this item
                            pOutput.accept(Patterns.GLAIVE_HEAD_PATTERN.get());
                        }
                        if (CreateWeaponryTinkeringConfig.enableKatanas.get()) {
                            // Always accept this item
                            pOutput.accept(Patterns.KATANA_HEAD_PATTERN.get());
                        }
                        if (CreateWeaponryTinkeringConfig.enableHammers.get()) {
                            // Always accept this item
                            pOutput.accept(Patterns.HAMMER_HEAD_PATTERN.get());
                        }
                        if (CreateWeaponryTinkeringConfig.enableMaces.get()) {
                            // Always accept this item
                            pOutput.accept(Patterns.MACE_HEAD_PATTERN.get());
                        }

                        if (CreateWeaponryTinkeringConfig.enableTinyTools.get()) {
                            pOutput.accept(TinyTools.TINY_IRON_PICKAXE.get());
                            pOutput.accept(TinyTools.TINY_DIAMOND_PICKAXE.get());
                            pOutput.accept(Misc.DIAMOND_NUGGET.get());
                            // ...other conditional items
                        }

                        // Non-conditional items
                        pOutput.accept(Misc.HANDLE.get());
                        pOutput.accept(Buckets.MOLTEN_COPPER_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_GOLD_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_IRON_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_DIAMOND_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_NETHERITE_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_ZINC_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_BRASS_BUCKET.get());

 //Accept items if aquite ingots tag is loaded
                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Buckets.MOLTEN_AQUITE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_CHAROITE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_PYROPE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_DIOPSIDE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_HORIZONITE_BUCKET.get());
                        }
                        //Accept items if 'desh' mod is loaded
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Buckets.MOLTEN_DESH_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_CALORITE_BUCKET.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Buckets.MOLTEN_STEEL_BUCKET.get());
                        }


// Axe Heads

                        pOutput.accept(Heads.COPPER_AXE_HEAD.get());
                        pOutput.accept(Heads.GOLDEN_AXE_HEAD.get());
                        pOutput.accept(Heads.IRON_AXE_HEAD.get());
                        pOutput.accept(Heads.DIAMOND_AXE_HEAD.get());
                        pOutput.accept(Heads.NETHERITE_AXE_HEAD.get());
                        pOutput.accept(Heads.ZINC_AXE_HEAD.get());
                        pOutput.accept(Heads.BRASS_AXE_HEAD.get());
                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Heads.AQUITE_AXE_HEAD.get());
                            pOutput.accept(Heads.CHAROITE_AXE_HEAD.get());
                            pOutput.accept(Heads.DIOPSIDE_AXE_HEAD.get());
                            pOutput.accept(Heads.HORIZONITE_AXE_HEAD.get());
                            pOutput.accept(Heads.PYROPE_AXE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Heads.STEEL_AXE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Heads.DESH_AXE_HEAD.get());
                            pOutput.accept(Heads.CALORITE_AXE_HEAD.get());
                        }

// Hoe Heads
                        pOutput.accept(Heads.COPPER_HOE_HEAD.get());
                        pOutput.accept(Heads.GOLDEN_HOE_HEAD.get());
                        pOutput.accept(Heads.IRON_HOE_HEAD.get());
                        pOutput.accept(Heads.DIAMOND_HOE_HEAD.get());
                        pOutput.accept(Heads.NETHERITE_HOE_HEAD.get());
                        pOutput.accept(Heads.ZINC_HOE_HEAD.get());
                        pOutput.accept(Heads.BRASS_HOE_HEAD.get());

                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Heads.AQUITE_HOE_HEAD.get());
                            pOutput.accept(Heads.CHAROITE_HOE_HEAD.get());
                            pOutput.accept(Heads.DIOPSIDE_HOE_HEAD.get());
                            pOutput.accept(Heads.HORIZONITE_HOE_HEAD.get());
                            pOutput.accept(Heads.PYROPE_HOE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Heads.STEEL_HOE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Heads.DESH_HOE_HEAD.get());
                            pOutput.accept(Heads.CALORITE_HOE_HEAD.get());
                        }

// Pickaxe Heads
                        pOutput.accept(Heads.COPPER_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.GOLDEN_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.IRON_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.DIAMOND_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.NETHERITE_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.ZINC_PICKAXE_HEAD.get());
                        pOutput.accept(Heads.BRASS_PICKAXE_HEAD.get());

                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Heads.AQUITE_PICKAXE_HEAD.get());
                            pOutput.accept(Heads.CHAROITE_PICKAXE_HEAD.get());
                            pOutput.accept(Heads.DIOPSIDE_PICKAXE_HEAD.get());
                            pOutput.accept(Heads.HORIZONITE_PICKAXE_HEAD.get());
                            pOutput.accept(Heads.PYROPE_PICKAXE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Heads.STEEL_PICKAXE_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Heads.DESH_PICKAXE_HEAD.get());
                            pOutput.accept(Heads.CALORITE_PICKAXE_HEAD.get());
                        }

// Shovel Heads
                        pOutput.accept(Heads.COPPER_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.GOLDEN_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.IRON_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.DIAMOND_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.NETHERITE_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.ZINC_SHOVEL_HEAD.get());
                        pOutput.accept(Heads.BRASS_SHOVEL_HEAD.get());

                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Heads.AQUITE_SHOVEL_HEAD.get());
                            pOutput.accept(Heads.CHAROITE_SHOVEL_HEAD.get());
                            pOutput.accept(Heads.DIOPSIDE_SHOVEL_HEAD.get());
                            pOutput.accept(Heads.HORIZONITE_SHOVEL_HEAD.get());
                            pOutput.accept(Heads.PYROPE_SHOVEL_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Heads.STEEL_SHOVEL_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Heads.DESH_SHOVEL_HEAD.get());
                            pOutput.accept(Heads.CALORITE_SHOVEL_HEAD.get());
                        }

// Sword Heads
                        pOutput.accept(Heads.COPPER_SWORD_HEAD.get());
                        pOutput.accept(Heads.GOLDEN_SWORD_HEAD.get());
                        pOutput.accept(Heads.IRON_SWORD_HEAD.get());
                        pOutput.accept(Heads.DIAMOND_SWORD_HEAD.get());
                        pOutput.accept(Heads.NETHERITE_SWORD_HEAD.get());
                        pOutput.accept(Heads.ZINC_SWORD_HEAD.get());
                        pOutput.accept(Heads.BRASS_SWORD_HEAD.get());

                        if (BuiltInRegistries.ITEM.getOrCreateTag(aquiteTagKey).size() > 0 ) {
                            pOutput.accept(Heads.AQUITE_SWORD_HEAD.get());
                            pOutput.accept(Heads.CHAROITE_SWORD_HEAD.get());
                            pOutput.accept(Heads.DIOPSIDE_SWORD_HEAD.get());
                            pOutput.accept(Heads.HORIZONITE_SWORD_HEAD.get());
                            pOutput.accept(Heads.PYROPE_SWORD_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(steelTagKey).size() > 0 ) {
                            pOutput.accept(Heads.STEEL_SWORD_HEAD.get());
                        }
                        if (BuiltInRegistries.ITEM.getOrCreateTag(deshTagKey).size() > 0 ) {
                            pOutput.accept(Heads.DESH_SWORD_HEAD.get());
                            pOutput.accept(Heads.CALORITE_SWORD_HEAD.get());
                        }

                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}