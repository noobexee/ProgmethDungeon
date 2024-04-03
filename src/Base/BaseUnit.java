package Base;

import java.util.ArrayList;

public abstract class BaseUnit {
    private String name;
    private int Hp;
    private int Att;
    private int Def;
    private int Level;
    private ArrayList<BaseSkill> Skill;
    private ArrayList<BaseAction> Action;
    private int skillPoint = 3;
    private int actionPoint = 5;
    private boolean isAlive;

    public BaseUnit(String name, int hp, int att, int def) {
        this.name = name;
        Hp = hp;
        Att = att;
        Def = def;
        Level = 0;
        Skill = new ArrayList<BaseSkill>();
        Action = new ArrayList<BaseAction>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BaseSkill> getSkill() {
        return Skill;
    }

    public void setSkill(ArrayList<BaseSkill> skill) {
        Skill = skill;
    }

    public ArrayList<BaseAction> getAction() {
        return Action;
    }

    public void setAction(ArrayList<BaseAction> action) {
        Action = action;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        if(hp<=0){hp=0;this.setAlive(false);}
        if(hp>0){this.setAlive(true);}
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getSkillPoint() {
        return skillPoint;
    }

    public void setSkillPoint(int skillPoint) {
        this.skillPoint = skillPoint;
    }

    public int getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(int actionPoint) {
        this.actionPoint = actionPoint;
    }}
