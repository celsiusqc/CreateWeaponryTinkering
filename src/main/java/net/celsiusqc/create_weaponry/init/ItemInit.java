package net.celsiusqc.create_weaponry.init;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.item.ModCreativeModTab;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponry.MOD_ID);

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModTab.create_weaponry);
    }



}