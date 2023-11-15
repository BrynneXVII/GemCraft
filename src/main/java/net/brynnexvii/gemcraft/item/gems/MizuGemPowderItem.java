package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.level.block.state.BlockState;

public class MizuGemPowderItem extends AbstractJewelPowderItem{
    public MizuGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.MIZU);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.MIZU_ASPECTED_FLOWERS);
    }
}
