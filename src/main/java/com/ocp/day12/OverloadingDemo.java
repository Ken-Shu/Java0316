
package com.ocp.day12;

//超載 OR 負載
public class OverloadingDemo {
    //優先判斷 型別(若是整數 就先判斷整數型別) 
    // ->位元 ->位元由大的優先
    public void calc (short x ){
        System.out.println("short : "+x);
    }
    public void calc (int x ){
        System.out.println("int : "+x);
    }
    public void calc (Integer x ){
        System.out.println("Integer : "+x);
    }
    public void calc (float x ){
        System.out.println("float : "+x);
    }
    public void calc (double x ){
        System.out.println("double : "+x);
    }
    public static void main(String[] args) {
        OverloadingDemo o = new OverloadingDemo();
        o.calc(100);
        o.calc(100.0);
        o.calc(100f);
        o.calc(Integer.valueOf(100));
    }
}
