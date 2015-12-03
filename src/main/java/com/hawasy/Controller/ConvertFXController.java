package com.hawasy.Controller;

import com.hawasy.Model.Index;
import com.hawasy.Model.Devise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.net.URL;
import java.util.Date;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;

public class ConvertFXController implements Initializable {

    @FXML private TextField SOMME;
    @FXML private GridPane mainPane;//fx:id te permet de récupérer les éléments depuis ton fxml (seulement dans le controller)
    private ComboBox<Devise> combo1;
    private ComboBox<Devise> combo2;
    private Label label;


    public void initialize(URL location, ResourceBundle resources) {
        combo1 = new ComboBox<>();
        combo2 = new ComboBox<>();
        mainPane.add(combo1, 1, 9);
        mainPane.add(combo2, 1, 10);
        //affiche tout les ?l?ment de l'index dans la combo box
        Index indexDevise = new Index("Liste de devises",1);

        for (Devise elem : indexDevise.getList()) {

            System.out.println(elem);
            combo1.getItems().add(elem);
            combo2.getItems().add(elem);
        }
    }

    public void handleConvertButtonAction(ActionEvent actionEvent) {

        Devise valeur1 = combo1.getValue();
        Devise valeur2 = combo2.getValue();

        Double temp = Double.parseDouble(SOMME.getText());

        Double result = (temp / valeur1.tauxDeChangeEnEuro())* valeur2.tauxDeChangeEnEuro();

           label = new Label("RESULTAT :   " + result) ;
            mainPane.add(label, 1, 12);
            //label=(SOMME.value/combo1.tauxDeChangeEnEuros)*combo2.tauxDeChangeEnEuros;
            System.out.println("cela fonctionne");
        }
    }


