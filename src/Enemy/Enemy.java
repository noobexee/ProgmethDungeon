package Enemy;

import Base.BaseSkill;
import Base.BaseUnit;
import Skill.BuffArmor;
import Skill.HeavyAttack;
import Skill.SelfHeal;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Enemy extends BaseUnit {

    private ArrayList<BaseSkill> skillPot = new ArrayList<>(Arrays.asList(
            new HeavyAttack("HARD Slash"),
            new BuffArmor("Fortified"),
            new SelfHeal("For the King")));
    public Enemy(String name, int hp, int att, int def) {
        super(name, hp, att, def);
    }

    public String canTakeAction(BaseUnit target, int index) {
        getAction().get(index).use(this, target);
        return this.getName()+" attack "+ target.getName();
    }

    public String canUseSkill(BaseUnit target, int index) {
        getSkill().get(index).use(this, target);
        return this.getName()+" attack "+ target.getName();
    }

}
