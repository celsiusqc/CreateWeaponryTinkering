package net.celsiusqc.create_wt.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.celsiusqc.create_wt.CreateWeaponryTinkering;
import net.celsiusqc.create_wt.items.Buckets;
import net.celsiusqc.create_wt.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(CreateWeaponryTinkering.MOD_ID, "enchantment");
    }
    @Override
    public void registerRecipes(IRecipeRegistration reg) {
        reg.addIngredientInfo(new ItemStack(Buckets.MOLTEN_GOLD_BUCKET.get()), VanillaTypes.ITEM_STACK, Component.translatable("info.celsiusqc.void_worm_gu"));
    }

}
