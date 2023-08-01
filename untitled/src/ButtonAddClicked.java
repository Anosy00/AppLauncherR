import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ButtonAddClicked implements EventHandler {
    @Override
    public void handle(Event event) {
        Stage stage = new Stage();
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 1000, 1000);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select your app");
        fileChooser.setInitialDirectory(new File("C:\\Program Files"));
        fileChooser.showOpenDialog(stage);
        stage.setScene(scene);
    }
}
