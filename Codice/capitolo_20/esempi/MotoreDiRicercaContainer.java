import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class MotoreDiRicercaContainer extends BorderPane {
    private Label labelTop;
    private Label labelBottom;
    public MotoreDiRicercaContainer() {
        super();
        labelTop = new Label("Intestazione della pagina");
        labelBottom = new Label("Risultati della ricerca");
        setup();
    }
    public void setup() {
        this.setTop(labelTop);
        this.setBottom(labelBottom);
        BorderPane.setAlignment(labelTop, Pos.CENTER);
        BorderPane.setAlignment(labelBottom, Pos.CENTER);
        this.setCenter(new MotoreDiRicercaPane());
    }
}    