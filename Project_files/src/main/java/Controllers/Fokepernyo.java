package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Fokepernyo {

    @FXML
    Button signOutButton, dataButton;

    public void signOutButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage mainStage = new Stage();
        mainStage.setTitle("Bejelentkezés");
        mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        mainStage.setScene(new Scene(newUser, 480, 720));
        mainStage.setResizable(false);
        mainStage.show();
        Stage stage = (Stage) signOutButton.getScene().getWindow();
        stage.close();

    }

    public void dataButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) dataButton.getScene().getWindow();
        stage.close();

    }

}