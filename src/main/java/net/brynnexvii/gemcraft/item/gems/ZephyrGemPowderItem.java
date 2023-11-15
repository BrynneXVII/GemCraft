package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.level.block.state.BlockState;

public class ZephyrGemPowderItem extends AbstractJewelPowderItem{
    public ZephyrGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.ZEPHYR);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.ZEPHYR_ASPECTED_FLOWERS);
    }
}
