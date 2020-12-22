package sample.model.ingredients;

public class SolidIngredient extends Ingredient{

    Double kcalPerHundredGram;

    public SolidIngredient(String name, Double kcalPerHundredGram) {
        super.ingredientName = name;
        this.kcalPerHundredGram = kcalPerHundredGram;
    }

    public Double getKcalPerHundredGram() {
        return kcalPerHundredGram;
    }
}
