package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMl/Udvozlo.fxml"));
        primaryStage.setTitle("Game_Over");
        primaryStage.getIcons().add(new Image("/Pictures/Icon.png"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
}