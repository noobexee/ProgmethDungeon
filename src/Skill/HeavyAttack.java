package Skill;

import Base.BaseSkill;
import Base.BaseUnit;
import state.UseCondition;

import java.util.Random;

public class HeavyAttack extends BaseSkill  {
    protected Random random = new Random();

    public HeavyAttack(String name) {
        super(name, 2);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        int dmg = me.getAtt()*2;
        dmg = dmg - target.getDef();
        if(dmg<=0){dmg=0;}
        target.setHp(target.getHp()-dmg);
        if(target.getHp()<=0){
            target.setAlive(false);
            return UseCondition.KILL;}
        return UseCondition.ATTACK;
    }
}
