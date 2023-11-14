package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.minecraft.world.level.block.state.BlockState;

public class TerraGemPowderItem extends AbstractJewelPowderItem {
    public TerraGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.TERRA);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.TERRA_ASPECTED_FLOWERS);
    }
}
