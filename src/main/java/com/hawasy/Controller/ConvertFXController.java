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

    @FXML private GridPane mainPane;//fx:id te permet de récupérer les éléments depuis ton fxml (seulement dans le controller)
    private ComboBox<Devise> combo1;
    private ComboBox<Devise> combo2;
    private Label label;



    @Override
   /* public void initialize(URL location, ResourceBundle resources) {

        combo1 = new ComboBox<>();
        mainPane.add(combo1, 1,3);//On ajoute la comboBox a la 3ème ligne, 1ère colonne

        combo1.getItems().add("EUR");
        combo1.getItems().add("USD");
        combo1.getItems().add("AUD");

    }*/

    public void initialize(URL location, ResourceBundle resources) {
        combo1 = new ComboBox<>();
        combo2=new ComboBox<>();
        mainPane.add(combo1, 1,9);
        mainPane.add(combo2, 1,10);
        //affiche tout les ?l?ment de l'index dans la combo box
        Index indexDevise =new Index("Liste de devises",1);
        for (Devise elem : indexDevise.getList()) {

            combo1.getItems().add(elem);
            combo2.getItems().add(elem);
        }
    }

@FXML
private TextField SOMME;


    public void handleConvertButtonAction(ActionEvent actionEvent) {

        Object valeur1 = combo1.getValue();
        Object valeur2 = combo2.getValue();

           label = new Label("RESULTAT :   "+(SOMME.getText()/valeur1.tauxDeChangeEnEuro())* valeur2.tauxDeChangeEnEuros()) ;
            mainPane.add(label, 2, 10);
            //label=(SOMME.value/combo1.tauxDeChangeEnEuros)*combo2.tauxDeChangeEnEuros;
            System.out.println("cela fonctionne");
        }
    }


