package Configuration;

import Base.BaseUnit;
import Player.Character.Warrior;

public interface Level {

    default void LevelUp(BaseUnit me){
        me.setHp((int) Math.ceil(me.getHp()*(1.2)));
        me.setDef((int) Math.ceil(me.getDef()*(1.2)));
        me.setAtt((int) Math.ceil(me.getAtt()*(1.2)));
        me.setLevel(me.getLevel()+1);
        if(me.getLevel()>5){
            if(me instanceof Warrior){me.setName("Just some Warrior");}
        } else if (me.getLevel()>10) {
            if(me instanceof Warrior) {me.setName("Just Better Warrior");}
        } else if (me.getLevel()>15) {
            if(me instanceof Warrior) {me.setName("Much Better Warrior");}
        } else if (me.getLevel()>20) {
            if(me instanceof Warrior) {me.setName("Skillfully Warrior");}
        } else if (me.getLevel()>25) {
            if(me instanceof Warrior) {me.setName("Master Warrior");}
        } else if (me.getLevel()>30) {
            if(me instanceof Warrior) {me.setName("Ultra Master Warrior");}
        } else if (me.getLevel()>40) {
            if(me instanceof Warrior) {me.setName("God Warrior");}
        }
    }
}
