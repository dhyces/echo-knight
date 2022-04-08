package dhyces.echoknight.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class EchoApple extends Item {
    public EchoApple(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        return super.finishUsing(stack, world, user);
    }

    // TODO: change this to a more interesting echoey sound
    @Override
    public SoundEvent getEatSound() {
        return super.getEatSound();
    } StatusEffectInstance
}
