package Action;

import Base.BaseAction;
import Base.BaseUnit;

public class Attack extends BaseAction {

    public Attack(String name) {
        super("Attack!!!", 2);
    }

    @Override
    public void use(BaseUnit me, BaseUnit target) {
        int dmg = me.getAtt() - target.getDef();
        target.setHp(target.getHp()-dmg);
    }
}
