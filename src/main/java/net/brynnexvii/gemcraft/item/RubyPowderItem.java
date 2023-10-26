package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RubyPowderItem extends AbstractJewelPowderItem {

    public RubyPowderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("gemcraft.ruby_powder.base_tool_tip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    protected boolean isInteractingFlower(BlockState state){
        return state.is(GCTags.Blocks.RED_INTERACTING_FLOWERS);
    }


}
