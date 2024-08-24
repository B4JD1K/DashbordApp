package now.be.dashboardapp.controllers;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    public void switchToRegistrationScene(ActionEvent event) {
        // Zmiana na scenę "RegisterView.fxml"
    }

    @FXML
    public void switchToRecoveryAccountScene(ActionEvent event) {
        // Zmiana na scenę "ForgotPasswordView.fxml"
    }

    @FXML
    public void rememberMeChecked(ActionEvent event) {
        if (cbRememberMe.isSelected()) {
            System.out.println("Zapamiętaj mnie - zaznaczono");
        }
        if (!cbRememberMe.isSelected()) {
            System.out.println("Zapamiętaj mnie - odznaczono");
        }
    }

    @FXML
    public void loginToApp(ActionEvent event) {
        String username = tfUsername.getText();
        String password = pfPassword.getText();
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Zalogowano na użytkownika: " + tfUsername.getText());
            try {
                Parent dashboardRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("now/be/dashboardapp/DashboardView.fxml")));
                Scene scene = new Scene(dashboardRoot);

                Stage dashboardStage = new Stage(); // Otwiera nowe okno (Stage) MainScreenView.fxml
                dashboardStage.setScene(scene);
                dashboardStage.setTitle("DashboardView Main Application");
                dashboardStage.setResizable(false);
                dashboardStage.show();

                Stage currentStage = (Stage) btnLogin.getScene().getWindow();
                currentStage.close(); // Zamyka obecne okno (Stage) LoadingView.fxml
            } catch (Exception e) {
                System.out.println("Błąd podczas ładowania głównej sceny DashboardView.fxml:");
                e.printStackTrace();
            }

        } else {
            System.out.println("Błąd podczas logowania");
        }
    }
}
