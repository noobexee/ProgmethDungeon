package Skill;

import Base.BaseSkill;
import Base.BaseUnit;

public class SelfHeal extends BaseSkill{
    public SelfHeal(String name) {
        super(name, 1);
    }
    @Override
    public void use(BaseUnit me, BaseUnit target) {
        me.setHp((int) Math.ceil((me.getHp())*1.2));
    }
}
