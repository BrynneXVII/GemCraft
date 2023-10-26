package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GCItemTagGenerator extends ItemTagsProvider {
    public GCItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, GemCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(GCTags.Items.RAW_GEMS)
                .add(GCItems.RAW_DIAMOND.get(),
                        GCItems.RAW_EMERALD.get(),
                        GCItems.RAW_RUBY.get());

        this.tag(GCTags.Items.GEM_ORES)
                .add(Blocks.DIAMOND_ORE.asItem(),
                    Blocks.DEEPSLATE_DIAMOND_ORE.asItem(),
                    GCBlocks.NETHER_DIAMOND_ORE.get().asItem(),
                    GCBlocks.END_STONE_DIAMOND_ORE.get().asItem(),
                    Blocks.EMERALD_ORE.asItem(),
                    Blocks.DEEPSLATE_EMERALD_ORE.asItem(),
                    GCBlocks.NETHER_EMERALD_ORE.get().asItem(),
                    GCBlocks.END_STONE_EMERALD_ORE.get().asItem(),
                    GCBlocks.RUBY_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_RUBY_ORE.get().asItem(),
                    GCBlocks.NETHER_RUBY_ORE.get().asItem(),
                    GCBlocks.END_STONE_RUBY_ORE.get().asItem());

        this.tag(GCTags.Items.JEWEL_POWDERS)
                .add(GCItems.DIAMOND_POWDER.get(),
                        GCItems.EMERALD_POWDER.get(),
                        GCItems.RUBY_POWDER.get());

        //Herbs
        //--------------------------------------------------
        this.tag(GCTags.Items.HERBS)
                .add(GCItems.MINT.get());

        //Wood Tags
        //--------------------------------------------------
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(GCBlocks.WILLOW_LOG.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get().asItem(),
                        GCBlocks.WILLOW_WOOD.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(GCBlocks.WILLOW_PLANKS.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(GCBlocks.WILLOW_SAPLING.get().asItem());

        this.tag(GCTags.Items.WILLOW_LOGS)
                .add(GCBlocks.WILLOW_LOG.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get().asItem(),
                        GCBlocks.WILLOW_WOOD.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(GCBlocks.WILLOW_LEAVES.get().asItem());

        //Special Blocks
        //--------------------------------------------------
        this.tag(ItemTags.BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get().asItem());
        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get().asItem());
        this.tag(ItemTags.DOORS)
                .add(GCBlocks.WILLOW_DOOR.get().asItem());
        this.tag(ItemTags.WOODEN_DOORS)
                .add(GCBlocks.WILLOW_DOOR.get().asItem());
        this.tag(ItemTags.FENCES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem());
        this.tag(ItemTags.WOODEN_FENCES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem());
        this.tag(ItemTags.FENCE_GATES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem());
        this.tag(ItemTags.SLABS)
                .add(GCBlocks.WILLOW_SLAB.get().asItem());
        this.tag(ItemTags.WOODEN_SLABS)
                .add(GCBlocks.WILLOW_SLAB.get().asItem());
        this.tag(ItemTags.STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get().asItem());
        this.tag(ItemTags.WOODEN_STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get().asItem());
        this.tag(ItemTags.TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get().asItem());
        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(GCBlocks.WILLOW_WALL.get().asItem());

    }
}
