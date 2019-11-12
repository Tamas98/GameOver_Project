package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Uj_jelszo {

    @FXML
    Button saveButton;

    public void saveButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Regisztráció");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) saveButton.getScene().getWindow();
        stage.close();

    }

}
