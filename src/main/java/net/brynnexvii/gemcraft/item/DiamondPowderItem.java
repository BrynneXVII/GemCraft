package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.world.level.block.state.BlockState;

public class DiamondPowderItem extends JewelPowderItem {
    public DiamondPowderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.WHITE_INTERACTING_FLOWERS);
    }
}
