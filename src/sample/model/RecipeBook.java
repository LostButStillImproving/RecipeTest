package sample.model;

import sample.model.ingredients.Ingredient;
import sample.model.ingredients.LiquidIngredient;
import sample.model.ingredients.SolidIngredient;
import sample.persistence.RecipeLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecipeBook implements Serializable {

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
    private void printRecipes() {
        System.out.println(" ////////////////////\n ");
        this.listOfRecipes.forEach(recipe -> System.out.println(recipe.toString()));
        System.out.println(" \n/////////////////// ");
    }




    public static void main(String[] args) {
        /*RecipeBook recipeBook = new RecipeBook();
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new LiquidIngredient("water", 1.));
        ingredients.add(new SolidIngredient("Powdered Sugar", 300.0));

        recipeBook.getListOfRecipes().add(new Recipe("Glasur",  5, ingredients, """
                STEP 1: Put the powdered sugar in a bowl
                STEP 2: Add the lukewarm water and mix
                STEP 3: Enjoy! Either on a cake, or straight from the bowl, YUM!
                """));

        ingredients.clear();
        ingredients.add(new LiquidIngredient("Milk", 350.0));
        ingredients.add(new LiquidIngredient("Cocoa Powder", 100.0 ));
        recipeBook.getListOfRecipes().add(new Recipe("varm kakao", 10, ingredients, """
                STEP 1: Heat the milk in a huge pan
                STEP 2: Add some cocoa powder, and let the solution get to a mild bowl. Wait a few mins.
                STEP 3: Enjoy! ENJOY! ENJOOOOY!
                """));
        recipeBook.printRecipes();

        RecipeLibrary.saveProjects(recipeBook);*/

        RecipeBook recipeBook = RecipeLibrary.loadProjects();
        recipeBook.getListOfRecipes().forEach(i -> System.out.println(i.toString()));

    }
}
