package Skill;

import Base.BaseSkill;
import Base.BaseUnit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HeavyAttack extends BaseSkill  {
    protected Random random = new Random();

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
