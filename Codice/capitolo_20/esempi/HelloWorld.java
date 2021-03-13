import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.*;
import java.util.*;

public class HelloWorld extends Application {
    private String stringToPrint ="Hello World!";
    public HelloWorld() {
        System.out.println("Constructor method called");
    }

    @Override
    public void init() {
        System.out.println("Init() method called");
        Parameters params = getParameters();
        List<String> args = params.getRaw();
        if (args.size() != 0) {
            stringToPrint = args.get(0);
        }
        System.out.println("Print Command Line Arguments:");
        for(String arg : args) {
            System.out.println(arg);
        }
    }
    @Override
    public void start(Stage stage) {
        System.out.println("Start() method called");
        Label label = new Label(stringToPrint);
        label.setFont(new Font("Book Antiqua", 120));
        stage.setScene(new Scene(label));
        stage.setTitle("HelloWorld with JavaFX");
        stage.sizeToScene();
        stage.show();
    }
    @Override
    public void stop() {
        System.out.println("Stop() method called");
    }
}