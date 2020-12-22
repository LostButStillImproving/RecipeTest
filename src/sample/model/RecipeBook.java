package sample.model;

import sample.model.ingredients.Ingredient;
import sample.model.ingredients.LiquidIngredient;
import sample.model.ingredients.SolidIngredient;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecipeBook {

    ArrayList<Recipe> listOfRecipes = new ArrayList<>();

    public RecipeBook() {}

    public ArrayList<Recipe> getListOfRecipes() {

        return listOfRecipes;
    }

    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    public RecipeBook(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }
    private void printRecipe() {

        this.listOfRecipes.forEach(recipe -> System.out.println(recipe.toString()));
    }


    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook();
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new LiquidIngredient("water", 0.0));
        ingredients.add(new SolidIngredient("Powdered Sugar", 300.0));

        recipeBook.getListOfRecipes().add(new Recipe("Glasur", (long) 5, ingredients, "STEP 1; STEP 2"));

        recipeBook.printRecipe();

    }
}
