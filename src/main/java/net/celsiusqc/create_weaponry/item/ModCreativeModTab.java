package net.celsiusqc.create_weaponry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab create_weaponry = new CreativeModeTab("create_weaponry") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_GLAIVE.get());
        }
    };
}
