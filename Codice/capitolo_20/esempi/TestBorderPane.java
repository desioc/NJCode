import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class TestBorderPane extends Application {
    public  void start(Stage stage) {
        BorderPane pane= new BorderPane ();
        pane.setTop(new Button("Alto"));
        pane.setBottom(new Button("Basso"));
        pane.setLeft(new Button("Sinistra"));
        pane.setRight(new Button("Destra"));
        pane.setCenter(new Button("Centro"));
        stage.setScene(new Scene(pane));
        stage.show();
    }
}