package Action;

import Base.BaseAction;
import Base.BaseUnit;
import state.UseCondition;

public class SkillRecharge extends BaseAction {
    public SkillRecharge(String name) {
        super("Recharging", 3);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        me.setSkillPoint(me.getSkillPoint()+1);
        return UseCondition.CHARGED;
    }
}
