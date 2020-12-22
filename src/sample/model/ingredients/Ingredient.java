package sample.model.ingredients;

import java.io.Serializable;

public class Ingredient implements Serializable {


    String ingredientName;

    //EKSEMPEL på GETTER
    public String getIngredientName() {
        return ingredientName;
    }

    public static void main(String[] args) {
        var salt = new SolidIngredient("salt", 0.0);

    }
}
