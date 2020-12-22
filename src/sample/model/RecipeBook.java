package sample.model;

import sample.model.ingredients.Ingredient;
import sample.model.ingredients.LiquidIngredient;
import sample.model.ingredients.SolidIngredient;
import sample.persistence.RecipeLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RecipeBook implements Serializable {

    String name;

    ArrayList<Recipe> listOfRecipes = new ArrayList<>();

    public RecipeBook(String name) {
        this.name = name;
    }

    //EKSEMPEL på ArrayList
    public ArrayList<Recipe> getListOfRecipes() {

        return listOfRecipes;
    }
    //EKSEMPEL på SETTER
    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    //Eksempel på søgning
    public  ArrayList<Recipe> findRecipesContaining(String ingredientName) {
        //EKSEMPEL på var variable
        var recipes = new ArrayList<Recipe>();
        for (Recipe recipe: listOfRecipes) {
            for (Ingredient ingredient: recipe.listOfIngredients) {
                if (ingredient.getIngredientName().equals(ingredientName)) {
                    recipes.add(recipe);
                }
            }
        }

        return recipes;
    }
    private void printRecipes() {
        System.out.println(" ////////////////////\n ");
        this.listOfRecipes.forEach(recipe -> System.out.println(recipe.toString()));
        System.out.println(" \n/////////////////// ");
    }



    public static void main(String[] args) {
        RecipeBook recipeBook = new RecipeBook("Mikes Cooking Book");
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new LiquidIngredient("water", 1.));
        ingredients.add(new SolidIngredient("Powdered Sugar", 300.0));

        recipeBook.getListOfRecipes().add(new Recipe("Glasur",  5, ingredients, """
                STEP 1: Put the powdered sugar in a bowl
                STEP 2: Add the lukewarm water and mix
                STEP 3: Enjoy! Either on a cake, or straight from the bowl, YUM!
                """));

        ingredients = new ArrayList<>();
        ingredients.add(new LiquidIngredient("Milk", 350.0));
        ingredients.add(new LiquidIngredient("Cocoa Powder", 100.0 ));
        recipeBook.getListOfRecipes().add(new Recipe("varm kakao", 10, ingredients, """
                STEP 1: Heat the milk in a huge pan
                STEP 2: Add some cocoa powder, and let the solution get to a mild bowl. Wait a few mins.
                STEP 3: Enjoy! ENJOY! ENJOOOOY!
                """));
        recipeBook.printRecipes();

        RecipeLibrary.saveProjects(recipeBook);

        //recipeBook = RecipeLibrary.loadProjects();
        //recipeBook.findRecipesContaining("Milk").forEach(recipe -> System.out.println(recipe.toString()));

    }

    public void addRecipe(String name, int timeToMake, Ingredient[] ingredientArray, String toDo) {
        var ingredients = new ArrayList<Ingredient>();
        //EKSEMPEL på for i loop

        for (int i = 0; i < ingredientArray.length ; i++) {
            ingredients.add(ingredientArray[i]);
        }

        this.listOfRecipes.add(new Recipe(name, timeToMake, ingredients, toDo));
    }

    public Recipe getRandomRecipe() {
        Random r = new Random();
        return getListOfRecipes().get(r.nextInt(getListOfRecipes().size()));
    }
}
