package net.brynnexvii.gemcraft.block.entity;

import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AlchemicalCauldronEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler;
    protected final int [] INPUT_SLOTS;
    protected final int [] JEWEL_POWDER_SLOTS;
    protected final int [] OUTPUT_SLOTS;
    protected LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProg = 100; //max processing duration, can adapt to be based on individual recipes


    public AlchemicalCauldronEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int [] input_slots, int [] jewel_powder_slots, int [] output_slots) {
        super(pType, pPos, pBlockState);
        this.itemHandler = setItemHandler();
        this.INPUT_SLOTS = input_slots;
        this.JEWEL_POWDER_SLOTS = jewel_powder_slots;
        this.OUTPUT_SLOTS = output_slots;
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex){
                    case 0 -> AlchemicalCauldronEntity.this.progress;
                    case 1 -> AlchemicalCauldronEntity.this.maxProg;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex){
                    case 0 -> AlchemicalCauldronEntity.this.progress = pValue;
                    case 1 -> AlchemicalCauldronEntity.this.maxProg = pValue;
                };
            }

            @Override
            public int getCount() {
                return 2; //2 because there are 2 ints to synchronize, progress and max progress
            }
        };
    }

    protected abstract ItemStackHandler setItemHandler();

    @Override
    public Component getDisplayName() {
        return Component.literal("Basic Alch Cauld");
        //return Component.translatable(GemCraft.MODID + "." + this.getBlockState().getBlock().getName()); ***SEE IF THIS WORKS LATER
    }

    @Nullable
    @Override
    public abstract AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer);

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++){
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {

    }

}
