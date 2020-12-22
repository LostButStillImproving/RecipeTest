package sample.model.ingredients;

public class LiquidIngredient extends Ingredient {

    Double kcalPerDeciliter;

    public LiquidIngredient(String name, Double kcalPerDeciliter) {
        super.ingredientName = name;
        this.kcalPerDeciliter = kcalPerDeciliter;
    }
}
