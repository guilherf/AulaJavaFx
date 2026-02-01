package net.bifewagyu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = fxmlLoader.load();
        Image image = new Image(getClass().getResourceAsStream("/icons8-google-logo-48.png"));
        stage.getIcons().add(image);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();



    }


    public static void main(String[] args) {
        launch(args);

    }

}