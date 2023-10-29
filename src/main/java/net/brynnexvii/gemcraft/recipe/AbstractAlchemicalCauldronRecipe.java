package net.brynnexvii.gemcraft.recipe;

import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public abstract class AbstractAlchemicalCauldronRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final NonNullList<Ingredient> jewelPowderItems; //may not need?
    //private final NonNullList<ItemStack> outputItems;
    private final ItemStack outputItems;
    private final ResourceLocation id;

    /*
    public AbstractAlchemicalCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, NonNullList<Ingredient> jewelPowderItems, NonNullList<ItemStack> outputItems) {
        this.id = id;
        this.inputItems = inputItems;
        this.jewelPowderItems = jewelPowderItems;
        this.outputItems = outputItems;
    }*/
    public AbstractAlchemicalCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, NonNullList<Ingredient> jewelPowderItems, ItemStack outputItems) {
        this.id = id;
        this.inputItems = inputItems;
        this.jewelPowderItems = jewelPowderItems;
        this.outputItems = outputItems;
    }

    public boolean matches(SimpleContainer pContainer, Level pLevel) { //this is just basic, needs updating
        if(pLevel.isClientSide()){
            return false;
        }

        return inputItems.get(0).test(pContainer.getItem(0)) && jewelPowderItems.get(0).test(pContainer.getItem(1));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) { //this is just basic, needs updating
        return outputItems.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {//this is just basic, needs updating
        return outputItems.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {//this is just basic, needs updating
        return this.inputItems;
    }

    public NonNullList<Ingredient> getJewelPowders() {//this is just basic, needs updating
        return this.jewelPowderItems;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public abstract RecipeSerializer<?> getSerializer();

    @Override
    public abstract RecipeType<?> getType();


}
