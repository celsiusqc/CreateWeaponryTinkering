package net.celsiusqc.create_wt.items;

import net.celsiusqc.create_wt.CreateWeaponryTinkering;
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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.Registry;

import java.util.Collection;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateWeaponryTinkering.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_WT_TAB = CREATIVE_MODE_TABS.register("create_wt",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Buckets.MOLTEN_GOLD_BUCKET.get()))
                    .title(Component.translatable("creativetab.create_wt_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // Always accept this item
                        pOutput.accept(Buckets.MOLTEN_GOLD_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_IRON_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_COPPER_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_DIAMOND_BUCKET.get());
                        pOutput.accept(Buckets.MOLTEN_NETHERITE_BUCKET.get());

 //Accept items if 'blue_skies' mod is loaded
                        if (ModList.get().isLoaded("blue_skies")) {
                            pOutput.accept(Buckets.MOLTEN_AQUITE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_CHAROITE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_PYROPE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_DIOPSIDE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_HORIZONITE_BUCKET.get());
                        }
                        //Accept items if 'blue_skies' mod is loaded
                        if (ModList.get().isLoaded("ad_astra")) {
                            pOutput.accept(Buckets.MOLTEN_DESH_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_CALORITE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_PYROPE_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_STEEL_BUCKET.get());
                        }
                        //Accept items if 'create' mod is loaded
                        if (ModList.get().isLoaded("create")) {
                            pOutput.accept(Buckets.MOLTEN_ZINC_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_BRASS_BUCKET.get());
                            pOutput.accept(Buckets.MOLTEN_PYROPE_BUCKET.get());
                        }

                        if (ModList.get().isLoaded("alloyed")) {
                            pOutput.accept(Buckets.MOLTEN_STEEL_BUCKET.get());
                        }


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}