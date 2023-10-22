package net.brynnexvii.gemcraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Predicate;

import static java.lang.Math.max;

public class AlchemicalCauldron extends Block {
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

        if(!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND){
            //this will only get called once
            if(this.waterLevel != this.maxWaterlevel){
                if(pPlayer.getItemInHand(pHand).is(Items.WATER_BUCKET)){
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
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
}
