package Skill;

import Base.BaseSkill;
import Base.BaseUnit;
import GameController.GameController;
import state.UseCondition;

public class DoubleTap extends BaseSkill {
    public DoubleTap(String name) {
        super(name, 2);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        BaseUnit target2 = GameController.getInstance().getEnemyTeam().get(0);
        int dmg = me.getAtt() - target.getDef();
        int dmg2 = me.getAtt() - target2.getDef();
        if (dmg <= 0) {
            dmg = 0;
        }
        target.setHp(target.getHp() - dmg);
        target2.setHp(target.getHp() - dmg2);
        if (!target.isAlive() || !target2.isAlive()) {
            return UseCondition.KILL;
        }
        return UseCondition.ATTACK;
    }

}
