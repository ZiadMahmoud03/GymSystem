module com.example.gymsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gymsystem to javafx.fxml;
    exports com.example.gymsystem;
}