package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class GCBlockStateProvider extends BlockStateProvider {
    public GCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GemCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GCBlocks.RUBY_BLOCK);
        blockWithItem(GCBlocks.RUBY_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(GCBlocks.NETHER_RUBY_ORE);
        blockWithItem(GCBlocks.END_STONE_RUBY_ORE);

        blockWithItem(GCBlocks.NETHER_DIAMOND_ORE);
        blockWithItem(GCBlocks.END_STONE_DIAMOND_ORE);

        blockWithItem(GCBlocks.NETHER_EMERALD_ORE);
        blockWithItem(GCBlocks.END_STONE_EMERALD_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
