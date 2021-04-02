
package com.ocp.myHomeworktoStock.hero;

public abstract class Monsteratt implements Moster{
    private String name = "龍";
    private int hp = 70;
    private int atk = 15;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
    @Override
    public String name() {
        return name;
    }

    @Override
    public int atk() {
        return atk;
    }

    @Override
    public int hp() {
        return hp;
    }
    
}
