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

        this.dropSelf(GCBlocks.WILLOW_LOG.get()); // do not know how to strip logs, might need to be an advanced block instead
        this.dropSelf(GCBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(GCBlocks.WILLOW_WOOD.get());
        this.dropSelf(GCBlocks.WILLOW_PLANKS.get());
        this.dropSelf(GCBlocks.WILLOW_STAIRS.get());
        this.dropSelf(GCBlocks.WILLOW_BUTTON.get());
        this.dropSelf(GCBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(GCBlocks.WILLOW_TRAPDOOR.get());
        this.dropSelf(GCBlocks.WILLOW_FENCE.get());
        this.dropSelf(GCBlocks.WILLOW_FENCE_GATE.get());
        this.dropSelf(GCBlocks.WILLOW_WALL.get());

        this.add(GCBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(GCBlocks.WILLOW_SLAB.get()));
        this.add(GCBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(GCBlocks.WILLOW_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
