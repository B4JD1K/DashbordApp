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

public class LoginController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCreateAccount;

    @FXML
    private Button btnForgotPass;

    @FXML
    private Button btnLogin;

    @FXML
    private CheckBox cbRememberMe;

    @FXML
    private Label lblLoginToDashboard;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    public void createAccount(ActionEvent event) {

    }

    @FXML
    public void forgottenPassword(ActionEvent event) {

    }

    @FXML
    public void loginToApp(ActionEvent event) {

    }
}
