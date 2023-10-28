package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GCBlockTagGenerator extends BlockTagsProvider {
    public GCBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GemCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.SMALL_FLOWERS)
                .add(GCBlocks.VIOLET_LILY.get());

        //Gemcraft Misc Tags
        //--------------------------------------------------
        this.tag(GCTags.Blocks.GEM_ORES)
                .add(Blocks.DIAMOND_ORE,
                        Blocks.DEEPSLATE_DIAMOND_ORE,
                        GCBlocks.NETHER_DIAMOND_ORE.get(),
                        GCBlocks.END_STONE_DIAMOND_ORE.get(),
                        Blocks.EMERALD_ORE,
                        Blocks.DEEPSLATE_EMERALD_ORE,
                        GCBlocks.NETHER_EMERALD_ORE.get(),
                        GCBlocks.END_STONE_EMERALD_ORE.get(),
                        GCBlocks.RUBY_ORE.get(),
                        GCBlocks.DEEPSLATE_RUBY_ORE.get(),
                        GCBlocks.NETHER_RUBY_ORE.get(),
                        GCBlocks.END_STONE_RUBY_ORE.get());

        //Gem Powder Flower Tags
        //--------------------------------------------------
        this.tag(GCTags.Blocks.GREEN_INTERACTING_FLOWERS)
                .add(Blocks.CACTUS,
                        Blocks.FERN); //can do .addTag for a whole class of items in an existing tag like "ores"
        this.tag(GCTags.Blocks.RED_INTERACTING_FLOWERS)
                .add(Blocks.POPPY,
                        Blocks.ROSE_BUSH,
                        Blocks.RED_TULIP);
        this.tag(GCTags.Blocks.WHITE_INTERACTING_FLOWERS)
                .add(Blocks.LILY_OF_THE_VALLEY,
                        Blocks.AZURE_BLUET,
                        Blocks.WHITE_TULIP,
                        Blocks.OXEYE_DAISY);

        //Tool Type Tags
        //--------------------------------------------------
        this.tag(BlockTags.MINEABLE_WITH_AXE);
        this.tag(BlockTags.MINEABLE_WITH_HOE);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GCBlocks.RUBY_BLOCK.get(),
                        GCBlocks.RUBY_ORE.get(),
                        GCBlocks.DEEPSLATE_RUBY_ORE.get(),
                        GCBlocks.NETHER_RUBY_ORE.get(),
                        GCBlocks.NETHER_DIAMOND_ORE.get(),
                        GCBlocks.NETHER_EMERALD_ORE.get(),
                        GCBlocks.END_STONE_DIAMOND_ORE.get(),
                        GCBlocks.END_STONE_RUBY_ORE.get(),
                        GCBlocks.END_STONE_EMERALD_ORE.get()
                );
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);

        //Tool Material Tags
        //--------------------------------------------------
        this.tag(BlockTags.NEEDS_STONE_TOOL);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(GCBlocks.RUBY_BLOCK.get(),
                        GCBlocks.RUBY_ORE.get(),
                        GCBlocks.DEEPSLATE_RUBY_ORE.get(),
                        GCBlocks.NETHER_RUBY_ORE.get(),
                        GCBlocks.NETHER_DIAMOND_ORE.get(),
                        GCBlocks.NETHER_EMERALD_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(GCBlocks.END_STONE_DIAMOND_ORE.get(),
                        GCBlocks.END_STONE_RUBY_ORE.get(),
                        GCBlocks.END_STONE_EMERALD_ORE.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        //Special Block Tags
        //--------------------------------------------------
        this.tag(BlockTags.FENCES)
                .add(GCBlocks.WILLOW_FENCE.get());
        this.tag(BlockTags.WOODEN_FENCES)
                .add(GCBlocks.WILLOW_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(GCBlocks.WILLOW_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(GCBlocks.WILLOW_WALL.get());
        this.tag(BlockTags.BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get());
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get());
        this.tag(BlockTags.TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get());
        this.tag(BlockTags.PRESSURE_PLATES)
                .add(GCBlocks.WILLOW_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(GCBlocks.WILLOW_PRESSURE_PLATE.get());
        this.tag(BlockTags.DOORS)
                .add(GCBlocks.WILLOW_DOOR.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(GCBlocks.WILLOW_DOOR.get());
        this.tag(BlockTags.SLABS)
                .add(GCBlocks.WILLOW_SLAB.get());
        this.tag(BlockTags.WOODEN_SLABS)
                .add(GCBlocks.WILLOW_SLAB.get());
        this.tag(BlockTags.STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get());
        this.tag(BlockTags.WOODEN_STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get());

        //Wood Tags
        //--------------------------------------------------
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(GCBlocks.WILLOW_LOG.get(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get(),
                        GCBlocks.WILLOW_WOOD.get(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get());
        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(GCBlocks.WILLOW_LOG.get());
        this.tag(BlockTags.PLANKS)
                .add(GCBlocks.WILLOW_PLANKS.get());

        this.tag(GCTags.Blocks.WILLOW_LOGS)
                .add(GCBlocks.WILLOW_LOG.get(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get(),
                        GCBlocks.WILLOW_WOOD.get(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get());
        this.tag(BlockTags.LEAVES)
                .add(GCBlocks.WILLOW_LEAVES.get());
        this.tag(BlockTags.SAPLINGS)
                .add(GCBlocks.WILLOW_SAPLING.get());
    }
}
