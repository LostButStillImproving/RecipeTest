package sample.model.ingredients;

public class Ingredient {


    String ingredientName;

    public String getIngredientName() {
        return ingredientName;
    }

    public static void main(String[] args) {
        var salt = new SolidIngredient("salt", 0.0);

    }
}
