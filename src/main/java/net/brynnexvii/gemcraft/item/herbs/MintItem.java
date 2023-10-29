package net.brynnexvii.gemcraft.item.herbs;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MintItem extends AbstractHerbItem {
    // calming, soothing, grounded

    public MintItem(Properties pProperties) {
        super(pProperties, new int[]{3, 4}); //aligned with water and earth
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("gemcraft.mint.base_tool_tip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
