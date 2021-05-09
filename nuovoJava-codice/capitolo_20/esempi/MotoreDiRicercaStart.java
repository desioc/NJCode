import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;

public class MotoreDiRicercaStart extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Motore di ricerca");
        //MotoreDiRicercaPane pane = new MotoreDiRicercaPane();
        //MotoreDiRicercaContainer pane = new MotoreDiRicercaContainer();
        MotoreDiRicercaGridPane pane = new MotoreDiRicercaGridPane();
      // MotoreDiRicercaGridPaneCSS pane = new MotoreDiRicercaGridPaneCSS();
        Scene scene = new Scene(pane);
        scene.getStylesheets().add("test.css");
        stage.setScene(scene);
        stage.show();
    }
}