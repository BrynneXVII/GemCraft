package net.brynnexvii.gemcraft.block.crops;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class GCCropBlock extends CropBlock {

    public GCCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
}
