package com.ocp.myHomeworktoStock.hero;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Heroatt hero = new Heroskill();
        Monsteratt monster = new Monsterskill();
        boolean life = true;
        Scanner sc = new Scanner(System.in);
        int hero_atk = hero.getAtk();
            int hero_hp = hero.getHp();
            int monster_atk = monster.getAtk();
            int monster_hp = monster.getHp();
        loop:
        System.out.println("遭遇戰鬥: ");
        System.out.printf("英雄姓名:%s 攻擊:%d 血量:%d\n", hero.getName(), hero.getAtk(), hero.getHp());
        System.out.printf("怪物姓名:%s 攻擊:%d 血量:%d\n", monster.getName(), monster.getAtk(), monster.getHp());
        do {
            
            System.out.println("--------------------------------");
            System.out.println("英雄發動攻擊 1:普通攻擊 2:技能");
            int heroatk = sc.nextInt();
            switch (heroatk) {
                case 1:
                    System.out.println("英雄使用普通攻擊");
                    monster_hp = monster_hp - hero_atk;
                    System.out.printf("怪物剩餘血量: %d\n", monster_hp);
                    break;
                case 2:
                    System.out.println("選擇使用技能 1:水球攻擊 2:衝撞攻擊");
                    int selectSkill = sc.nextInt();
                    hero.skill(selectSkill);
                    monster_hp -= hero_atk;
                    System.out.printf("怪物剩餘血量: %d\n", monster_hp); 
                    break;
            }
            System.out.println("怪物發動攻擊 1:普通攻擊 2:技能");
            Random r =new Random();
            int monsterselect = r.nextInt(2)+1;
            switch(monsterselect){
                case 1:
                    System.out.println("怪物使用普通攻擊");
                    hero_hp -= monster_atk;
                    System.out.printf("英雄剩餘血量: %d\n", hero_hp);
                    break;
                case 2:          
                    System.out.print("怪物使用技能");
                    int mskill = r.nextInt(2)+1;
                    monster.skill(mskill);
                    hero_hp -= monster_atk;
                    System.out.printf("英雄剩餘血量: %d\n", hero_hp); 
                    break;
            }
            if(hero_hp<=0 ){
                life =false;
                System.out.println("死亡");
            }
            if(monster_hp<=0){
                life = false;
                System.out.println("戰鬥勝利");
            }
        } while (life );
    }

}
