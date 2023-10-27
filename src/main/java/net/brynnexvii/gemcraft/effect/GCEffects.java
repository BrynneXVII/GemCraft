package net.brynnexvii.gemcraft.effect;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GCEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GemCraft.MODID);

    public static final RegistryObject<MobEffect> SUPER_JUMP_EFFECT = MOB_EFFECTS.register("super_jump_effect",
            () -> new SuperJumpEffect(MobEffectCategory.NEUTRAL, 0xFDDA0D)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH, "7107DE5E-7CE8-4030-940E-514C1F160890", 2D, AttributeModifier.Operation.MULTIPLY_TOTAL)); //this jump is for horses -_-

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
