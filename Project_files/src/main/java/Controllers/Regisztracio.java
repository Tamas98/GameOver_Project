package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Regisztracio {

    @FXML
    Button registButton;

    @FXML
    TextField registName;

    @FXML
    PasswordField registPasw;

    @FXML
    Label warningName, warningPassw;

    /**
     * Regisztrációs mezők helyes kitöltésének ellenőrzése,
     * üresen hagyott mezők esetén figyelmeztetés
     * @throws Exception
     */
    public void registCheck() throws Exception{
        warningName.setVisible(false);
        warningPassw.setVisible(false);
        if(registName.getText().equals("") && registPasw.getText().equals("")){
                warningName.setVisible(true);
                warningPassw.setVisible(true);

        } else if(registName.getText().equals("")) {
           warningName.setVisible(true);
        } else if(registPasw.getText().equals("")) {
            warningPassw.setVisible(true);
        } else {
            backToLogin();
        }
    }

    /**
     * Regsztráció gombra való kattintás,
     * megnyílik az Üdvözlő felület
     * @throws Exception
     */
    public void backToLogin() throws Exception{
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 480, 720));
        regStage.setResizable(false);
        regStage.show();
        Stage stage = (Stage) registButton.getScene().getWindow();
        stage.close();

    }

}
