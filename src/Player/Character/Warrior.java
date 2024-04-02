package Player.Character;

import Base.BaseSkill;
import Player.Player;
import Skill.BuffArmor;
import Skill.HeavyAttack;

import java.util.ArrayList;

public class Warrior extends Player {

    private BaseSkill skill1 = new HeavyAttack("HARD Slash");
    private BaseSkill skill2 = new BuffArmor("Fortified");

    public Warrior(String name, int hp, int att, int def) {
        super(name, hp, att, def);
    }



}
