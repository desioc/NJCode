import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.effect.*;

public class HelloWorldBlur extends Application {
    @Override
    public void init() {
        System.out.println("Inizio JavaFX");
    }
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setFont(new Font("Book Antiqua", 120));
        MotionBlur motionBlur = new MotionBlur();
        motionBlur.setRadius(10);
        motionBlur.setAngle(-90.0);
        label.setEffect(motionBlur);
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