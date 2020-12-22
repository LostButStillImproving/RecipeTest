package sample.model;

import sample.model.ingredients.Ingredient;

import java.time.Duration;
import java.util.ArrayList;

public class Recipe {

    String name;

    public Recipe(String name, Long timeToMake, ArrayList<Ingredient> listOfIngredients, String toDo) {
        this.name = name;
        this.timeToMake = Duration.ofMinutes(timeToMake);
        this.listOfIngredients = listOfIngredients;
        this.ingredientsCount = listOfIngredients.size();
        this.toDo = toDo;
    }

    Duration timeToMake;

    int ingredientsCount;

    ArrayList<Ingredient> listOfIngredients;

    String toDo;

    @Override
    public String toString() {

        return "How to make: " + this.name + "\n" +
                "Time to prepare: " + this.timeToMake.toString() + "\n" +
                ""
    }
}
