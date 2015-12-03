package com.hawasy.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConvertFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane mainPane = FXMLLoader.load(getClass().getResource("Convert.fxml"));

        //System.out.println(mainPane.getChildren().get(1));
       // Label lab = (Label)mainPane.getChildren().get(1);

       // System.out.println(lab.getText());//On affiche le text de ton label


        Scene scene = new Scene(mainPane, 500, 400 );

        primaryStage.setTitle("Convertisseur de devises");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
