package sample.model.ingredients;

import java.io.Serializable;

public class LiquidIngredient extends Ingredient implements Serializable {

    Double kcalPerDeciliter;

    public LiquidIngredient(String name, Double kcalPerDeciliter) {
        super.ingredientName = name;
        this.kcalPerDeciliter = kcalPerDeciliter;
    }

    public Double getKcalPerDeciliter() {
        return kcalPerDeciliter;
    }
}
