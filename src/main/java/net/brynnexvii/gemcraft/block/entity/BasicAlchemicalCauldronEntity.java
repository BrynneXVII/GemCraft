package net.brynnexvii.gemcraft.block.entity;

import net.brynnexvii.gemcraft.screen.BasicAlchemicalCauldronMenu;
import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BasicAlchemicalCauldronEntity extends AbstractAlchemicalCauldronEntity {
    private class BasicAlchemicalCauldronItemStackHandler extends ItemStackHandler {
        public BasicAlchemicalCauldronItemStackHandler (int size){
            super(size);
        }
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 0 -> true; //1st slot is, say, the ingredient input
                case 1 -> stack.is(GCTags.Items.JEWEL_POWDERS); //2nd slot for jewel powder reagent (can also use stack.getItem() == )
                case 2 -> false; //output
                default -> super.isItemValid(slot, stack);
            };
        }
    }

    private final ItemStackHandler itemHandler;

    public BasicAlchemicalCauldronEntity(BlockPos pPos, BlockState pBlockState) {
        super(GCBlockEntities.BASIC_ALCHEMICAL_CAULDRON_BLOCK_ENTITY.get(), pPos, pBlockState, new int[]{0}, new int[]{1}, new int[]{2});
        itemHandler = new BasicAlchemicalCauldronItemStackHandler(3);
    }

    @Override
    protected ItemStackHandler getItemHandler(){
        return itemHandler;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer){
        return new BasicAlchemicalCauldronMenu(pContainerId, pPlayerInventory, this, this.data);
    }

}
