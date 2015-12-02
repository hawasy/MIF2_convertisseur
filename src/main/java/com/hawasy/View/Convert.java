package com.hawasy.View;/**
 * Created by Hawa on 20/11/2015.
 */
import com.hawasy.model.Devise;
import com.hawasy.model.Index;
import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Convert extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    MainController mainController;
    ComboBox<String> comboBox;
    Button loadButton;

    @Override
    public void start(Stage primaryStage) throws IOException {




       MainController mainController = new MainController();
        Pane mainPane = FXMLLoader.load(getClass().getResource("Convert.fxml"));
        HBox hbox = (HBox) mainPane.getChildren().get(0);
        comboBox = (ComboBox<String>) hbox.getChildren().get(0);

        //affiche tout les éléments de l'index dans la combo box
        for (Devise devise : mainController.indexDevise.getList()) {
            comboBox.getItems().add(devise.getName());
        }

        loadButton = (Button) hbox.getChildren().get(1);
        loadButton.setText("CONVERT");

        loadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(mainController.indexDevise.toString());
            }
        });


        Scene scene = new Scene(new Pane(), 700, 500 );

        primaryStage.setTitle("Convertisseur de devises");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}




