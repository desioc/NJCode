import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;

public class TestPieChart extends Application {
    private final static double GAP = (0.8 * Font.getDefault().getSize());
    @Override 
    public void start(Stage stage) {
        stage.setTitle("Statistiche musica");
        stage.setWidth(500);
        stage.setHeight(500);
        ObservableList<PieChart.Data> data =
        FXCollections.observableArrayList(
            new PieChart.Data("Jazz", 25),
            new PieChart.Data("Blues",24),
            new PieChart.Data("Pop", 1),
            new PieChart.Data("Classica", 15),
            new PieChart.Data("Rock", 35)
        );
        PieChart pieChart = new PieChart(data);
        pieChart.setTitle("Statistiche musica");
        HBox box = new HBox(GAP);
        box.getChildren().addAll(pieChart);
        box.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(box));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}