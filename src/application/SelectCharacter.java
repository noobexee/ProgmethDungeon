package application;

import GameController.GameController;
import Player.Player;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SelectCharacter {
    private GameController gameController;
    private static HBox layout;
    private static ArrayList<Card> displayedCards;
    private static ArrayList<Player> selectedPlayers = new ArrayList<>();
    private static int cardsSelected = 0;
    private Stage primaryStage;
    private static ArrayList<Player> randomCard;

    public SelectCharacter(Stage primaryStage) {
        this.primaryStage = primaryStage;
        gameController = GameController.getInstance();
        // On Game Start
        gameController.onGameStart();
        displayedCards = new ArrayList<>();
        for (Player player : randomCard) {
            Card card = new Card(player);
            displayedCards.add(card);
        }
        layout = createLayout();

    }

    public HBox getHBox() {
        return layout;
    }

    private HBox createLayout() {
        HBox layout = new HBox();
        Image image = new Image("file:res/village.png");
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, new BackgroundSize(1366, 768, true, true, true, false))));

        // Add cards to the layout
        for (Card card : displayedCards) {
            layout.getChildren().add(card.getNode());
        }
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(event -> {
            if (cardsSelected == 4) {
                moveToGameLevel();
            } else {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please select 4 cards!");
                alert.showAndWait();
            }
        });
        submitButton.setVisible(false);
        layout.getChildren().add(submitButton);
        return layout;
    }

    // Function to select cards
    public static void selectCards(Card card) {
        if (card.isSelected()) {
            card.setSelected(false);
            selectedPlayers.remove(card.getPlayer());
            GameController.getInstance().getMyteam().remove(card.getPlayer());
            cardsSelected--;
        } else if (cardsSelected < 4) {
            card.setSelected(true);
            selectedPlayers.add(card.getPlayer());
            GameController.getInstance().getMyteam().add(card.getPlayer());
            cardsSelected++;
        }

        // Update card appearance
        updateCardAppearance(card);

        // Check if all 4 cards are selected
        if (cardsSelected == 4) {
            enableSubmitButton();
        } else {
            disableSubmitButton();
        }
    }
    private static void updateCardAppearance(Card card) {
        StackPane cardNode = (StackPane) card.getNode();
        if (card.isSelected()) {
            cardNode.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.LIGHTBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            cardNode.setBackground(Background.EMPTY);
        }
    }
    // Enable the submit button
    private static void enableSubmitButton() {
        Button submitButton = (Button) layout.getChildren().get(layout.getChildren().size() - 1); // Assuming submit button is the last child
        submitButton.setVisible(true);
    }

    // Disable the submit button
    private static void disableSubmitButton() {
        Button submitButton = (Button) layout.getChildren().get(layout.getChildren().size() - 1); // Assuming submit button is the last child
        submitButton.setVisible(false);
    }

    private void moveToGameLevel() {
        GameLevel gameLevel = new GameLevel(primaryStage);
        HBox gameLevelHBox = gameLevel.getStage();
        Scene gameLevelScene = new Scene(gameLevelHBox, 1366, 768);
        primaryStage.setScene(gameLevelScene);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
    }

    public static ArrayList<Player> getRandomCard() {
        return randomCard;
    }

    public static void setRandomCard(ArrayList<Player> randomCard) {
        SelectCharacter.randomCard = randomCard;
    }

}