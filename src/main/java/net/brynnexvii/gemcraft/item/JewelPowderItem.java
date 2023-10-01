package net.brynnexvii.gemcraft.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
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
            if(isInteractingFlower(blockstate)){
                return InteractionResult.SUCCESS;
            }

        }
        return InteractionResult.FAIL;
    }

    protected abstract boolean isInteractingFlower(BlockState state);
}
