package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.level.block.state.BlockState;

public class InanisGemPowderItem extends AbstractJewelPowderItem{
    public InanisGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.INANIS);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.INANIS_ASPECTED_FLOWERS);
    }
}
