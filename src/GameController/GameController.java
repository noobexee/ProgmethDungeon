package GameController;

import Base.BaseUnit;
import Enemy.Character.Kiki;
import Enemy.Enemy;
import Player.Character.Archer;
import Player.Character.Warrior;
import Player.Player;
import application.SelectCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GameController {
    private int Level;
    private static GameController instance = null;
    private ArrayList<Player> Myteam;
    private ArrayList<Enemy> EnemyTeam;
    private ArrayList<Player> CharPot = new ArrayList<Player>(Arrays.asList(
            new Warrior("Starter Warrior", 10, 5, 3),
            new Archer("Starter Archer", 7, 6, 1)
    ));
    private ArrayList<Enemy> EnemyPot = new ArrayList<Enemy>(Arrays.asList(
            new Kiki("Starter", 10, 3, 3)
    ));
    private ArrayList<Player> selectRandomChar(ArrayList<Player> pot) {
        Collections.shuffle(pot);
        ArrayList<Player> selectedChar = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            selectedChar.add(pot.get(i % pot.size()));
        }
        return selectedChar;
    }

    private ArrayList<Enemy> spawnEnemy(ArrayList<Enemy> pot) {
        ArrayList<Enemy> selectedEnemy = new ArrayList<>();
        for (int i = 0; i < Level; i++) {
            selectedEnemy.add(pot.get(i));
        }
        return selectedEnemy;
    }

    public GameController() {
        Myteam = new ArrayList<>();
        EnemyTeam = new ArrayList<>();
        Level = 1;
    }

    public void onGameStart() {
        // random card
        SelectCharacter.setRandomCard(selectRandomChar(CharPot));
        //random enemy

    }

    //getter setter
    public ArrayList<Player> getMyteam() {
        return Myteam;
    }

    public void setMyteam(ArrayList<Player> myteam) {
        Myteam = myteam;
    }

    public ArrayList<Enemy> getEnemyTeam() {
        return EnemyTeam;
    }

    public void setEnemyTeam(ArrayList<Enemy> enemyTeam) {
        EnemyTeam = enemyTeam;
    }

    public static GameController getInstance() {
        return (instance == null) ? new GameController() : instance;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }
}
