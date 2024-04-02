package LevelUp;

import Base.BaseUnit;

public interface LevelWarrior {

    default void LevelUp(BaseUnit me){
        me.setHp((int) Math.ceil(me.getHp()*(1.2)));
        me.setDef((int) Math.ceil(me.getDef()*(1.2)));
        me.setAtt((int) Math.ceil(me.getAtt()*(1.2)));
        me.setLevel(me.getLevel()+1);
        if(me.getLevel()>5){
           me.setName("Just some Warrior");
        } else if (me.getLevel()>10) {
            me.setName("Just Better Warrior");
        } else if (me.getLevel()>15) {
            me.setName("Much Better Warrior");
        } else if (me.getLevel()>20) {
            me.setName("Skillfully Warrior");
        } else if (me.getLevel()>25) {
            me.setName("Master Warrior");
        } else if (me.getLevel()>30) {
            me.setName("Ultra Master Warrior");
        } else if (me.getLevel()>40) {
            me.setName("God Warrior");
        }
    }
}
