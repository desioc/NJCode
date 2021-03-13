import javafx.scene.*;
import javafx.stage.*;
import java.io.*;
import javafx.application.*;
import javafx.fxml.*;

public class LoginFXCSS extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Login");
        Parent root = FXMLLoader.load(getClass().getResource("LoginCSS.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}