package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.block.crops.GCCropBlock;
import net.brynnexvii.gemcraft.block.crops.ParsnipCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class GCBlockStateProvider extends BlockStateProvider {
    public GCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GemCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GCBlocks.WILLOW_PLANKS);
        blockItem(GCBlocks.STRIPPED_WILLOW_LOG);
        blockItem(GCBlocks.STRIPPED_WILLOW_WOOD);
        blockItem(GCBlocks.WILLOW_LOG);
        blockItem(GCBlocks.WILLOW_WOOD);
        blockItem(GCBlocks.WILLOW_LEAVES);

        blockWithItem(GCBlocks.IGNIS_PLANKS);
        blockItem(GCBlocks.STRIPPED_IGNIS_LOG);
        blockItem(GCBlocks.STRIPPED_IGNIS_WOOD);
        blockItem(GCBlocks.IGNIS_LOG);
        blockItem(GCBlocks.IGNIS_WOOD);
        blockItem(GCBlocks.IGNIS_LEAVES);

        blockWithItem(GCBlocks.RUBY_BLOCK);
        blockWithItem(GCBlocks.PORTAL_BLOCK);

        blockWithItem(GCBlocks.IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_IGNIS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_IGNIS_GEM_ORE);

        blockWithItem(GCBlocks.ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_ZEPHYR_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_ZEPHYR_GEM_ORE);

        blockWithItem(GCBlocks.TERRA_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_TERRA_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_TERRA_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_TERRA_GEM_ORE);

        blockWithItem(GCBlocks.MIZU_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_MIZU_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_MIZU_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_MIZU_GEM_ORE);

        blockWithItem(GCBlocks.AETHER_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_AETHER_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_AETHER_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_AETHER_GEM_ORE);

        blockWithItem(GCBlocks.LYS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_LYS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_LYS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_LYS_GEM_ORE);

        blockWithItem(GCBlocks.INANIS_GEM_ORE);
        blockWithItem(GCBlocks.DEEPSLATE_INANIS_GEM_ORE);
        blockWithItem(GCBlocks.NETHER_INANIS_GEM_ORE);
        blockWithItem(GCBlocks.END_STONE_INANIS_GEM_ORE);


        //horizontalBlock(GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get(), new ModelFile.UncheckedModelFile(modLoc("block/basic_alchemical_cauldron")));
        altBlockWithItem(GCBlocks.BASIC_ALCHEMICAL_CAULDRON);


        logBlock((RotatedPillarBlock) GCBlocks.WILLOW_LOG.get());
        axisBlock((RotatedPillarBlock) GCBlocks.WILLOW_WOOD.get(), blockTexture(GCBlocks.WILLOW_LOG.get()), blockTexture(GCBlocks.WILLOW_LOG.get()));
        axisBlock((RotatedPillarBlock) GCBlocks.STRIPPED_WILLOW_LOG.get(), new ResourceLocation(GemCraft.MODID, "block/stripped_willow_log"),
                new ResourceLocation(GemCraft.MODID, "block/stripped_willow_log_top"));
        axisBlock((RotatedPillarBlock) GCBlocks.STRIPPED_WILLOW_WOOD.get(), new ResourceLocation(GemCraft.MODID, "block/stripped_willow_log"),
                new ResourceLocation(GemCraft.MODID, "block/stripped_willow_log"));

        saplingBlock(GCBlocks.WILLOW_SAPLING);
        leavesBlock(GCBlocks.WILLOW_LEAVES);

        stairsBlock(((StairBlock) GCBlocks.WILLOW_STAIRS.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) GCBlocks.WILLOW_SLAB.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        buttonBlock(((ButtonBlock) GCBlocks.WILLOW_BUTTON.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) GCBlocks.WILLOW_PRESSURE_PLATE.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        fenceBlock(((FenceBlock) GCBlocks.WILLOW_FENCE.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) GCBlocks.WILLOW_FENCE_GATE.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        wallBlock(((WallBlock) GCBlocks.WILLOW_WALL.get()), blockTexture(GCBlocks.WILLOW_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) GCBlocks.WILLOW_DOOR.get()), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) GCBlocks.WILLOW_TRAPDOOR.get()), modLoc("block/willow_trapdoor"), true, "cutout");

        logBlock((RotatedPillarBlock) GCBlocks.IGNIS_LOG.get());
        axisBlock((RotatedPillarBlock) GCBlocks.IGNIS_WOOD.get(), blockTexture(GCBlocks.IGNIS_LOG.get()), blockTexture(GCBlocks.IGNIS_LOG.get()));
        axisBlock((RotatedPillarBlock) GCBlocks.STRIPPED_IGNIS_LOG.get(), new ResourceLocation(GemCraft.MODID, "block/stripped_ignis_log"),
                new ResourceLocation(GemCraft.MODID, "block/stripped_ignis_log_top"));
        axisBlock((RotatedPillarBlock) GCBlocks.STRIPPED_IGNIS_WOOD.get(), new ResourceLocation(GemCraft.MODID, "block/stripped_ignis_log"),
                new ResourceLocation(GemCraft.MODID, "block/stripped_ignis_log"));

        saplingBlock(GCBlocks.IGNIS_SAPLING);
        leavesBlock(GCBlocks.IGNIS_LEAVES);

        stairsBlock(((StairBlock) GCBlocks.IGNIS_STAIRS.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        slabBlock(((SlabBlock) GCBlocks.IGNIS_SLAB.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        buttonBlock(((ButtonBlock) GCBlocks.IGNIS_BUTTON.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) GCBlocks.IGNIS_PRESSURE_PLATE.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        fenceBlock(((FenceBlock) GCBlocks.IGNIS_FENCE.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) GCBlocks.IGNIS_FENCE_GATE.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        wallBlock(((WallBlock) GCBlocks.IGNIS_WALL.get()), blockTexture(GCBlocks.IGNIS_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) GCBlocks.IGNIS_DOOR.get()), modLoc("block/ignis_door_bottom"), modLoc("block/ignis_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) GCBlocks.IGNIS_TRAPDOOR.get()), modLoc("block/ignis_trapdoor"), true, "cutout");

        simpleBlock(GCBlocks.VIOLET_LILY.get(), models().cross(blockTexture(GCBlocks.VIOLET_LILY.get()).getPath(), blockTexture(GCBlocks.VIOLET_LILY.get())).renderType("cutout"));

        makeCrop((GCCropBlock) GCBlocks.PARSNIP_CROP.get(), "parsnip_stage", "parsnip_stage", new int[] {0, 3, 5, 8, ParsnipCropBlock.MAX_AGE + 1});
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("gemcraft:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("gemcraft:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void altBlockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath())));
    }

    public void makeCrop(CropBlock block, String modelName, String textureName, int[] ageBreakpoints) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName, ageBreakpoints);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName, int[] ageBreakpoints) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        int age = state.getValue(((GCCropBlock) block).getAgeProperty());
        for(int i = 1; i < ageBreakpoints.length; i++){
            if(age < ageBreakpoints[i]){
                models[0] = new ConfiguredModel(models().crop(modelName + (i-1),
                        new ResourceLocation(GemCraft.MODID, "block/" + textureName + (i-1))).renderType("cutout"));
                break;
            }
        }

        return models;
    }
}
