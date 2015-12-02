package com.hawasy.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;

public class ConvertFXController implements Initializable {

    @FXML private GridPane mainPane;//fx:id te permet de récupérer les éléments depuis ton fxml (seulement dans le controller)
    private ComboBox<String> combo1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        combo1 = new ComboBox<>();
        mainPane.add(combo1, 1,3);//On ajoute la comboBox a la 3ème ligne, 1ère colonne

        combo1.getItems().add("EUR");
        combo1.getItems().add("USD");
        combo1.getItems().add("AUD");

    }
    public void handleConvertButtonAction(ActionEvent actionEvent) {
        System.out.println("ça fonctionne");
    }


}
