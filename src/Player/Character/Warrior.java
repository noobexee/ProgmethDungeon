package Player.Character;

import Base.BaseAction;
import Base.BaseSkill;
import Configuration.Level;
import Player.Player;
import Skill.BuffArmor;
import Skill.HeavyAttack;
import Skill.SelfHeal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warrior extends Player implements Level {

    private final ArrayList<BaseSkill> skillPot = new ArrayList<>(Arrays.asList(
            new HeavyAttack("HARD Slash"),
            new BuffArmor("Fortified"),
            new SelfHeal("For the King")));

    private ArrayList<BaseSkill> selectRandomSkills() {
        Collections.shuffle(skillPot);
        return new ArrayList<>(skillPot.subList(0, 3));
    }

    public Warrior(String name, int hp, int att, int def) {
        super(name, hp, att, def);
        this.setSkill(selectRandomSkills());
    }

}
