package net.celsiusqc.create_weaponry.event;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.entity.ModEntityTypes;
import net.celsiusqc.create_weaponry.entity.custom.ClamEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateWeaponry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    //@SubscribeEvent
    //public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
    //    Registry.register(Registry.RECIPE_TYPE, ForgeRecipe.Type.ID, ForgeRecipe.Type.INSTANCE);
    //}

    @Mod.EventBusSubscriber(modid = CreateWeaponry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.CLAM.get(), ClamEntity.setAttributes());
        }
    }
}
