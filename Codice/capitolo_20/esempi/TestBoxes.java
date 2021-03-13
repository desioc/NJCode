import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class TestBoxes extends Application {
    private final static double gap = (0.8 * Font.getDefault().getSize());
    public void start(Stage stage) {
        stage.setTitle("Motore di ricerca");
        Button cercaButton = new Button("Cerca");
        Button resetButton = new Button("Reset");
        Label label = new Label("Inserisci parola da ricercare");
        TextField text = new TextField();
        final double rem = Font.getDefault().getSize();
        VBox vBox = new VBox(gap);
        HBox northPane = new HBox(gap);
        HBox southPane = new HBox(gap);
        northPane.getChildren().addAll(label, text);;
        southPane.getChildren().addAll(cercaButton, resetButton);
        southPane.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(northPane, southPane);
        northPane.setPadding(new Insets(gap));
        southPane.setPadding(new Insets(gap));
        stage.setScene(new Scene(vBox));
        stage.show();
    }
}