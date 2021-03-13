import java.nio.file.*;
import javafx.application.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.web.*;
import javafx.stage.*;

 
public class TestBrowser extends Application {
   @Override 
   public void start(Stage stage) {
      WebView browser = new WebView();
      WebEngine webEngine = browser.getEngine();
      webEngine.load("http://www.claudiodesio.com");
      Scene scene = new Scene(browser);
      stage.setScene(scene);
      stage.setWidth(1024);
      stage.setHeight(768);
      stage.show();
   }
 
}