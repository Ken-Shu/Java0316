
package com.ocp.myHomeworktoStock;

public class Test_6_20 {
int j ;
int k;
    public static void main(String[] args) {
        new Test_6_20().doStuff();
    }
    void doStuff(){
        int x = 5;
        doStuff2();
        System.out.println("x");
    }
    void doStuff2(){
        int y = 7;
        System.out.println("y");
        for (int z = 0; z < 5; z++) {
            System.out.println("z");
            System.out.println("y");
        }
    }
}
