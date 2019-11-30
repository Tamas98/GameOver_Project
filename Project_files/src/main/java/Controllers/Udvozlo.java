package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Udvozlo {

    @FXML
    Button regButton, newPassButton, signInButton, signInGuestButton;

    /**
     * Új jelszót igénylő felület megnyitása
     * @throws Exception
     */
    public void newPassButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Uj_jelszo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Jelszó megváltoztatása");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 600, 300));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) newPassButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Regisztációs felülelet megnyitása
     * @throws Exception
     */
    public void regButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Regisztracio.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Regisztráció");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 600, 300));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) regButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Bejelentkezés gombra való kattintás,
     * megnyílik a Főképernyő felület
     * @throws Exception
     */
    public void signInButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        Stage mainStage = new Stage();
        mainStage.setTitle("Főképernyő");
        mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        mainStage.setScene(new Scene(newUser, 960, 720));
        mainStage.setResizable(false);
        mainStage.show();
        Stage stage = (Stage) signInButton.getScene().getWindow();
        stage.close();

    }

    /**
     * Bejelentkezés vendégként gombra való kattintás,
     * megnyílik a Főképernyő felület
     * @throws Exception
     */
    public void signInGuestButtonClicked() throws Exception {
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        Stage mainStage = new Stage();
        mainStage.setTitle("Főképernyő");
        mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        mainStage.setScene(new Scene(newUser, 960, 720));
        mainStage.setResizable(false);
        mainStage.show();
        Stage stage = (Stage) signInGuestButton.getScene().getWindow();
        stage.close();

    }

}
