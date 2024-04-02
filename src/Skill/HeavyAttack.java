package Skill;

import Base.BaseSkill;
import Base.BaseUnit;

public class HeavyAttack extends BaseSkill  {

    public HeavyAttack(String name) {
        super(name, 2);
    }

    @Override
    public void use(BaseUnit me, BaseUnit target) {
        int dmg = me.getAtt()*2;
        dmg = dmg - target.getDef();
        target.setHp(target.getHp()-dmg);
    }
}
