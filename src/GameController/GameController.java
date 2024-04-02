package GameController;

import Enemy.Enemy;
import Player.Character.Archer;
import Player.Character.Warrior;
import Player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GameController {
    public static GameController instance = null;
    private ArrayList<Player> Myteam;
    private ArrayList<Enemy> EnemyTeam;
    private ArrayList<Player> CharPot = new ArrayList<Player>(Arrays.asList(
            new Warrior("Starter Warrior",10,5,3),
            new Archer("Starter Archer", 7, 6,1)
    ));
    public ArrayList<Player> selectRandomChar() {
        Collections.shuffle(CharPot);
        ArrayList<Player> selectedSkills = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            selectedSkills.add(CharPot.get(i % CharPot.size()));
        }
        return selectedSkills;
    }

    public GameController() {
        Myteam = new ArrayList<>();
        EnemyTeam = new ArrayList<>();
    }

    public void onGameStart(){
        // show this
        ArrayList<Player> display = selectRandomChar();
        //select this
        for(int i=0;i<3;i++){
            //input index
            int index=0;
            Myteam.add(display.get(index));
        }
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
        return (instance==null)? new GameController():instance;
    }

}
