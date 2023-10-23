package net.brynnexvii.gemcraft.block;

import net.brynnexvii.gemcraft.block.entity.BasicAlchemicalCauldronEntity;
import net.brynnexvii.gemcraft.block.entity.GCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BasicAlchemicalCauldron extends AlchemicalCauldron {
    private static final VoxelShape SHAPE = Block.box(3, 0, 3, 10, 7.5, 10);
    public BasicAlchemicalCauldron(Properties pProperties) {
        super(pProperties, 1000, SHAPE);
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState){
        return new BasicAlchemicalCauldronEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }

        return createTickerHelper(pBlockEntityType, GCBlockEntities.BASIC_ALCHEMICAL_CAULDRON_BLOCK_ENTITY.get(), ((pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1)));
    }



}
