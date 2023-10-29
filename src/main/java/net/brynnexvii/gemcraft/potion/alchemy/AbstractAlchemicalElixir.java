package net.brynnexvii.gemcraft.potion.alchemy;

import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public abstract class AbstractAlchemicalElixir extends Item {
    private static final int DRINK_DURATION = 20;

    public AbstractAlchemicalElixir(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        super.finishUsingItem(stack, level, entity);
        if(entity instanceof ServerPlayer player){
            CriteriaTriggers.CONSUME_ITEM.trigger(player, stack);
            player.awardStat(Stats.ITEM_USED.get(this));
        }

        if(!level.isClientSide){
            addAlchemicalPotionEffects(level, entity); //effects here
        }

        if(stack.isEmpty()){
            return new ItemStack(GCItems.GLASS_VIAL.get());
        } else {
            if(entity instanceof Player && !((Player) entity).getAbilities().instabuild){
                ItemStack itemStack = new ItemStack(GCItems.GLASS_VIAL.get());
                Player player = (Player) entity;
                if(!player.getInventory().add(itemStack)){
                    player.drop(itemStack, false);
                }
            }

        }

        return stack;
    }

    protected abstract void addAlchemicalPotionEffects(Level level, LivingEntity entity);

    @Override
    public int getUseDuration(ItemStack pStack) {
        return DRINK_DURATION;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);
    }
}
