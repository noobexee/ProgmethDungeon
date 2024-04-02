package LevelUp;

import Base.BaseUnit;

public interface LevelArcher {
    default void LevelUp(BaseUnit me){
        me.setHp((int) Math.ceil(me.getHp()*(1.2)));
        me.setDef((int) Math.ceil(me.getDef()*(1.1)));
        me.setAtt((int) Math.ceil(me.getAtt()*(1.3)));
        me.setLevel(me.getLevel()+1);
        if(me.getLevel()>5){
            me.setName("Just some Archer");
        } else if (me.getLevel()>10) {
            me.setName("Just Better Archer");
        } else if (me.getLevel()>15) {
            me.setName("Much Better Archer");
        } else if (me.getLevel()>20) {
            me.setName("Skillfully Archer");
        } else if (me.getLevel()>25) {
            me.setName("Master Archer");
        } else if (me.getLevel()>30) {
            me.setName("Ultra Master Archer");
        } else if (me.getLevel()>40) {
            me.setName("God Archer");
        }
    }
}
