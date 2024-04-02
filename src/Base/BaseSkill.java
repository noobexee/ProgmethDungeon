package Base;

public abstract class BaseSkill {
    private String name;

    private int skillCost;

    public BaseSkill(String name, int cost) {
        this.name = name;
        this.skillCost = cost;
    }

    public abstract void use(BaseUnit me, BaseUnit target);

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return skillCost;
    }

    public void setCost(int cost) {
        this.skillCost = cost;
    }
}

