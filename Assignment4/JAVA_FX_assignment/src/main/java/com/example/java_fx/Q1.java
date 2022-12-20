package com.example.java_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Q1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.add(new ImageView(new Image("download.png")) , 0 , 0);
        pane.add(new ImageView(new Image("Canada.png")) ,1 , 0);
        pane.add(new ImageView(new Image("china.png")) ,0 , 1);
        pane.add(new ImageView(new Image("USA.png")) ,1, 1);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Q1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
