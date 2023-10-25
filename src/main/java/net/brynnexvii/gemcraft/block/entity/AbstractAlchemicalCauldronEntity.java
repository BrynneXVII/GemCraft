package net.brynnexvii.gemcraft.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractAlchemicalCauldronEntity extends BlockEntity implements MenuProvider {
    protected final int [] INPUT_SLOTS;
    protected final int [] JEWEL_POWDER_SLOTS;
    protected final int [] OUTPUT_SLOTS;
    protected LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProg = 100; //max processing duration, can adapt to be based on individual recipes


    public AbstractAlchemicalCauldronEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int [] input_slots, int [] jewel_powder_slots, int [] output_slots) {
        super(pType, pPos, pBlockState);
        this.INPUT_SLOTS = input_slots;
        this.JEWEL_POWDER_SLOTS = jewel_powder_slots;
        this.OUTPUT_SLOTS = output_slots;
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex){
                    case 0 -> AbstractAlchemicalCauldronEntity.this.progress;
                    case 1 -> AbstractAlchemicalCauldronEntity.this.maxProg;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex){
                    case 0 -> AbstractAlchemicalCauldronEntity.this.progress = pValue;
                    case 1 -> AbstractAlchemicalCauldronEntity.this.maxProg = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2; //2 because there are 2 ints to synchronize, progress and max progress
            }
        };
    }

    protected abstract ItemStackHandler getItemHandler();

    @Override
    public Component getDisplayName() {
        return Component.literal("Basic Alchemical Cauldron!");
        //return Component.translatable(GemCraft.MODID + "." + this.getBlockState().getBlock().getName()); //***SEE IF THIS WORKS LATER
    }

    @Nullable
    @Override
    public abstract AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer);

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(this::getItemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", getItemHandler().serializeNBT());
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        getItemHandler().deserializeNBT(pTag.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(getItemHandler().getSlots());
        for(int i = 0; i < getItemHandler().getSlots(); i++){
            inventory.setItem(i, getItemHandler().getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {

    }

}
