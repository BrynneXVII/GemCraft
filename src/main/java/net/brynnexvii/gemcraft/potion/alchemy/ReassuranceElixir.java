package net.brynnexvii.gemcraft.potion.alchemy;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class ReassuranceElixir extends AbstractAlchemicalElixir {
    private final int DAMAGE_RESIST_LEVEL;
    private final int REGENERATION_LEVEL;
    private final int DURATION; //seconds


    public ReassuranceElixir(Properties pProperties, int damageResistLevel, int regenerationLevel, int duration) {
        super(pProperties);
        this.DAMAGE_RESIST_LEVEL = damageResistLevel;
        this.REGENERATION_LEVEL = regenerationLevel;
        this.DURATION = duration;
    }

    @Override
    protected void addAlchemicalPotionEffects(Level level, LivingEntity entity) {
        entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*this.DURATION, this.DAMAGE_RESIST_LEVEL)); // level seems to be amplifier + 1
        entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20*this.DURATION, this.REGENERATION_LEVEL));
    }
}
