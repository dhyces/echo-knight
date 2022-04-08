package dhyces.echoknight;

import dhyces.echoknight.entity.EchoEntity;
import dhyces.echoknight.item.EchoApple;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EchoKnight implements ModInitializer {

    public static final String MOD_ID = "echoknight";
    public static Identifier id(String id) {
        return new Identifier(MOD_ID + ":" + id);
    }

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(ECHO_ENTITY_TYPE, EchoEntity.createAttributes());
    }

    public static final Item ECHO_APPLE_ITEM = Registry.register(Registry.ITEM, id("echoed_apple"), new EchoApple(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(3).build())));

    public static final EntityType<EchoEntity> ECHO_ENTITY_TYPE = Registry.register(Registry.ENTITY_TYPE, id("echo_entity"), FabricEntityTypeBuilder.createLiving().entityFactory(EchoEntity::new).trackRangeBlocks(30).build());
}
