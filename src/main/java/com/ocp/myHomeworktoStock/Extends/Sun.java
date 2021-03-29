
package com.ocp.myHomeworktoStock.Extends;

public class Sun extends ExtendsFather{
    public static void main(String[] args) {
        ExtendsFather ef = new Sun();
        Sun sun = (Sun)ef;
        System.out.println("ef.x"+ef.x);
        System.out.println("ef.father"+ef.father);
        ef.x = 50;
        ef.father = "Sun";
        ExtendsFather father = new Sun();
        System.out.println(ef.x);
        System.out.println(ef.father);
        System.out.println(father.x);
        System.out.println(father.father);    
    }
}
