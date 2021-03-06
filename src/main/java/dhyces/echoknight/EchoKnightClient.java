package dhyces.echoknight;

import dhyces.echoknight.client.EchoEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class EchoKnightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EchoKnight.ECHO_ENTITY_TYPE, EchoEntityRenderer::new);
    }
}
