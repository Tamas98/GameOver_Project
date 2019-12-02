package Controllers;

import Database.Game;
import Database.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.List;

public class Udvozlo extends Controller<User>{

    @FXML
    Button regButton, newPassButton, signInButton, signInGuestButton;

    @FXML
    TextField userName;

    @FXML
    PasswordField passWord;

    static boolean loggedIn = false;

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
        if(getData().stream().anyMatch(e -> e.getUsername().equals(userName.getText()) && e.getPassword().equals(Regisztracio.hasher(passWord.getText())))){
            loggedIn = true;
            Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
            Stage mainStage = new Stage();
            mainStage.setTitle("Főképernyő");
            mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
            mainStage.setScene(new Scene(newUser, 960, 720));
            mainStage.setResizable(false);
            mainStage.show();
            Stage stage = (Stage) signInButton.getScene().getWindow();
            stage.close();
        }else{
            //TODO: Visszajelzés,hogy hibás felhasználónév vagy jelszó.
        }

    }

    /**
     * Bejelentkezés vendégként gombra való kattintás,
     * megnyílik a Főképernyő felület
     * @throws Exception
     */
    public void signInGuestButtonClicked() throws Exception {
        //TODO: A vendég felhasználók számára ne legyen elérhető a könyvtár
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

    @Override
    public List<User> getData() {
        return userDao.getAllUser();
    }
}
