package net.brynnexvii.gemcraft.screen;

import net.brynnexvii.gemcraft.block.GCBlocks;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;

public class BasicAlchemicalCauldronMenu extends AbstractAlchemicalCauldronMenu {

    public BasicAlchemicalCauldronMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        super(pContainerId, inv, extraData, 3, GCMenuTypes.BASIC_ALCHEMICAL_CAULDRON_MENU.get());
    }

    public BasicAlchemicalCauldronMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data){
        super(pContainerId, inv, entity, data, 3, GCMenuTypes.BASIC_ALCHEMICAL_CAULDRON_MENU.get());
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get());
    }

    protected void setSlots(){ //should this be void?
        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(iItemHandler -> {
            this.addSlot(new SlotItemHandler(iItemHandler, 0, 46, 36)); //numbers are gui dependant, top left corner of each slot
            this.addSlot(new SlotItemHandler(iItemHandler, 1, 83, 16));
            this.addSlot(new SlotItemHandler(iItemHandler, 2, 112, 36));
        });
    }
}
