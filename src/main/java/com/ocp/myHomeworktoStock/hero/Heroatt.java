
package com.ocp.myHomeworktoStock.hero;

public abstract class Heroatt implements Hero{
    private String name = "Hero";
    private int hp = 100;
    private int atk =20;

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }
    
    @Override
    public String name() {
        return name;
    }

    @Override
    public int hp() {
        return hp;
    }

    @Override
    public int atk() {
        return atk;
    }
  
}
