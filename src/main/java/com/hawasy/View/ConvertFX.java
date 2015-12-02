package com.hawasy.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConvertFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane mainPane = FXMLLoader.load(getClass().getResource("Convert.fxml"));

        Scene scene = new Scene(mainPane, 700, 500 );

        primaryStage.setTitle("Convertisseur de devises");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
