package com.example.java_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Q2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        for(int i = 0 ; i<3 ; i++)
        {
            for(int j =0 ; j<3 ; j++)
            {
                int n = (int)(Math.random()*3);
                if(n==0)
                {
                    pane.add(new ImageView(new Image("X.png")), j , i);
                }
                if(n==1)
                {
                    pane.add(new ImageView(new Image("O.png")), j , i);
                }
                else
                {
                    continue;
                }


            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Q2");
        primaryStage.show();
    }
}
