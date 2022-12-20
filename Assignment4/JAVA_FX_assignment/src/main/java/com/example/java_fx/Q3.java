package com.example.java_fx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(5);
        hBox.setPadding(new Insets(10 , 10 , 10 , 10));
        hBox.setAlignment(Pos.CENTER);
        for(int i = 0 ; i < 5 ; i++)
        {
            Text text =  new Text("Java");
            text.setFont(Font.font("Times Roman", FontWeight.BOLD , FontPosture.ITALIC ,22));
            text.setFill(new Color(Math.random() ,Math.random(), Math.random(), Math.random()));
            text.setRotate(90);
            hBox.getChildren().add(text);

        }
        Scene scene = new Scene(hBox , 300 , 100);
        primaryStage.setTitle("Q3");
        primaryStage.setScene(scene);
      primaryStage.show();
    }
}
