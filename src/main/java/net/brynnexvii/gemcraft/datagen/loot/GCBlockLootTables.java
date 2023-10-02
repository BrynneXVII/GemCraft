package net.brynnexvii.gemcraft.datagen.loot;

import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class GCBlockLootTables extends BlockLootSubProvider {

    public GCBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(GCBlocks.RUBY_BLOCK.get());

        this.add(GCBlocks.NETHER_DIAMOND_ORE.get(),
                block -> createOreDrop(GCBlocks.NETHER_DIAMOND_ORE.get(), GCItems.RAW_DIAMOND.get()));
        this.add(GCBlocks.END_STONE_DIAMOND_ORE.get(),
                block -> createOreDrop(GCBlocks.END_STONE_DIAMOND_ORE.get(), GCItems.RAW_DIAMOND.get()));
        this.add(GCBlocks.NETHER_EMERALD_ORE.get(),
                block -> createOreDrop(GCBlocks.NETHER_EMERALD_ORE.get(), GCItems.RAW_EMERALD.get()));
        this.add(GCBlocks.END_STONE_EMERALD_ORE.get(),
                block -> createOreDrop(GCBlocks.END_STONE_EMERALD_ORE.get(), GCItems.RAW_EMERALD.get()));
        this.add(GCBlocks.RUBY_ORE.get(),
                block -> createOreDrop(GCBlocks.RUBY_ORE.get(), GCItems.RAW_RUBY.get()));
        this.add(GCBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(GCBlocks.DEEPSLATE_RUBY_ORE.get(), GCItems.RAW_RUBY.get()));
        this.add(GCBlocks.NETHER_RUBY_ORE.get(),
                block -> createOreDrop(GCBlocks.NETHER_RUBY_ORE.get(), GCItems.RAW_RUBY.get()));
        this.add(GCBlocks.END_STONE_RUBY_ORE.get(),
                block -> createOreDrop(GCBlocks.END_STONE_RUBY_ORE.get(), GCItems.RAW_RUBY.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
