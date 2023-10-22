package net.brynnexvii.gemcraft.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BasicAlchemicalCauldronEntity extends AlchemicalCauldronEntity {

    public BasicAlchemicalCauldronEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState) {
        super(GCBlockEntities.BASIC_ALCHEMICAL_CAULDRON_BLOCK_ENTITY.get(), pPos, pBlockState);
    }
}
