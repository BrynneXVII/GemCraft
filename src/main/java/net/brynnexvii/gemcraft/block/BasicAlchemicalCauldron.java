package net.brynnexvii.gemcraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BasicAlchemicalCauldron extends AlchemicalCauldron {
    private static final VoxelShape SHAPE = Block.box(3, 0, 3, 10, 7.5, 10);
    public BasicAlchemicalCauldron(Properties pProperties) {
        super(pProperties, 1000, SHAPE);
    }
}
