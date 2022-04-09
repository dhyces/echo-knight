package dhyces.echoknight.client;

import dhyces.echoknight.entity.EchoEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class EchoEntityModel extends PlayerEntityModel<EchoEntity> {

    protected EchoEntityModel(ModelPart root) {
        super(root, false);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        super.render(matrices, vertices, light, overlay, 0.0F, 1.0F, 1.0F, 0.25F);
    }

    public static TexturedModelData getTexturedModelData() {
        return TexturedModelData.of(getTexturedModelData(Dilation.NONE, false), 64, 64);
    }
}
