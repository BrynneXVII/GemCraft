package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.minecraft.world.level.block.state.BlockState;

public class IgnisGemPowderItem extends AbstractJewelPowderItem {
    public IgnisGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.IGNIS);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state){
        return state.is(GCTags.Blocks.IGNIS_ASPECTED_FLOWERS);
    }

}
