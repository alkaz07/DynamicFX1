package com.example.dynamicfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private TextField txt1;

   @FXML
    VBox mainBox;

   @FXML
    private void plus()
   {
       String s = txt1.getText();
       mainBox.getChildren().add(new Label(s));
   }
}