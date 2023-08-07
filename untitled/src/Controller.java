import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Controller {
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        return bimage;
    }

    public static ImageView createFXIcon(File file){
        ImageIcon icon = (ImageIcon) FileSystemView.getFileSystemView().getSystemIcon(file);
        Image image = icon.getImage();
        BufferedImage bufferedImage = Controller.toBufferedImage(image);
        javafx.scene.image.Image image1= SwingFXUtils.toFXImage(bufferedImage, null);
        ImageView imageView = new ImageView();
        imageView.setImage(image1);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);

        return imageView;
    }

    public static VBox vBoxIconAndText(File file, ImageView imageView){
        String string = FileSystemView.getFileSystemView().getSystemDisplayName(file);
        Text text = new Text(string);
        text.setFont(new Font("Arial bold", 15));
        VBox vBox = new VBox();
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(text);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);

        return vBox;
    }
}
