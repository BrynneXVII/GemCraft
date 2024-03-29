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
                .add(GCItems.RAW_GARNET.get(),
                        GCItems.RAW_SPHALERITE.get(),
                        GCItems.RAW_RUBY.get(),
                        GCItems.RAW_GOLDEN_BERYL.get(),
                        GCItems.RAW_CITRINE.get(),
                        GCItems.RAW_TOPAZ.get(),
                        GCItems.RAW_JADE.get(),
                        GCItems.RAW_PERIDOT.get(),
                        GCItems.RAW_EMERALD.get(),
                        GCItems.RAW_AQUAMARINE.get(),
                        GCItems.RAW_IOLITE.get(),
                        GCItems.RAW_SAPPHIRE.get(),
                        GCItems.RAW_AMETHYST.get(),
                        GCItems.RAW_CHAROITE.get(),
                        GCItems.RAW_TANZANITE.get(),
                        GCItems.RAW_ALBITE.get(),
                        GCItems.RAW_DENDRITIC_OPAL.get(),
                        GCItems.RAW_DIAMOND.get(),
                        GCItems.RAW_SMOKY_QUARTZ.get(),
                        GCItems.RAW_FERBERITE.get(),
                        GCItems.RAW_ONYX.get());

        this.tag(GCTags.Items.GEM_ORES)
                .add(Blocks.DIAMOND_ORE.asItem(),
                    Blocks.DEEPSLATE_DIAMOND_ORE.asItem(),
                    Blocks.EMERALD_ORE.asItem(),
                    Blocks.DEEPSLATE_EMERALD_ORE.asItem(),

                    GCBlocks.IGNIS_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_IGNIS_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_IGNIS_GEM_ORE.get().asItem(),

                    GCBlocks.ZEPHYR_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_ZEPHYR_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get().asItem(),

                    GCBlocks.TERRA_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_TERRA_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_TERRA_GEM_ORE.get().asItem(),

                    GCBlocks.MIZU_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_MIZU_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_MIZU_GEM_ORE.get().asItem(),

                    GCBlocks.AETHER_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_AETHER_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_AETHER_GEM_ORE.get().asItem(),

                    GCBlocks.LYS_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_LYS_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_LYS_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_LYS_GEM_ORE.get().asItem(),

                    GCBlocks.INANIS_GEM_ORE.get().asItem(),
                    GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get().asItem(),
                    GCBlocks.NETHER_INANIS_GEM_ORE.get().asItem(),
                    GCBlocks.END_STONE_INANIS_GEM_ORE.get().asItem()
                );

        this.tag(GCTags.Items.JEWEL_POWDERS)
                .add(GCItems.IGNIS_GEM_POWDER.get(),
                        GCItems.TERRA_GEM_POWDER.get(),
                        GCItems.LYS_GEM_POWDER.get());

        this.tag(ItemTags.SMALL_FLOWERS)
                .add(GCBlocks.VIOLET_LILY.get().asItem());

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
                        GCBlocks.STRIPPED_WILLOW_WOOD.get().asItem(),
                        GCBlocks.IGNIS_LOG.get().asItem(),
                        GCBlocks.STRIPPED_IGNIS_LOG.get().asItem(),
                        GCBlocks.IGNIS_WOOD.get().asItem(),
                        GCBlocks.STRIPPED_IGNIS_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(GCBlocks.WILLOW_PLANKS.get().asItem(),
                        GCBlocks.IGNIS_PLANKS.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(GCBlocks.WILLOW_SAPLING.get().asItem(),
                        GCBlocks.IGNIS_SAPLING.get().asItem());

        this.tag(GCTags.Items.WILLOW_LOGS)
                .add(GCBlocks.WILLOW_LOG.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get().asItem(),
                        GCBlocks.WILLOW_WOOD.get().asItem(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(GCTags.Items.IGNIS_LOGS)
                .add(GCBlocks.IGNIS_LOG.get().asItem(),
                        GCBlocks.STRIPPED_IGNIS_LOG.get().asItem(),
                        GCBlocks.IGNIS_WOOD.get().asItem(),
                        GCBlocks.STRIPPED_IGNIS_WOOD.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(GCBlocks.WILLOW_LEAVES.get().asItem(),
                        GCBlocks.IGNIS_LEAVES.get().asItem());

        //Special Blocks
        //--------------------------------------------------
        this.tag(ItemTags.BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get().asItem(),
                        GCBlocks.IGNIS_BUTTON.get().asItem());
        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get().asItem(),
                        GCBlocks.IGNIS_BUTTON.get().asItem());
        this.tag(ItemTags.DOORS)
                .add(GCBlocks.WILLOW_DOOR.get().asItem(),
                        GCBlocks.IGNIS_DOOR.get().asItem());
        this.tag(ItemTags.WOODEN_DOORS)
                .add(GCBlocks.WILLOW_DOOR.get().asItem(),
                        GCBlocks.IGNIS_DOOR.get().asItem());
        this.tag(ItemTags.FENCES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem(),
                        GCBlocks.IGNIS_FENCE.get().asItem());
        this.tag(ItemTags.WOODEN_FENCES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem(),
                        GCBlocks.IGNIS_FENCE.get().asItem());
        this.tag(ItemTags.FENCE_GATES)
                .add(GCBlocks.WILLOW_FENCE.get().asItem(),
                        GCBlocks.IGNIS_FENCE.get().asItem());
        this.tag(ItemTags.SLABS)
                .add(GCBlocks.WILLOW_SLAB.get().asItem(),
                        GCBlocks.IGNIS_SLAB.get().asItem());
        this.tag(ItemTags.WOODEN_SLABS)
                .add(GCBlocks.WILLOW_SLAB.get().asItem(),
                        GCBlocks.IGNIS_SLAB.get().asItem());
        this.tag(ItemTags.STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get().asItem(),
                        GCBlocks.IGNIS_STAIRS.get().asItem());
        this.tag(ItemTags.WOODEN_STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get().asItem(),
                        GCBlocks.IGNIS_STAIRS.get().asItem());
        this.tag(ItemTags.TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get().asItem(),
                        GCBlocks.IGNIS_TRAPDOOR.get().asItem());
        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get().asItem(),
                        GCBlocks.IGNIS_TRAPDOOR.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(GCBlocks.WILLOW_WALL.get().asItem(),
                        GCBlocks.IGNIS_WALL.get().asItem());

    }
}
