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
                        Blocks.EMERALD_ORE,
                        Blocks.DEEPSLATE_EMERALD_ORE,

                        GCBlocks.IGNIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get(),
                        GCBlocks.NETHER_IGNIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_IGNIS_GEM_ORE.get(),

                        GCBlocks.ZEPHYR_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.NETHER_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get(),

                        GCBlocks.TERRA_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get(),
                        GCBlocks.NETHER_TERRA_GEM_ORE.get(),
                        GCBlocks.END_STONE_TERRA_GEM_ORE.get(),

                        GCBlocks.MIZU_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get(),
                        GCBlocks.NETHER_MIZU_GEM_ORE.get(),
                        GCBlocks.END_STONE_MIZU_GEM_ORE.get(),

                        GCBlocks.AETHER_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get(),
                        GCBlocks.NETHER_AETHER_GEM_ORE.get(),
                        GCBlocks.END_STONE_AETHER_GEM_ORE.get(),

                        GCBlocks.LYS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_LYS_GEM_ORE.get(),
                        GCBlocks.NETHER_LYS_GEM_ORE.get(),
                        GCBlocks.END_STONE_LYS_GEM_ORE.get(),

                        GCBlocks.INANIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get(),
                        GCBlocks.NETHER_INANIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_INANIS_GEM_ORE.get()
                        );

        //Gem Powder Flower Tags
        //--------------------------------------------------
        this.tag(GCTags.Blocks.IGNIS_ASPECTED_FLOWERS)
                .add(Blocks.POPPY,
                        Blocks.ROSE_BUSH,
                        Blocks.RED_TULIP);
        this.tag(GCTags.Blocks.ZEPHYR_ASPECTED_FLOWERS)
                .add(Blocks.DANDELION);
        this.tag(GCTags.Blocks.TERRA_ASPECTED_FLOWERS)
                .add(Blocks.CACTUS,
                        Blocks.FERN); //can do .addTag for a whole class of items in an existing tag like "ores"
        this.tag(GCTags.Blocks.MIZU_ASPECTED_FLOWERS)
                .add(Blocks.CORNFLOWER,
                        Blocks.BLUE_ORCHID);
        this.tag(GCTags.Blocks.AETHER_ASPECTED_FLOWERS)
                .add(GCBlocks.VIOLET_LILY.get());
        this.tag(GCTags.Blocks.LYS_ASPECTED_FLOWERS)
                .add(Blocks.LILY_OF_THE_VALLEY,
                        Blocks.AZURE_BLUET,
                        Blocks.WHITE_TULIP,
                        Blocks.OXEYE_DAISY);
        this.tag(GCTags.Blocks.INANIS_ASPECTED_FLOWERS)
                .add(Blocks.WITHER_ROSE);

        //Tool Type Tags
        //--------------------------------------------------
        this.tag(BlockTags.MINEABLE_WITH_AXE);
        this.tag(BlockTags.MINEABLE_WITH_HOE);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GCBlocks.RUBY_BLOCK.get(),
                        GCBlocks.IGNIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get(),
                        GCBlocks.NETHER_IGNIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_IGNIS_GEM_ORE.get(),

                        GCBlocks.ZEPHYR_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.NETHER_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get(),

                        GCBlocks.TERRA_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get(),
                        GCBlocks.NETHER_TERRA_GEM_ORE.get(),
                        GCBlocks.END_STONE_TERRA_GEM_ORE.get(),

                        GCBlocks.MIZU_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get(),
                        GCBlocks.NETHER_MIZU_GEM_ORE.get(),
                        GCBlocks.END_STONE_MIZU_GEM_ORE.get(),

                        GCBlocks.AETHER_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get(),
                        GCBlocks.NETHER_AETHER_GEM_ORE.get(),
                        GCBlocks.END_STONE_AETHER_GEM_ORE.get(),

                        GCBlocks.LYS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_LYS_GEM_ORE.get(),
                        GCBlocks.NETHER_LYS_GEM_ORE.get(),
                        GCBlocks.END_STONE_LYS_GEM_ORE.get(),

                        GCBlocks.INANIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get(),
                        GCBlocks.NETHER_INANIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_INANIS_GEM_ORE.get()
                );
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);

        //Tool Material Tags
        //--------------------------------------------------
        this.tag(BlockTags.NEEDS_STONE_TOOL);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(GCBlocks.RUBY_BLOCK.get(),
                        GCBlocks.IGNIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_IGNIS_GEM_ORE.get(),
                        GCBlocks.NETHER_IGNIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_IGNIS_GEM_ORE.get(),

                        GCBlocks.ZEPHYR_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.NETHER_ZEPHYR_GEM_ORE.get(),
                        GCBlocks.END_STONE_ZEPHYR_GEM_ORE.get(),

                        GCBlocks.TERRA_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_TERRA_GEM_ORE.get(),
                        GCBlocks.NETHER_TERRA_GEM_ORE.get(),
                        GCBlocks.END_STONE_TERRA_GEM_ORE.get(),

                        GCBlocks.MIZU_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_MIZU_GEM_ORE.get(),
                        GCBlocks.NETHER_MIZU_GEM_ORE.get(),
                        GCBlocks.END_STONE_MIZU_GEM_ORE.get(),

                        GCBlocks.AETHER_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_AETHER_GEM_ORE.get(),
                        GCBlocks.NETHER_AETHER_GEM_ORE.get(),
                        GCBlocks.END_STONE_AETHER_GEM_ORE.get(),

                        GCBlocks.LYS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_LYS_GEM_ORE.get(),
                        GCBlocks.NETHER_LYS_GEM_ORE.get(),
                        GCBlocks.END_STONE_LYS_GEM_ORE.get(),

                        GCBlocks.INANIS_GEM_ORE.get(),
                        GCBlocks.DEEPSLATE_INANIS_GEM_ORE.get(),
                        GCBlocks.NETHER_INANIS_GEM_ORE.get(),
                        GCBlocks.END_STONE_INANIS_GEM_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        //Special Block Tags
        //--------------------------------------------------
        this.tag(BlockTags.FENCES)
                .add(GCBlocks.WILLOW_FENCE.get(),
                        GCBlocks.IGNIS_FENCE.get());
        this.tag(BlockTags.WOODEN_FENCES)
                .add(GCBlocks.WILLOW_FENCE.get(),
                        GCBlocks.IGNIS_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(GCBlocks.WILLOW_FENCE_GATE.get(),
                        GCBlocks.IGNIS_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(GCBlocks.WILLOW_WALL.get(),
                        GCBlocks.IGNIS_WALL.get());
        this.tag(BlockTags.BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get(),
                        GCBlocks.IGNIS_BUTTON.get());
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(GCBlocks.WILLOW_BUTTON.get(),
                        GCBlocks.IGNIS_BUTTON.get());
        this.tag(BlockTags.TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get(),
                        GCBlocks.IGNIS_TRAPDOOR.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(GCBlocks.WILLOW_TRAPDOOR.get(),
                        GCBlocks.IGNIS_TRAPDOOR.get());
        this.tag(BlockTags.PRESSURE_PLATES)
                .add(GCBlocks.WILLOW_PRESSURE_PLATE.get(),
                        GCBlocks.IGNIS_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(GCBlocks.WILLOW_PRESSURE_PLATE.get(),
                        GCBlocks.IGNIS_PRESSURE_PLATE.get());
        this.tag(BlockTags.DOORS)
                .add(GCBlocks.WILLOW_DOOR.get(),
                        GCBlocks.IGNIS_DOOR.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(GCBlocks.WILLOW_DOOR.get(),
                        GCBlocks.IGNIS_DOOR.get());
        this.tag(BlockTags.SLABS)
                .add(GCBlocks.WILLOW_SLAB.get(),
                        GCBlocks.IGNIS_SLAB.get());
        this.tag(BlockTags.WOODEN_SLABS)
                .add(GCBlocks.WILLOW_SLAB.get(),
                        GCBlocks.IGNIS_SLAB.get());
        this.tag(BlockTags.STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get(),
                        GCBlocks.IGNIS_STAIRS.get());
        this.tag(BlockTags.WOODEN_STAIRS)
                .add(GCBlocks.WILLOW_STAIRS.get(),
                        GCBlocks.IGNIS_STAIRS.get());

        //Wood Tags
        //--------------------------------------------------
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(GCBlocks.WILLOW_LOG.get(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get(),
                        GCBlocks.WILLOW_WOOD.get(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get(),
                        GCBlocks.IGNIS_LOG.get(),
                        GCBlocks.STRIPPED_IGNIS_LOG.get(),
                        GCBlocks.IGNIS_WOOD.get(),
                        GCBlocks.STRIPPED_IGNIS_WOOD.get());
        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(GCBlocks.WILLOW_LOG.get(),
                        GCBlocks.IGNIS_LOG.get());
        this.tag(BlockTags.PLANKS)
                .add(GCBlocks.WILLOW_PLANKS.get(),
                        GCBlocks.IGNIS_PLANKS.get());

        this.tag(GCTags.Blocks.WILLOW_LOGS)
                .add(GCBlocks.WILLOW_LOG.get(),
                        GCBlocks.STRIPPED_WILLOW_LOG.get(),
                        GCBlocks.WILLOW_WOOD.get(),
                        GCBlocks.STRIPPED_WILLOW_WOOD.get());
        this.tag(GCTags.Blocks.IGNIS_LOGS)
                .add(GCBlocks.IGNIS_LOG.get(),
                        GCBlocks.STRIPPED_IGNIS_LOG.get(),
                        GCBlocks.IGNIS_WOOD.get(),
                        GCBlocks.STRIPPED_IGNIS_WOOD.get());

        this.tag(BlockTags.LEAVES)
                .add(GCBlocks.WILLOW_LEAVES.get(),
                        GCBlocks.IGNIS_LEAVES.get());
        this.tag(BlockTags.SAPLINGS)
                .add(GCBlocks.WILLOW_SAPLING.get(),
                        GCBlocks.IGNIS_SAPLING.get());
    }
}
