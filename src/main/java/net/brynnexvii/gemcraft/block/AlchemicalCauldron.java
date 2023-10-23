package net.brynnexvii.gemcraft.block;

import net.brynnexvii.gemcraft.block.entity.AlchemicalCauldronEntity;
import net.brynnexvii.gemcraft.block.entity.GCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

import static java.lang.Math.max;

public abstract class AlchemicalCauldron extends BaseEntityBlock {
    public final VoxelShape SHAPE; //collision box
    protected final int maxWaterlevel;
    private int waterLevel = 0;

    public AlchemicalCauldron(Properties pProperties, int maxWater, VoxelShape shape) {
        super(pProperties);
        this.maxWaterlevel = maxWater;
        this.SHAPE = shape;
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        //by default is called 4 times, offhand and main hand on each of server and client

        if(!pLevel.isClientSide()){
            if(pHand == InteractionHand.MAIN_HAND) {
                if (this.waterLevel != this.maxWaterlevel) {
                    if (pPlayer.getItemInHand(pHand).is(Items.WATER_BUCKET)) {
                        System.out.println("Filled with water bucket"); //need to empty bucket
                        pLevel.playSound(null, pPos, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS, 1f, 1f);  //if playing sound on server, everyone around except given player will hear
                        this.waterLevel = max(this.maxWaterlevel, this.waterLevel + 1000);
                        //empty bucket!
                        return InteractionResult.SUCCESS;
                    } else if (pPlayer.getItemInHand(pHand).is((Predicate<Holder<Item>>) Potions.WATER)) { //this may not work
                        System.out.println("Filled with water bottle");
                        pLevel.playSound(null, pPos, SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1f, 1f);
                        this.waterLevel = max(this.maxWaterlevel, this.waterLevel + 333);
                        //empty bottle
                        return InteractionResult.SUCCESS;
                    }
                }
            }

            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof AlchemicalCauldronEntity){
                NetworkHooks.openScreen(((ServerPlayer) pPlayer), (AlchemicalCauldronEntity) entity, pPos);
            } else {
                throw new IllegalStateException("Our container provider is missing!");
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    /* BLOCK ENTITY */

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL; //makes the block not invisible
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if(pState.getBlock() != pNewState.getBlock()){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof AlchemicalCauldronEntity){
                ((AlchemicalCauldronEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Nullable
    @Override
    public abstract <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType);

    @Nullable
    @Override
    public abstract BlockEntity newBlockEntity(BlockPos pPos, BlockState pState);
}
