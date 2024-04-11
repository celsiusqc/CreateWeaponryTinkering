package net.celsiusqc.create_wt.items;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.tiers.ToolTiers;
import net.celsiusqc.create_wt.items.tooltips.TinyDiamondPickaxeTooltip;
import net.celsiusqc.create_wt.items.tooltips.TinyIronPickaxeTooltip;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class TinyTools {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateWeaponryTinkering.MOD_ID);

    public static final RegistryObject<Item> TINY_IRON_PICKAXE = ITEMS.register("tiny_iron_pickaxe",
            () -> new TinyIronPickaxeTooltip(ToolTiers.TINY_IRON_PICKAXE, new Item.Properties()));
    public static final RegistryObject<Item> TINY_DIAMOND_PICKAXE = ITEMS.register("tiny_diamond_pickaxe",
            () -> new TinyDiamondPickaxeTooltip(ToolTiers.TINY_DIAMOND_PICKAXE, new Item.Properties()));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
