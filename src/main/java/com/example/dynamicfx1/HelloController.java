package com.example.dynamicfx1;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField txt1;

   @FXML
   VBox mainBox;

   @FXML
   Label fname;
   @FXML
   VBox wordBox;


   @FXML
   private void loadWords()
   {
       String fn = fname.getText();
       try {
           List<String> lines = Files.readAllLines(new File(fn).toPath(), Charset.defaultCharset());
           for (String word: lines ) {
               wordBox.getChildren().add(new TextField(word));
           }
       }
        catch (IOException e) {
            e.printStackTrace();
       }
   }

   @FXML
   private void saveWords()
   {
       ArrayList<String> list = new ArrayList<>();
       for (Node text: wordBox.getChildren() ) {
           if(text instanceof TextField){
               String s = ((TextField) text).getText();
               list.add(s);
           }
       }
       String fn = fname.getText();
       try {
           Files.write(Path.of(fn), list);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }




   @FXML
    private void plus()
   {
       String s = txt1.getText();
       mainBox.getChildren().add(new Label(s));
   }
}