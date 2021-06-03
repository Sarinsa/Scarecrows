package com.sarinsa.scarecrows.datagen.recipe;

import com.sarinsa.scarecrows.common.core.register.ScarecrowsItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class SRecipeProvider extends RecipeProvider {

    public SRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        this.scarecrowRecipe(ScarecrowsItems.BLACK_SCARECROW.get(), Items.BLACK_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.BLUE_SCARECROW.get(), Items.BLUE_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.BROWN_SCARECROW.get(), Items.BROWN_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.CYAN_SCARECROW.get(), Items.CYAN_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.GRAY_SCARECROW.get(), Items.GRAY_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.GREEN_SCARECROW.get(), Items.GREEN_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.LIGHT_BLUE_SCARECROW.get(), Items.LIGHT_BLUE_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.LIGHT_GRAY_SCARECROW.get(), Items.LIGHT_GRAY_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.LIME_SCARECROW.get(), Items.LIME_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.MAGENTA_SCARECROW.get(), Items.MAGENTA_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.ORANGE_SCARECROW.get(), Items.ORANGE_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.PINK_SCARECROW.get(), Items.PINK_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.PURPLE_SCARECROW.get(), Items.PURPLE_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.RED_SCARECROW.get(), Items.RED_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.WHITE_SCARECROW.get(), Items.WHITE_WOOL, consumer);
        this.scarecrowRecipe(ScarecrowsItems.YELLOW_SCARECROW.get(), Items.YELLOW_WOOL, consumer);
    }

    private void scarecrowRecipe(IItemProvider scarecrowItem, IItemProvider wool, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder recipeBuilder = new ShapedRecipeBuilder(scarecrowItem, 1);
        recipeBuilder.group("scarecrows");
        recipeBuilder.pattern(" P ");
        recipeBuilder.pattern("#W#");
        recipeBuilder.pattern(" S ");
        recipeBuilder.define('P', Items.CARVED_PUMPKIN);
        recipeBuilder.define('#', Tags.Items.CROPS_WHEAT);
        recipeBuilder.define('W', wool);
        recipeBuilder.define('S', Tags.Items.RODS_WOODEN);
        recipeBuilder.unlockedBy("has_carved_pumpkin", has(Items.CARVED_PUMPKIN));
        recipeBuilder.unlockedBy("has_wool", has(wool));
        recipeBuilder.unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN));
        recipeBuilder.unlockedBy("has_wheat", has(Tags.Items.CROPS_WHEAT));
        recipeBuilder.save(consumer);
    }
}
