import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class SlidersBinding extends Application {
    private final static double GAP = (0.8 * Font.getDefault().getSize());
    public void start(Stage stage) {
        Slider slider1 = new Slider(0,250,500);
        Slider slider2 = new Slider(0,250,500);
        slider1.valueProperty().bindBidirectional(slider2.valueProperty());
        VBox root = new VBox(GAP);
        root.getChildren().addAll(slider1, slider2);
        Scene scene = new Scene(root);
        stage.setTitle("Sliders bindings");
        stage.setScene(scene);
        stage.setMinWidth(500);
        stage.setMinHeight(60);
        stage.show();
    }
}