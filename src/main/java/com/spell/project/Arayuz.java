package com.spell.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Arayuz extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(Arayuz.class.getResource("Arayuz.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Spellbee");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
