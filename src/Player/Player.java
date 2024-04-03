package Player;

import Base.BaseUnit;
import LevelUp.LevelWarrior;

public abstract class Player extends BaseUnit {

    public Player(String name, int hp, int att, int def) {
        super(name, hp, att, def);
    }

    public abstract String canTakeAction(BaseUnit target,int index,int cost);
    public abstract String canUseSkill(BaseUnit target,int index,int cost);
    public abstract void LevelupCon(boolean c);
}
