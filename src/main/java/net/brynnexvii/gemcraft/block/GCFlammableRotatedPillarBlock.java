package net.brynnexvii.gemcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class GCFlammableRotatedPillarBlock extends RotatedPillarBlock {

    /*private static Map<Block, Block> logToStrippedMapping = new HashMap<>(); //maps strippable logs to their stripped counterparts
    static{
        logToStrippedMapping.put(GCBlocks.WILLOW_LOG.get(), GCBlocks.STRIPPED_WILLOW_LOG.get());
        logToStrippedMapping.put(GCBlocks.WILLOW_WOOD.get(), GCBlocks.STRIPPED_WILLOW_WOOD.get());
    };*/


    public GCFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
        //logToStrippedMapping.put(GCBlocks.WILLOW_LOG.get(), GCBlocks.STRIPPED_WILLOW_LOG.get());
        //logToStrippedMapping.put(GCBlocks.WILLOW_WOOD.get(), GCBlocks.STRIPPED_WILLOW_WOOD.get());
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
        if(context.getItemInHand().getItem() instanceof AxeItem){
            if(state.is(GCBlocks.WILLOW_LOG.get())){
                return GCBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(GCBlocks.WILLOW_WOOD.get())){
                return GCBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            /*System.out.println("Here1");
            if(logToStrippedMapping.containsKey(state.getBlock())){
                System.out.println("Here2");
                return logToStrippedMapping.get(state.getBlock()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }*/

        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
