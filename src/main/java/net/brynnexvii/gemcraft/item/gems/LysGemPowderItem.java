package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.minecraft.world.level.block.state.BlockState;

public class LysGemPowderItem extends AbstractJewelPowderItem {
    public LysGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.LYS);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.LYS_ASPECTED_FLOWERS);
    }
}
