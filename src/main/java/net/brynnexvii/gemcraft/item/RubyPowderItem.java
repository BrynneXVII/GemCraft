package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class RubyPowderItem extends JewelPowderItem {

    public RubyPowderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state){
        return state.is(GCTags.Blocks.RED_INTERACTING_FLOWERS);
    }


}
