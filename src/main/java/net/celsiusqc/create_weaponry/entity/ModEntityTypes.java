package net.celsiusqc.create_weaponry.entity;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.entity.custom.ClamEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateWeaponry.MOD_ID);

    public static final RegistryObject<EntityType<ClamEntity>> CLAM =
            ENTITY_TYPES.register("clam",
                    () -> EntityType.Builder.of(ClamEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1.2f, 0.4f)
                            .build(new ResourceLocation(CreateWeaponry.MOD_ID, "clam").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
