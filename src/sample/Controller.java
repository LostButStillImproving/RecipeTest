package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import sample.model.Recipe;
import sample.model.RecipeBook;
import sample.persistence.RecipeLibrary;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label nameLabel;

    @FXML
    private Button randomRecipeButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button addRecipeButton;

    @FXML
    private TextArea recipeField;

    RecipeBook recipeBook;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.recipeBook = RecipeLibrary.loadProjects();

        nameLabel.setText(recipeBook.getListOfRecipes().get(0).getName());

    }

    public void getRandomRecipe() {
        Recipe recipe = recipeBook.getRandomRecipe();
        this.nameLabel.setText(recipe.getName());
        this.recipeField.setText(recipe.toString());
    }
}
