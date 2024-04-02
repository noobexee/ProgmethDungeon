package Player.Character;

import Base.BaseSkill;
import Base.BaseUnit;
import LevelUp.LevelWarrior;
import Player.Player;
import Skill.BuffArmor;
import Skill.HeavyAttack;
import Skill.SelfHeal;
import state.UseCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warrior extends Player implements LevelWarrior {

    private int con = 3;

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
    @Override
    public String canTakeAction(BaseUnit target, int index, int cost){
        if(getActionPoint()>=cost){
            UseCondition set = getAction().get(index).use(this, target);
            LevelupCon(set == UseCondition.ATTACK||set == UseCondition.KILL);
            setActionPoint(getActionPoint()-cost);
            return getAction().get(index).getName();
        }else{
            return  "Not enough action point";
        }
    }
    @Override
    public String canUseSkill(BaseUnit target,int index,int cost){
        if(getSkillPoint()>=cost){
            UseCondition set = getSkill().get(index).use(this, target);
            LevelupCon(set == UseCondition.ATTACK||set == UseCondition.KILL);
            setSkillPoint(getSkillPoint()-cost);
            return "Used "+ getSkill().get(index).getName();
        }else{
            return  "Not enough skill point";
        }
    }

    @Override
    public void LevelupCon(boolean c) {
        if(c){con--;}
        if(con==0){LevelUp(this);}
    }

}
