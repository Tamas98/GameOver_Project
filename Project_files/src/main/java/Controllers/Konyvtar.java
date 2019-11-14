package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Konyvtar {

    @FXML
    Button backButton;

    public void backButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        Stage mainStage = new Stage();
        mainStage.setTitle("Főképrenyő");
        mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        mainStage.setScene(new Scene(newUser, 960, 720));
        mainStage.setResizable(false);
        mainStage.show();
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

    }

}
