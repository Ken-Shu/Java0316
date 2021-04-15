package com.ocp.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        //cat.hunter(); 因為 cat 裡面沒有 hunter()
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        //用貓的眼光看老虎 這樣不會有 hunter
        Cat cat2 = new Tiger();
        cat2.shout();
    }
    
}
