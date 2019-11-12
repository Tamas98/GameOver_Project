package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Adatlap {

    @FXML
    Button backButton;

    public void backButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Főképrenyő");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 600, 400));
        dataStage.show();
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

}
