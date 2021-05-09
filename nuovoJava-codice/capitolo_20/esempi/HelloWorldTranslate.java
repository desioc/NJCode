import javafx.geometry.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.effect.*;
import javafx.animation.*;
import javafx.util.*;
import javafx.scene.paint.Color;

public class HelloWorldTranslate extends Application {
    @Override
    public void init() {
        System.out.println("Inizio JavaFX");
    }
    @Override
    public void start(Stage stage) {
        Button button = new Button("Hello World!");
        button.setFont(new Font("Book Antiqua", 20));
        TranslateTransition tt = new TranslateTransition(Duration.millis(2000), button);
        tt.setByX(80f);
        tt.setCycleCount(Animation.INDEFINITE);
        tt.setAutoReverse(true);
        tt.play();
        stage.setScene(new Scene(button));
        stage.setTitle("HelloWorld with JavaFX");
        stage.sizeToScene();
        stage.show();
    }
    @Override
    public void stop() {
        System.out.println("Fine JavaFX");
    }
}