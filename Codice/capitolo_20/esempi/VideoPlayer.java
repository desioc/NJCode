import java.nio.file.*;
import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.stage.*;
import java.net.*;

public class VideoPlayer extends Application {
    private static String getPath() {
        return Paths.get("filmato.mp4").toUri().toString();
    }

    public void start(Stage stage) {
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(getPath()));
        mediaPlayer.setAutoPlay(true);
        MediaView view = new MediaView(mediaPlayer);
        VBox box = new VBox(view);
        box.setAlignment(Pos.CENTER);
        Scene scene = new Scene(box);
        stage.setScene(scene);
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.show();
    }
}