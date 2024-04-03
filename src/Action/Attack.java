package Action;

import Base.BaseAction;
import Base.BaseUnit;
import state.UseCondition;

public class Attack extends BaseAction {

    public Attack(String name) {
        super("Attack!!!", 2);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        int dmg = me.getAtt() - target.getDef();
        if(dmg<=0){dmg=0;}
        target.setHp(target.getHp()-dmg);
        if(!target.isAlive()){
            return UseCondition.KILL;}
        return UseCondition.ATTACK;
    }
}
