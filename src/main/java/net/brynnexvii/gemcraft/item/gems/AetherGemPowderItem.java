package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.world.level.block.state.BlockState;

public class AetherGemPowderItem extends AbstractJewelPowderItem{
    public AetherGemPowderItem(Properties pProperties) {
        super(pProperties, null, GCAspect.AETHER);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state) {
        return state.is(GCTags.Blocks.AETHER_ASPECTED_FLOWERS);
    }
}
