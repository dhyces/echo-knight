package dhyces.echoknight.client;

import dhyces.echoknight.entity.EchoEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EchoEntityRenderer extends LivingEntityRenderer<EchoEntity, EchoEntityModel> {

    public EchoEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new EchoEntityModel(ctx.getPart(EntityModelLayers.PLAYER)), 0.5F);
    }

    @Override
    public void render(EchoEntity livingEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        super.render(livingEntity, yaw, tickDelta, matrixStack, vertexConsumerProvider, light);
    }

    @Override
    public Identifier getTexture(EchoEntity entity) {
        return entity.getTexture();
    }
}
