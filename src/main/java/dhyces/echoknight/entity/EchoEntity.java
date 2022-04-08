package dhyces.echoknight.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class EchoEntity extends LivingEntity {

    public static final EntityAttribute ECHOKNIGHT_MAX_HEALTH = Registry.register(Registry.ATTRIBUTE, "echoknight.max_health", (new ClampedEntityAttribute("attribute.name.echoknight.max_health", 1.0D, 1.0D, 1024.0D)).setTracked(true));

    public EchoEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return null;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {

    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return new DefaultAttributeContainer.Builder().add(ECHOKNIGHT_MAX_HEALTH);
    }

    @Override
    public Arm getMainArm() {
        return null;
    }
}
