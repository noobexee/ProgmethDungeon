package application;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class GameLevel {

    public VBox getVBox() {
        VBox layout = new VBox();
        Image image = new Image("file:res/village.png");
        layout.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, new BackgroundSize(1366, 768, true, true, true, false))));
        return layout;
    }
}