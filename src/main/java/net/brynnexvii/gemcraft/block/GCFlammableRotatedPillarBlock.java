package net.brynnexvii.gemcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;


public class GCFlammableRotatedPillarBlock extends RotatedPillarBlock {
    protected final Optional<Block> blockAfterStrip;

    public GCFlammableRotatedPillarBlock(Properties pProperties, Block strippedBlock) {
        super(pProperties);
        this.blockAfterStrip = Optional.of(strippedBlock);
    }

    public GCFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
        this.blockAfterStrip = Optional.empty();
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        ItemStack stack = context.getItemInHand();

        if (!stack.canPerformAction(toolAction))
            return null;

        if (ToolActions.AXE_STRIP == toolAction && blockAfterStrip.isPresent()) {
            return blockAfterStrip.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
