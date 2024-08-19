package now.be.dashboardapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controller {
    public ProgressIndicator progressIndicator;

    @FXML
    public void openMainStage() {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoginView.fxml")));
            Scene scene = new Scene(root, 800, 600);
            Stage newStage = new Stage(); // Otwiera nowe okno (Stage) LoginView.fxml
            newStage.setScene(scene);
            newStage.setTitle("Main Application");
            newStage.setResizable(false);
            newStage.show();
            Stage currentStage = (Stage) progressIndicator.getScene().getWindow();
            currentStage.close(); // Zamyka obecne okno (Stage) LoadingView.fxml
        } catch (IOException e) {
            System.out.println("Błąd podczas ładowania sceny LoginView.fxml:");
            e.printStackTrace();
        }
    }
}
