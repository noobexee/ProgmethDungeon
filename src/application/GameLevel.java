package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;

public class GameLevel {

    public VBox getVBox() {
        VBox layout = new VBox();
        Image image = new Image("file:res/dungeon.png");
        layout.setBackground(new Background(new BackgroundImage(image, null, null, null, null)));
        return layout;
    }
}