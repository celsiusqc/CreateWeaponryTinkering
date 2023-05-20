package net.celsiusqc.create_weaponry.entity.client;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.entity.custom.ClamEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClamModel extends AnimatedGeoModel<ClamEntity> {
    @Override
    public ResourceLocation getModelResource(ClamEntity object) {
        return new ResourceLocation(CreateWeaponry.MOD_ID, "geo/clam.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ClamEntity object) {
        return new ResourceLocation(CreateWeaponry.MOD_ID, "textures/entity/clam/clam.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ClamEntity animatable) {
        return new ResourceLocation(CreateWeaponry.MOD_ID, "animations/clam.animation.json");
    }
}
