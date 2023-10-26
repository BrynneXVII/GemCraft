package net.brynnexvii.gemcraft.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.brynnexvii.gemcraft.GemCraft;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

public class BasicAlchemicalCauldronRecipe extends AbstractAlchemicalCauldronRecipe{

    public BasicAlchemicalCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, NonNullList<Ingredient> jewelPowderItems, NonNullList<ItemStack> outputItems) {
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
        return null; //make not null
    }
    /*
    public static class Serializer implements RecipeSerializer<BasicAlchemicalCauldronRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID =
                new ResourceLocation(GemCraft.MODID,"basic_alchemical_cauldron");

        @Override
        public BasicAlchemicalCauldronRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            NonNullList<ItemStack> outputItems = NonNullList.withSize(1, ItemStack.EMPTY);
            for (int i = 0; i < outputItems.size(); i++) {
                outputItems.set(i, Ingredient.fromJson(output.get(i)));
            }

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputItems = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputItems.size(); i++) {
                inputItems.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            JsonArray jewelPowder = GsonHelper.getAsJsonArray(json, "jewel_powder");
            NonNullList<Ingredient> jewelPowderItems = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < jewelPowderItems.size(); i++) {
                jewelPowderItems.set(i, Ingredient.fromJson(jewelPowder.get(i)));
            }

            return new BasicAlchemicalCauldronRecipe(id, inputItems, jewelPowderItems, outputItems);
        }

        @Override
        public BasicAlchemicalCauldronRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new BasicAlchemicalCauldronRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, BasicAlchemicalCauldronRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(null), false);
        }
    }*/
}
