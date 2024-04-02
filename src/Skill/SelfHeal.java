package Skill;

import Base.BaseSkill;
import Base.BaseUnit;
import state.UseCondition;

public class SelfHeal extends BaseSkill{
    public SelfHeal(String name) {
        super(name, 1);
    }
    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        me.setHp((int) Math.ceil((me.getHp())*1.2));
        return UseCondition.HEAL;
    }
}
