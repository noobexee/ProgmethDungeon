package Skill;

import Base.BaseSkill;
import Base.BaseUnit;

import static java.lang.Math.ceil;

public class BuffArmor extends BaseSkill {
    public BuffArmor(String name) {
        super(name, 1);
    }
    @Override
    public void use(BaseUnit me, BaseUnit target) {
        me.setDef((int) ceil((me.getDef()*1.1)));
    }
}
