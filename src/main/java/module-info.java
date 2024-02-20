module com.javierarana.computerreservation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires mysql.connector.j;

    opens com.javierarana115.computerreservation to javafx.fxml;
    exports com.javierarana115.computerreservation;
}