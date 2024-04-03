package application;

import GameController.GameController;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GameLevel {

    private GameController gameController;
    private static HBox layout;
    private Stage primaryStage;

    public GameLevel(Stage primaryStage) {
        this.primaryStage = primaryStage;
        layout = new HBox();
        Image image = new Image("file:res/village.png");
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, new BackgroundSize(1366, 768, true, true, true, false))));
    }

    public HBox getStage() {
        return layout;
    }

}