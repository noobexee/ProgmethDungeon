package application;

import Player.Player;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Card {
    private Player player;
    private boolean selected = false;

    public Card(Player player) {
        this.player = player;
    }

    public Node getNode() {
        Rectangle cardRectangle = new Rectangle(200, 330); // Adjusted height to fit content
        cardRectangle.setFill(Color.WHITE);
        cardRectangle.setStroke(Color.BLACK);

        ImageView imageView = new ImageView(new Image("file:res/player/duck.gif"));
        imageView.setFitWidth(80);
        imageView.setFitHeight(150);
        imageView.setTranslateY(-70);

        Label nameLabel = new Label(player.getName());
        nameLabel.setTranslateY(20);

        Label hpLabel = new Label("HP: " + player.getHp());
        hpLabel.setTranslateY(45);

        Label defLabel = new Label("DEF: " + player.getDef());
        defLabel.setTranslateY(65);

        Label atkLabel = new Label("ATK: " + player.getAtt());
        atkLabel.setTranslateY(85);

        Label skill1Label = new Label(player.getSkill().get(0).getName());
        skill1Label.setTranslateY(105);

        Label skill2Label = new Label(player.getSkill().get(1).getName());
        skill2Label.setTranslateY(125);

        Label skill3Label = new Label(player.getSkill().get(2).getName());
        skill3Label.setTranslateY(145);

        StackPane cardNode = new StackPane(cardRectangle, imageView, nameLabel, hpLabel, defLabel, atkLabel, skill1Label, skill2Label, skill3Label);
        cardNode.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                SelectCharacter.selectCards(Card.this);
                if (isSelected()) {
                    cardNode.setStyle("-fx-background-color: lightblue;");
                } else {
                    cardNode.setStyle(null);
                }
            }
        });
        return cardNode;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}