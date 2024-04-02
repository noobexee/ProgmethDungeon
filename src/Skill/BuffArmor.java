package Skill;

import Base.BaseSkill;
import Base.BaseUnit;
import state.UseCondition;

import static java.lang.Math.ceil;

public class BuffArmor extends BaseSkill {

    public BuffArmor(String name) {
        super(name, 1);
    }
    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        me.setDef((int) ceil((me.getDef()*1.1)));
        return UseCondition.BUFF;
    }
}
