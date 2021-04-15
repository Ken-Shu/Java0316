package com.ocp.day12;

class Father {
    /*super() 和 this() 一定要放在建構子
     *函式的第一行
     */
    Father(){
        System.out.println("1:Father");
    }
    public Father(int x) {
        this();
        System.out.println("2:Father"+x);
    }
}

class Son extends Father {
    Son() {
        //如果父類別有參數 則下方 super 則需要自行撰寫
        this(100);
        System.out.println("3:Son");
    }
     Son(int x ) {
        super(x);
        System.out.println("4:Son"+x);
    }
}
public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        
    }
}
