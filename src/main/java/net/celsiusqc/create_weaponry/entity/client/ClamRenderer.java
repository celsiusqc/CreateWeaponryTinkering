package net.celsiusqc.create_weaponry.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.entity.custom.ClamEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class ClamRenderer extends GeoEntityRenderer<ClamEntity> {
    public ClamRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ClamModel());
        this.shadowRadius = 0.8f;
    }

    @Override
    public ResourceLocation getTextureLocation(ClamEntity instance) {
        return new ResourceLocation(CreateWeaponry.MOD_ID, "textures/entity/clam/clam.png");
    }

    @Override
    public RenderType getRenderType(ClamEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}