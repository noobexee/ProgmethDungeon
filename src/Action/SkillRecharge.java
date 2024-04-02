package Action;

import Base.BaseAction;
import Base.BaseUnit;
import Player.Player;

public class SkillRecharge extends BaseAction {
    public SkillRecharge(String name) {
        super("Recharging", 3);
    }

    @Override
    public void use(BaseUnit me, BaseUnit target) {
        me.setSkillPoint(me.getSkillPoint()+1);
    }
}
