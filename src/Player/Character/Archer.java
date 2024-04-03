package Player.Character;

import Base.BaseSkill;
import Base.BaseUnit;
import LevelUp.LevelArcher;
import LevelUp.LevelWarrior;
import Player.Player;
import Skill.*;
import state.UseCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Archer extends Player implements LevelArcher {

    private int con = 3;

    public Archer(String name, int hp, int att, int def) {
        super(name, hp, att, def);
        this.setSkill(selectRandomSkills());
    }

    @Override
    public String canTakeAction(BaseUnit target, int index, int cost) {
        if (getActionPoint() >= cost) {
            LevelupCon(getAction().get(index).use(this, target) == UseCondition.KILL);
            setActionPoint(getActionPoint() - cost);
            return getAction().get(index).getName();
        } else {
            return "Not enough action point";
        }
    }

    @Override
    public String canUseSkill(BaseUnit target, int index, int cost) {
        if (getSkillPoint() >= cost) {
            LevelupCon(getSkill().get(index).use(this, target) == UseCondition.KILL);
            setSkillPoint(getSkillPoint() - cost);
            setActionPoint(getActionPoint() - cost);
            return "Used " + getSkill().get(index).getName();
        } else {
            return "Not enough skill point";
        }
    }

    @Override
    public void LevelupCon(boolean c) {
        if (c) {
            con--;
        }
        if (con == 0) {
            LevelUp(this);
            this.setCon(3);
        }
    }

    private final ArrayList<BaseSkill> skillPot = new ArrayList<>(Arrays.asList(
            new Piercing("BloodBath"),
            new DoubleTap("Double Tap!!!"),
            new SelfHeal("For the King")));

    private ArrayList<BaseSkill> selectRandomSkills() {
        Collections.shuffle(skillPot);
        return new ArrayList<>(skillPot.subList(0, 3));
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }
}
