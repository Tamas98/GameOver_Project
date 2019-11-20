package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fokepernyo {

    @FXML
    Button signOutButton, mainButton, libButton, exitButton;

    @FXML
    ImageView rainbowPic;

    @FXML
    Pane mainPane, libPane;

    /**
     * Kijelentkezés gombra való klikkelés,
     * megnyílik az Üdvözlő felület
     * @throws Exception
     */
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

    /**
     * Játék borítójára való kattintás,
     * megnyílik az Adatlap felület
     * @throws Exception
     */
    public void rainbowGame() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Adatlap.fxml"));
        Stage dataStage = new Stage();
        dataStage.setTitle("Adatlap");
        dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        dataStage.setScene(new Scene(newUser, 810, 600));
        dataStage.setResizable(false);
        dataStage.show();
        Stage stage = (Stage) rainbowPic.getScene().getWindow();
        stage.close();

    }

    /**
     * Főoldal gombra való klikkelés,
     * megnyílik a Föoldal felület
     * @throws Exception
     */
    public void mainButtonClicked() throws Exception {
        mainPane.setVisible(true);
        libPane.setVisible(false);

    }

    /**
     * Könyvtár gombra való klikkelés,
     * megnyílik a könyvtár felület
     * @throws Exception
     */
    public void libButtonClicked() throws Exception {
        mainPane.setVisible(false);
        libPane.setVisible(true);

    }

    /**
     * Kilépés gombra való klikkelés,
     * a programból való kilépés
     * @throws Exception
     */
    public void exitButtonClicked() throws Exception {
        System.exit(0);

    }

}
