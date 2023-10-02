package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.world.level.block.state.BlockState;

public class EmeraldPowderItem extends JewelPowderItem {
    public EmeraldPowderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.GREEN_INTERACTING_FLOWERS);
    }
}
