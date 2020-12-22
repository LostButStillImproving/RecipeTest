package sample.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import sample.model.ingredients.Ingredient;
import sample.model.ingredients.LiquidIngredient;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeBookTest {

    @Test
    public void addRecipeTest() {
        RecipeBook recipeBook = new RecipeBook("Mike's recipies");

        recipeBook.addRecipe("varm mælk", 5,
                new Ingredient[] {new LiquidIngredient("mælk", 35.0)}, "Heat milk in bowl");

        Assertions.assertEquals(1, recipeBook.getListOfRecipes().size());
    }

}