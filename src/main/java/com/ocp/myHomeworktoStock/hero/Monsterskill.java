
package com.ocp.myHomeworktoStock.hero;

public class Monsterskill extends Monsteratt{

    @Override
    public int skill(int i) {
        switch(i){
            case 1:
                System.out.println("噴火攻擊");
                setAtk(30);
                break;
            case 2:
                System.out.println("爪擊");
                setAtk(10);
                break;
        }
       return getAtk();
    }
    
}
