package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.brynnexvii.gemcraft.utility.GCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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

    }
}
