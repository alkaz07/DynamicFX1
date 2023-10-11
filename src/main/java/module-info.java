module com.example.dynamicfx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dynamicfx1 to javafx.fxml;
    exports com.example.dynamicfx1;
}