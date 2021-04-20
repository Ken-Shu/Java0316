
package com.ocp.day15;

public class Truck extends Car implements Oil{

    @Override
    public int spend() {
       return 100;
    }

    @Override
    void move() {
        System.out.println("用輪胎走");
    }
    
}
