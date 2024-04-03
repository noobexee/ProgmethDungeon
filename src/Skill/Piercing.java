package Skill;

import Base.BaseSkill;
import Base.BaseUnit;
import Enemy.Enemy;
import GameController.GameController;
import state.UseCondition;

public class Piercing extends BaseSkill {
    public Piercing(String name) {
        super(name, 3);
    }

    @Override
    public UseCondition use(BaseUnit me, BaseUnit target) {
        UseCondition set = UseCondition.ATTACK;
        for( Enemy e : GameController.getInstance().getEnemyTeam()){
            e.setHp(e.getHp()-(me.getAtt()/2));
            if(!e.isAlive()){
                set =  UseCondition.KILL;}
        }

        return set;
    }
}
