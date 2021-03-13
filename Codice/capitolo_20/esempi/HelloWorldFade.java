import javafx.geometry.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.effect.*;
import javafx.animation.*;
import javafx.util.*;

public class HelloWorldFade extends Application {
    @Override
    public void init() {
        System.out.println("Inizio JavaFX");
    }
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setFont(new Font("Book Antiqua", 120));
        FadeTransition fadeEffect = new FadeTransition(Duration.millis(3000));
        fadeEffect.setFromValue(1.0);
        fadeEffect.setToValue(0);
        fadeEffect.setCycleCount(Animation.INDEFINITE);
        fadeEffect.setAutoReverse(true);
        fadeEffect.setNode(label);
        fadeEffect.play();
        stage.setScene(new Scene(label));
        stage.setTitle("HelloWorld with JavaFX");
        stage.sizeToScene();
        stage.show();
    }
    @Override
    public void stop() {
        System.out.println("Fine JavaFX");
    }
}