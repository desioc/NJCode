package com.claudiodesio.javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.image.*;

public class FirstJFXExample extends Application {
    public static void main(String args[]) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        Image image = new Image("/res/Duke-Guitar.png");
        Label label = new Label("JavaFX \nRocks! ", new ImageView(image));
        label.setTextAlignment(TextAlignment.CENTER);
        label.setFont(new Font("Book Antiqua", 120));
        stage.setScene(new Scene(label));
        stage.setTitle("HelloWorld with JavaFX");
        stage.sizeToScene();
        stage.show();
    }
}