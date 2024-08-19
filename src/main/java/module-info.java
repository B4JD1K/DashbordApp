module now.be.dashboardapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens now.be.dashboardapp.controllers to javafx.fxml;
    opens now.be.dashboardapp to javafx.fxml;

    exports now.be.dashboardapp;
}
