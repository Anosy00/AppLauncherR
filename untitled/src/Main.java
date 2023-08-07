import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {
    public static BorderPane borderPane;
    public static GridPane gridPaneApp;
    @Override
    public void start(Stage stage) throws Exception {
        borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 1000, 1000);
//        Runtime runtime = Runtime.getRuntime();
//
//        runtime.exec("notepad.exe");


        HBox topHbox = new HBox();
        borderPane.setTop(topHbox);
        Button button = new Button("+");
        button.setPrefWidth(100);
        button.setPrefHeight(50);
        button.setBackground(new Background(new BackgroundFill(Color.rgb(88, 90, 94), CornerRadii.EMPTY, Insets.EMPTY)));
        button.setFont(new Font(35));
        button.setOnMouseClicked(new ButtonAddClicked());
        topHbox.getChildren().add(button);
        topHbox.setAlignment(Pos.BASELINE_RIGHT);
        topHbox.setBackground(new Background(new BackgroundFill(Color.rgb(88, 90, 94), CornerRadii.EMPTY, Insets.EMPTY)));

        gridPaneApp = new GridPane();
        gridPaneApp.setVgap(15);
        gridPaneApp.setHgap(25);
        borderPane.setCenter(gridPaneApp);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
