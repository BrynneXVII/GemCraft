package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.utility.GCClientAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RawGemItem extends Item {
    public enum Rarity {
        COMMON, UNCOMMON, RARE
    }

    private final Rarity rarity;
    public RawGemItem(Properties pProperties, Rarity rarity) {
        super(pProperties);
        this.rarity = rarity;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        Component baseTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".tooltip");
        Component expandedTooltip = Component.translatable("item." + (pStack.getDescriptionId()).split("[.]", 2)[1] + ".expanded_tooltip");
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> GCClientAccess.expandedItemTooltip(pLevel, pTooltipComponents, baseTooltip, expandedTooltip));
        //super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
