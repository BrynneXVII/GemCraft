package net.brynnexvii.gemcraft.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class SuperJumpEffect extends MobEffect {
    public SuperJumpEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        Vec3 initialMovementVec = pLivingEntity.getDeltaMovement();
        if(initialMovementVec.y > 0.4D){
            System.out.println("Jumping! " + initialMovementVec.y);
            pLivingEntity.setDeltaMovement(initialMovementVec.x, 2D, initialMovementVec.z);
        }

        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }



}
