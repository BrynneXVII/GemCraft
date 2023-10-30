package net.brynnexvii.gemcraft.effect;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.Vec3;

public class NatureGrowthEffect extends MobEffect {
    private final int RADIUS;
    private final int FREQUENCY;
    private int count = 0;

    protected NatureGrowthEffect(MobEffectCategory pCategory, int pColor, int rad, int freq) {
        super(pCategory, pColor);
        this.RADIUS = rad;
        this.FREQUENCY = freq;
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level().isClientSide) {
            this.count++;
            if (count >= this.FREQUENCY) {
                this.count = 0;
                BlockPos pos = pLivingEntity.getOnPos();
                BlockPos currentPos = pos.offset(-RADIUS, 0, -RADIUS);
                for (int i = -RADIUS + 1; i < RADIUS; i++) {
                    for (int j = -RADIUS + 1; j < RADIUS; j++) {
                        BlockState currentBlock = pLivingEntity.level().getBlockState(currentPos);
                        if (currentBlock.getBlock() instanceof BonemealableBlock) {
                            System.out.println("Got bonemealable x: " + currentPos.getX() + " z: " + currentPos.getZ());
                            ((BonemealableBlock) currentBlock.getBlock()).performBonemeal(((ServerLevel) pLivingEntity.level()), RandomSource.create(), currentPos, currentBlock); //this may not work, wants server level, I forced a cast
                        }
                        currentPos = currentPos.offset(0, 0, 1);
                    }
                    currentPos = currentPos.offset(1, 0, -2 * RADIUS + 1);
                }
            }
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
