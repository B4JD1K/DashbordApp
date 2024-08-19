package now.be.dashboardapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        showLoadingScreen(primaryStage);
    }

    private void showLoadingScreen(Stage primaryStage) {
        try {
            // Ścieżka do pliku FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoadingView.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ładowanie aplikacji");
            primaryStage.setResizable(false);
            primaryStage.show();

            // Symulacja procesu ładowania aplikacji
            new Thread(() -> {
                try {
                    Controller controller = loader.getController();
                    // Uruchomienie procesu ładowania, zamyka obecne okno i otwiera nowe
                    Thread.sleep(2000); // Symulacja długiego ładowania (2 sekundy)
                    Platform.runLater(controller::loadingProcessProgIndic);
                } catch (InterruptedException e) {
                    System.out.println("Błąd podczas ładowania sceny LoginView.fxml:");
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            System.out.println("Błąd podczas ładowania głównej sceny LoadingView.fxml:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}