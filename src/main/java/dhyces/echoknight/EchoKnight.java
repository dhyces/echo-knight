package dhyces.echoknight;

import dhyces.echoknight.item.EchoApple;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EchoKnight implements ModInitializer {

    public static final String MOD_ID = "echoknight";

    @Override
    public void onInitialize() {

    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID + ":" + id);
    }

    public static final Item ECHO_APPLE_ITEM = Registry.register(Registry.ITEM, id("echoed_apple"), new EchoApple(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(3).build())));
}
