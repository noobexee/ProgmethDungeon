package Action;

import Base.BaseAction;
import Base.BaseUnit;
import state.UseCondition;

public class Guard extends BaseAction {
    public Guard(String name) {
        super("Blocked", 1);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        me.setDef((int) Math.ceil(me.getDef()*1.3));
        return UseCondition.GUARD;
    }
}
