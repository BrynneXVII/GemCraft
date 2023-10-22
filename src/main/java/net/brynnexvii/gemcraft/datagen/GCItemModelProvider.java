package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GCItemModelProvider extends ItemModelProvider {

    public GCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GCItems.BRILLIANT_DIAMOND);
        simpleItem(GCItems.RAW_DIAMOND);
        simpleItem(GCItems.DIAMOND_POWDER);
        simpleItem(GCItems.BRILLIANT_EMERALD);
        simpleItem(GCItems.RAW_EMERALD);
        simpleItem(GCItems.EMERALD_POWDER);
        simpleItem(GCItems.BRILLIANT_RUBY);
        simpleItem(GCItems.RAW_RUBY);
        simpleItem(GCItems.RUBY);
        simpleItem(GCItems.RUBY_POWDER);
        simpleItem(GCItems.ROCK_CANDY);

        simpleBlockItem(GCBlocks.WILLOW_DOOR);
        alternateBlockItem(GCBlocks.WILLOW_WOOD);

        fenceItem(GCBlocks.WILLOW_FENCE, GCBlocks.WILLOW_PLANKS);
        buttonItem(GCBlocks.WILLOW_BUTTON, GCBlocks.WILLOW_PLANKS);
        wallItem(GCBlocks.WILLOW_WALL, GCBlocks.WILLOW_PLANKS);
        trapdoorItem(GCBlocks.WILLOW_TRAPDOOR);

        alternateBlockItem(GCBlocks.WILLOW_STAIRS);
        alternateBlockItem(GCBlocks.WILLOW_PRESSURE_PLATE);
        alternateBlockItem(GCBlocks.WILLOW_FENCE_GATE);
        alternateBlockItem(GCBlocks.WILLOW_SLAB);

        saplingItem(GCBlocks.WILLOW_SAPLING);

        complexBlock(GCBlocks.BASIC_ALCHEMICAL_CAULDRON.get());

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemCraft.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemCraft.MODID, "item/" + item.getId().getPath()));
    }

    public void alternateBlockItem(RegistryObject<Block> block){
        this.withExistingParent(GemCraft.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(GemCraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(GemCraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(GemCraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemCraft.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block){
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(),
                new ResourceLocation(GemCraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
