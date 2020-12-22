package sample.model;

import sample.model.ingredients.Ingredient;
import sample.model.ingredients.LiquidIngredient;
import sample.model.ingredients.SolidIngredient;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;

public class Recipe {

    String name;

    Double totalKCal;

    int timeToMake;

    int ingredientsCount;

    ArrayList<Ingredient> listOfIngredients;

    String toDo;

    public Recipe(String name, int timeToMake, ArrayList<Ingredient> listOfIngredients, String toDo) {
        this.name = name;
        this.timeToMake = timeToMake;
        this.listOfIngredients = listOfIngredients;
        this.ingredientsCount = listOfIngredients.size();
        this.toDo = toDo;
        this.totalKCal = calculateTotalKCal();
    }

    public void addIngredient(String name, Double kcal, String ingredientType) {

        if (ingredientType.equals("Solid")) {
            listOfIngredients.add(new SolidIngredient(name, kcal));
        }
        if (ingredientType.equals("Liquid")) {
            listOfIngredients.add(new LiquidIngredient(name, kcal));
        }
    }

    private Double calculateTotalKCal() {
        Double total = 0.0;
        for (Ingredient ingredient : listOfIngredients) {
            if (ingredient.getClass().getSimpleName().equals("LiquidIngredient")) {
                System.out.println(((LiquidIngredient) ingredient).getKcalPerDeciliter());
                total += ((LiquidIngredient) ingredient).getKcalPerDeciliter();
            }
            if (ingredient.getClass().getSimpleName().equals("SolidIngredient")) {
                total += ((SolidIngredient) ingredient).getKcalPerHundredGram();
            }
        }

        return total;
    }

    @Override
    public String toString() {

        return "How to make: " + this.name + "\n" +
                "Time to prepare: " + this.timeToMake + " minutes." +  "\n" +
                "Total kcal: " + this.totalKCal + "\n" +
                "List of ingredients: " + stringifyListOfIngredients() + "\n" +
                "To Do: " + toDo;
    }

    private String stringifyListOfIngredients() {
        StringBuilder sb = new StringBuilder();

        for (Ingredient ingredient:listOfIngredients) {
            sb.append(ingredient.getIngredientName());
            sb.append(", ");
        }
        return sb.toString();
    }
}
