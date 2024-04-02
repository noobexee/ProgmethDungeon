package Base;

public abstract class BaseItem {
    private String name;
    private int Hp = 0;
    private int Att = 0;
    private int Def = 0;
    private int Level = 0;
    private BaseSkill[] Skill;

    public BaseItem(String name) {
        this.name = name;
        Skill = new BaseSkill[0];
    }

    public void use(BaseUnit target) {
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        if(hp<0){hp=0;}
        Hp = hp;
    }

    public int getAtt() {
        return Att;
    }

    public void setAtt(int att) {
        if(att<0){att=0;}
        Att = att;
    }


    public int getDef() {
        return Def;
    }

    public void setDef(int def) {
        Def = def;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public BaseSkill[] getSkill() {
        return Skill;
    }

    public void setSkill(BaseSkill[] skill) {
        Skill = skill;
    }


}
