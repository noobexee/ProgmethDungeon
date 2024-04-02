package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Paths;


public class GameMainMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating UI components
        Label titleLabel = new Label("Game Title");
        titleLabel.setTextFill(Color.WHITE);
        titleLabel.setStyle("-fx-font-size: 50px;");


        Button startButton = new Button("Start Game");
        Button exitButton = new Button("Exit");

        String buttonStyle = "-fx-font-size: 18px; -fx-min-width: 150px; -fx-min-height: 40px; -fx-background-color: transparent; -fx-text-fill: white;";
        startButton.setStyle(buttonStyle);
        exitButton.setStyle(buttonStyle);

        startButton.setOnAction(actionEvent -> {
            GameLevel gameLevel = new GameLevel();
            VBox gameLevelVBox = gameLevel.getVBox();
            Scene gameLevelScene = new Scene(gameLevelVBox, 1366, 768);
            primaryStage.setScene(gameLevelScene);
            primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("");
        });



        exitButton.setOnAction(actionEvent -> {
            primaryStage.close();
        });

        // Layout setup
        VBox layout = new VBox(20); // Set spacing between components
        layout.setPadding(new Insets(100));
        Image image = new Image("file:res/mainmenu.png");
        layout.setBackground(new Background(new BackgroundImage(image, null, null, null, null)));
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(titleLabel, startButton, exitButton);

        VBox.setMargin(titleLabel, new Insets(0, 0, 500, 0));

        // Create a scene and set it on the stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");

        // Set the title of the stage (main menu window)
        primaryStage.setTitle("Game Main Menu");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}