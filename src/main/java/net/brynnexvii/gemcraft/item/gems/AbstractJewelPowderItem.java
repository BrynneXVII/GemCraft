package net.brynnexvii.gemcraft.item.gems;

import net.brynnexvii.gemcraft.item.GemcraftAspectedItem;
import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AbstractJewelPowderItem extends GemcraftAspectedItem {

    public AbstractJewelPowderItem(Properties pProperties, GCRarity rarity, GCAspect aspect) {
        super(pProperties, rarity, aspect);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if(!level.isClientSide){
            BlockPos blockpos = pContext.getClickedPos();
            BlockState blockstate = level.getBlockState(blockpos);
            Player player = pContext.getPlayer();
            if(isInteractingFlower(blockstate)){
                pContext.getPlayer().sendSystemMessage(Component.literal("TEST - YES"));
                //level.addParticle(ParticleTypes.HAPPY_VILLAGER, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 2.5D, (double)blockpos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D); //not working????
                if (!player.getAbilities().instabuild) {
                    pContext.getItemInHand().shrink(1);
                }
                return InteractionResult.SUCCESS;
            }
            player.sendSystemMessage(Component.literal("TEST - NO"));
        }

        return InteractionResult.FAIL;
    }

    protected abstract boolean isInteractingFlower(BlockState state);
}
