package sample;

import javafx.event.ActionEvent;
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
    private TextArea recipeField;

    @FXML private Label addRecipeName;

    @FXML private

    RecipeBook recipeBook;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.recipeBook = RecipeLibrary.loadProjects();

        nameLabel.setText(recipeBook.getListOfRecipes().get(0).getName());
        recipeField.setText(recipeBook.getListOfRecipes().get(0).toString());

    }

    public void getRandomRecipe() {
        Recipe recipe = recipeBook.getRandomRecipe();
        this.nameLabel.setText(recipe.getName());
        this.recipeField.setText(recipe.toString());
    }

    public void addRecipe() {

    }

    public void save() {
        RecipeLibrary.saveProjects(this.recipeBook);
    }
}
