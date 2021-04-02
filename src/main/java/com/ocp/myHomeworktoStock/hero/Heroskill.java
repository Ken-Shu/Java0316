
package com.ocp.myHomeworktoStock.hero;

public class Heroskill extends Heroatt{
    
    
    
    @Override
    public int skill(int i) {
              
        switch(i){
            case 1:
                System.out.println("水球攻擊");
                setAtk(50);
                break;
            case 2:
                System.out.println("衝撞攻擊");
                setAtk(40);
                break;
        }
        return atk();
    }
    
}
