package Base;

import state.UseCondition;

public abstract class BaseAction {

    private String name;

    private int actionCost;

    public BaseAction(String name, int cost) {
        this.name = name;
        this.actionCost = cost;
    }

    public abstract UseCondition use(BaseUnit me, BaseUnit target);

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return actionCost;
    }

    public void setCost(int cost) {
        this.actionCost = cost;
    }
}
