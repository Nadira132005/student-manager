module com.example.lab5_fis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab5_fis to javafx.fxml;
    exports com.example.lab5_fis;
}