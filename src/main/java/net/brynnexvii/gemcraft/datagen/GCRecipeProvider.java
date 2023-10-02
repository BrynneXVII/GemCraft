package net.brynnexvii.gemcraft.datagen;

import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class GCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //private static final List<ItemLike> SMELTABLES = List.of()

    public GCRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GCItems.RUBY.get(), 9)
                .requires(GCBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(GCBlocks.RUBY_BLOCK.get()), has(GCBlocks.RUBY_BLOCK.get()))
                .save(pWriter);

        //Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GCBlocks.RUBY_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', GCItems.RUBY.get()).unlockedBy(getHasName(GCItems.RUBY.get()), has(GCItems.RUBY.get()))
                .save(pWriter);

        //Smelting and Blasting Recipes
        oreBlasting(pWriter, List.of(GCItems.RAW_DIAMOND.get()), RecipeCategory.MISC, Items.DIAMOND, 1f, 150, "diamond");
        oreSmelting(pWriter, List.of(GCItems.RAW_DIAMOND.get()), RecipeCategory.MISC, Items.DIAMOND, 1f, 300, "diamond");
        oreBlasting(pWriter, List.of(GCItems.RAW_EMERALD.get()), RecipeCategory.MISC, Items.EMERALD, 1f, 150, "emerald");
        oreSmelting(pWriter, List.of(GCItems.RAW_EMERALD.get()), RecipeCategory.MISC, Items.EMERALD, 1f, 300, "emerald");
        oreBlasting(pWriter, List.of(GCItems.RAW_RUBY.get()), RecipeCategory.MISC, GCItems.RUBY.get(), 1f, 150, "ruby");
        oreSmelting(pWriter, List.of(GCItems.RAW_RUBY.get()), RecipeCategory.MISC, GCItems.RUBY.get(), 1f, 300, "ruby");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, GemCraft.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
