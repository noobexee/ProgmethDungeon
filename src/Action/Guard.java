package Action;

import Base.BaseAction;
import Base.BaseUnit;

public class Guard extends BaseAction {
    public Guard(String name) {
        super("Blocked", 1);
    }

    @Override
    public void use(BaseUnit me, BaseUnit target) {
        me.setDef((int) Math.ceil(me.getDef()*1.3));
    }
}
