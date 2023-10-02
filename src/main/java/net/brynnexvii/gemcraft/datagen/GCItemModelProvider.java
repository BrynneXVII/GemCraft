package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(GemCraft.MODID, "item/" + item.getId().getPath()));
    }
}
