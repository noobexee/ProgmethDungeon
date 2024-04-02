package Player;

import Base.BaseItem;
import Base.BaseUnit;

public abstract class Player extends BaseUnit {

    private int skillPoint = 3;

    private int actionPoint = 3;

    private BaseItem[] Backpack;
    public Player(String name, int hp, int att, int def) {
        super(name, hp, att, def);
    }

    //action
    public void Attack(BaseUnit target){
        int dmg = getAtt() - target.getDef();
        target.setHp(target.getHp()-dmg);
    }

    public String canUseSkill(BaseUnit target,int index,int cost){
        if(skillPoint>=cost){
            getSkill().get(index).use(this,target);
            setSkillPoint(getSkillPoint()-cost);
            return "Used "+ getSkill().get(index).getName();
        }else{
            return  "Not enough skill point";
        }
    }

    public void useItem(BaseUnit target, int index){
        getBackpack()[index].use(target);
    }

    //getter setter

    public BaseItem[] getBackpack() {
        return Backpack;
    }

    public void setBackpack(BaseItem[] backpack) {
        Backpack = backpack;
    }

    public int getSkillPoint() {
        return skillPoint;
    }

    public void setSkillPoint(int skillPoint) {
        this.skillPoint = skillPoint;
    }
}
