package now.be.dashboardapp;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
public class Controller {
    public ProgressIndicator progressIndicator;
    public Label lblProgIndicText;

    @FXML
    public void openNewStage(String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
            Scene scene = new Scene(root, 800, 600);
            Stage newStage = new Stage(); // Otwiera nowe okno (Stage) MainScreenView.fxml
            newStage.setScene(scene);
            newStage.setTitle(fxmlFile);
            newStage.setResizable(false);
            newStage.show();
            Stage currentStage = (Stage) progressIndicator.getScene().getWindow();
            currentStage.close(); // Zamyka obecne okno (Stage) LoadingView.fxml
        } catch (IOException e) {
            System.out.println("Błąd podczas ładowania sceny:" + fxmlFile);
            e.printStackTrace();
        }
    }

    @FXML
    public void loadingProcessProgIndic() {
        try {
            Task<Void> task = new Task<>() {
                @Override
                protected Void call() throws Exception {
                    int sleepTime = 100;
                    for (int i = 0; i <= 100; i++) {
                        if (i == 0) {
                            updateMessage("Application starting");
                            sleepTime = 10;
                        }

                        if (i == 11) {
                            updateMessage("Loading resources");
                            sleepTime = 20;
                        }
                        if (i == 31) {
                            updateMessage("Initializing");
                            sleepTime = 30;
                        }

                        if (i == 61) {
                            updateMessage("Executing");
                            sleepTime = 50;
                        }

                        if (i == 81) {
                            updateMessage("Optimization");
                            sleepTime = 10;
                        }

                        if (i == 91) {
                            updateMessage("Almost done!");
                            sleepTime = 5;
                        }
                        Thread.sleep(sleepTime); // Symulacja procesu
                        updateProgress(i, 100);
                    }
                    updateMessage("Done!");
                    return null;
                }
            };

            lblProgIndicText.textProperty().bind(task.messageProperty());
            progressIndicator.progressProperty().bind(task.progressProperty());

            // Po zakończeniu zadania, wywołuje openMainStage i otwiera nowe okno
            task.setOnSucceeded(e -> openNewStage("ILoginView.fxml"));

            new Thread(task).start();
        } catch (Exception e) {
            System.out.println("Błąd podczas ładowania 'task':");
            e.printStackTrace();
        }
    }
}
