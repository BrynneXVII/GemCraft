package net.brynnexvii.gemcraft.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class JewelPowderItem extends Item {
    public JewelPowderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if(!level.isClientSide){
            BlockPos blockpos = pContext.getClickedPos();
            BlockState blockstate = level.getBlockState(blockpos);
            Player player = pContext.getPlayer();
            if(isInteractingFlower(blockstate)){
                pContext.getPlayer().sendSystemMessage(Component.literal("TEST - YES"));
                //level.addParticle(ParticleTypes.HAPPY_VILLAGER, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 2.5D, (double)blockpos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D); //not working????
                if (!player.getAbilities().instabuild) {
                    pContext.getItemInHand().shrink(1);
                }
                return InteractionResult.SUCCESS;
            }
            player.sendSystemMessage(Component.literal("TEST - NO"));
        }

        return InteractionResult.FAIL;
    }

    protected abstract boolean isInteractingFlower(BlockState state);
}
