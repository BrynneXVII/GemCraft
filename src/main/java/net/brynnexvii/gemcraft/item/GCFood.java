package net.brynnexvii.gemcraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class GCFood {
    public static final FoodProperties ROCK_CANDY = new FoodProperties.Builder().alwaysEat().fast().nutrition(2).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200), 0.5f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200), 0.5f).build();

    public static final FoodProperties PARSNIP = new FoodProperties.Builder().nutrition(4).saturationMod(0.7f).build();
}
