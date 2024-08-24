package now.be.dashboardapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAvailabilityCheck;

    @FXML
    private Button btnLoginToApp;

    @FXML
    private Button btnRegister;

    @FXML
    private CheckBox cbAcceptTOS;

    @FXML
    private CheckBox cbDataProcessing;

    @FXML
    private Label lblLoginToDashboard;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private PasswordField pfPasswordRetry;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfEmailRetry;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSurname;

    @FXML
    private TextField tfUsername;

    @FXML
    void acceptDataProcessing(ActionEvent event) {

    }

    @FXML
    void acceptTOSChecked(ActionEvent event) {

    }

    @FXML
    void registerAccount(ActionEvent event) {

    }

    @FXML
    void switchToLoginScene(ActionEvent event) {

    }

    @FXML
    void usernameAvailabilityCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAvailabilityCheck != null : "fx:id=\"btnAvailabilityCheck\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert btnLoginToApp != null : "fx:id=\"btnLoginToApp\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert btnRegister != null : "fx:id=\"btnRegister\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert cbAcceptTOS != null : "fx:id=\"cbAcceptTOS\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert cbDataProcessing != null : "fx:id=\"cbDataProcessing\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert lblLoginToDashboard != null : "fx:id=\"lblLoginToDashboard\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert pfPassword != null : "fx:id=\"pfPassword\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert pfPasswordRetry != null : "fx:id=\"pfPasswordRetry\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert tfEmail != null : "fx:id=\"tfEmail\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert tfEmailRetry != null : "fx:id=\"tfEmailRetry\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert tfName != null : "fx:id=\"tfName\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert tfSurname != null : "fx:id=\"tfSurname\" was not injected: check your FXML file 'IRegisterView.fxml'.";
        assert tfUsername != null : "fx:id=\"tfUsername\" was not injected: check your FXML file 'IRegisterView.fxml'.";

    }

}
