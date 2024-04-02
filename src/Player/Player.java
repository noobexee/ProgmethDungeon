package Player;

import Base.BaseUnit;

public abstract class Player extends BaseUnit {

    public Player(String name, int hp, int att, int def) {
        super(name, hp, att, def);
    }

    public String canTakeAction(BaseUnit target,int index,int cost){
        if(getActionPoint()>=cost){
            getAction().get(index).use(this,target);
            setActionPoint(getActionPoint()-cost);
            return getAction().get(index).getName();
        }else{
            return  "Not enough action point";
        }
    }

    public String canUseSkill(BaseUnit target,int index,int cost){
        if(getSkillPoint()>=cost){
            getSkill().get(index).use(this,target);
            setSkillPoint(getSkillPoint()-cost);
            return "Used "+ getSkill().get(index).getName();
        }else{
            return  "Not enough skill point";
        }
    }

}
