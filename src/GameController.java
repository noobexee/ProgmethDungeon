import Base.BaseSkill;
import Base.BaseUnit;
import Enemy.Enemy;
import Player.Character.Warrior;
import Player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GameController {
    private ArrayList<Player> Myteam = new ArrayList<>(3);
    private ArrayList<Enemy> EmemyTeam = new ArrayList<>();
    private ArrayList<Player> CharPot = new ArrayList<Player>(Arrays.asList(
            new Warrior("Starter Warrior",10,5,3)
    ));
    public ArrayList<Player> selectRandomSkills() {
        Collections.shuffle(CharPot);
        ArrayList<Player> selectedSkills = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            selectedSkills.add(CharPot.get(i % CharPot.size()));
        }
        return selectedSkills;
    }

    public void gameStart(){

    }
}
