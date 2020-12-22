package sample.model.ingredients;

import java.io.Serializable;

public class SolidIngredient extends Ingredient implements Serializable {

    Double kcalPerHundredGram;

    public SolidIngredient(String name, Double kcalPerHundredGram) {
        super.ingredientName = name;
        this.kcalPerHundredGram = kcalPerHundredGram;
    }

    public Double getKcalPerHundredGram() {
        return kcalPerHundredGram;
    }
}
