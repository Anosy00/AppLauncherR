import javafx.embed.swing.SwingFXUtils;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.image.BufferedImage;
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
        File file = fileChooser.showOpenDialog(stage);

        String string = FileSystemView.getFileSystemView().getSystemDisplayName(file);
        ImageView imageView = Controller.createFXIcon(file);


        Main.gridPaneApp.getChildren().add(Controller.vBoxIconAndText(file, imageView));
        stage.setScene(scene);
    }
}
