package net.brynnexvii.gemcraft.item;

import net.brynnexvii.gemcraft.utility.GCClientAccess;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemcraftAspectedItem extends Item {

    private final GCRarity rarity;
    private final GCAspect aspect;
    public GemcraftAspectedItem(Properties pProperties, GCRarity rarity, GCAspect aspect) {
        super(pProperties);
        this.rarity = rarity;
        this.aspect = aspect;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        Component baseTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".tooltip");
        Component expandedTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".expanded_tooltip");
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> GCClientAccess.expandedItemTooltip(pLevel, pTooltipComponents, baseTooltip, expandedTooltip, this.aspect));
        //super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
