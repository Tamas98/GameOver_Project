package Controllers;

import javafx.event.ActionEvent;
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
    Button registButt;
    @FXML
    TextField registName;
    @FXML
    PasswordField registPasw;
    @FXML
    Label warningName, warningPassw;

    public void registCheck() throws Exception{
        warningName.setVisible(false);
        warningPassw.setVisible(false);
        if(registName.getText().equals("") && registPasw.getText().equals("")){
                warningName.setVisible(true);
                warningPassw.setVisible(true);

        }else if(registName.getText().equals("")){
           warningName.setVisible(true);
        }else if(registPasw.getText().equals("")){
            warningPassw.setVisible(true);
        }else {
            backToLogin();
        }
    }

    public void backToLogin() throws Exception{
        Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        Stage regStage = new Stage();
        regStage.setTitle("Game_Over");
        regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        regStage.setScene(new Scene(newUser, 600, 400));
        regStage.show();
        Stage stage = (Stage) registButt.getScene().getWindow();
        stage.close();
    }

}
