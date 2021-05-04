
package com.ocp.day19;

//外部類別
public class Outer {
    int x = 100;
    static int y = 100;
    //一般內部類別
class Inner{
    void print(){
        System.out.println(Outer.this.x + Outer.y);
        System.out.println(Sinner.z);
    }
}    
//靜態內部類別
static class Sinner{
    static int z = 1000;
     static void print(){
         //(不可呼叫) System.out.println(Outer.this.x);
         System.out.println(Outer.y);
         System.out.println(Sinner.z);
         System.out.println(z);
     }
}
}
