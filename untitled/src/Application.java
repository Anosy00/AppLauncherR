import javafx.scene.image.ImageView;

import java.io.File;

public class Application {
    ImageView logo;
    File file;

    public Application(File file, ImageView logo){
        this.logo = logo;
        this.file = file;
    }

    public Application(File file){
        this.file = file;
        this.logo = Controller.createFXIcon(file);
    }
}
