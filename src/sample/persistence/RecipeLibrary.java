package sample.persistence;

import javafx.stage.FileChooser;
import sample.Main;
import sample.model.Recipe;
import sample.model.RecipeBook;

import java.io.*;
import java.util.ArrayList;

public class RecipeLibrary {

    static FileChooser fileChooser = new FileChooser();

    public static void saveProjects(RecipeBook recipeBook) {

        try
        {
            FileOutputStream fileOut = new FileOutputStream("src/sample/persistence/projects.file");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(recipeBook);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static RecipeBook loadProjects() {
        //File projectFile = fileChooser.showOpenDialog(Main.getScene().getWindow());

        try
        {
            // Reading the object from a file

            FileInputStream file = new FileInputStream("src/sample/persistence/projects.file");

            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            RecipeBook recipeBook = (RecipeBook) in.readObject();

            //riskManagerController.setProjectTable((ProjectTable) in.readObject());
            //riskManagerController.setOpenProject();
            in.close();
            file.close();
            return recipeBook;
        }

        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        return new RecipeBook();
    }
}

