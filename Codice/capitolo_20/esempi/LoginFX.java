import javafx.scene.*;
import javafx.stage.*;
import java.io.*;
import javafx.application.*;
import javafx.fxml.*;

public class LoginFX extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Login");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}