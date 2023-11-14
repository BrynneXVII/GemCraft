package net.brynnexvii.gemcraft.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.brynnexvii.gemcraft.GemCraft;
import net.brynnexvii.gemcraft.block.GCBlocks;
import net.brynnexvii.gemcraft.item.GCItems;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;

public class BasicAlchemicalCauldronRecipe extends AbstractAlchemicalCauldronRecipe{
    /*
    public BasicAlchemicalCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, NonNullList<Ingredient> jewelPowderItems, NonNullList<ItemStack> outputItems) {
        super(id, inputItems, jewelPowderItems, outputItems);
    }*/
    public BasicAlchemicalCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, NonNullList<Ingredient> jewelPowderItems, ItemStack outputItems) {
        super(id, inputItems, jewelPowderItems, outputItems);
    }

    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<BasicAlchemicalCauldronRecipe>{
        private Type() {}
        public static final Type INSTANCE = new Type();
        public static final String ID = "basic_alchemical_cauldron";
    }

    //HERE 8:27

    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Serializer implements RecipeSerializer<BasicAlchemicalCauldronRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID =
                new ResourceLocation(GemCraft.MODID,"basic_alchemical_cauldron");

        @Override
        public BasicAlchemicalCauldronRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            /*JsonArray output = GsonHelper.getAsJsonArray(json, "output");
            NonNullList<ItemStack> outputItems = NonNullList.withSize(1, ItemStack.EMPTY);
            for (int i = 0; i < outputItems.size(); i++) {
                outputItems.set(i, Ingredient.fromJson(output.get(i)).getItems()[0]);
                System.out.println("Outputs " + i + ": item" + outputItems.get(i));
            }*/

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputItems = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputItems.size(); i++) {
                inputItems.set(i, Ingredient.fromJson(ingredients.get(i)));
                System.out.println("Inputs " + i + ": item" + inputItems.get(i));
            }

            JsonArray jewelPowder = GsonHelper.getAsJsonArray(json, "jewel_powder");
            NonNullList<Ingredient> jewelPowderItems = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < jewelPowderItems.size(); i++) {
                jewelPowderItems.set(i, Ingredient.fromJson(jewelPowder.get(i)));
            }

            return new BasicAlchemicalCauldronRecipe(id, inputItems, jewelPowderItems, output);
        }

        @Override
        public BasicAlchemicalCauldronRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            NonNullList<Ingredient> jewelPowders = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < jewelPowders.size(); i++) {
                jewelPowders.set(i, Ingredient.fromNetwork(buf));
            }

            //NonNullList<ItemStack> outputs = NonNullList.withSize(buf.readInt(), ItemStack.EMPTY);

            //for (int i = 0; i < outputs.size(); i++) {
                //outputs.set(i, Ingredient.fromNetwork(buf));
            //}

            ItemStack output = buf.readItem();
            return new BasicAlchemicalCauldronRecipe(id, inputs, jewelPowders, output);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, BasicAlchemicalCauldronRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }

            buf.writeInt(recipe.getJewelPowders().size());

            for (Ingredient jewelPowders : recipe.getJewelPowders()) {
                jewelPowders.toNetwork(buf);
            }

            //buf.writeInt(recipe.getOutputs().size());
            buf.writeItemStack(recipe.getResultItem(null), false);
        }
    }
}
