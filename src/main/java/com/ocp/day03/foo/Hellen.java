
package com.ocp.day03.foo;

import com.ocp.day03.bar.John;

public class Hellen extends John{
    //使用繼承 Hellen 就可以直接取得
    //Johe的 public 和 protected 物件
    //extends 就等於已經 new 了 John的物件
    //所以不用另外寫
    public void print(){
        System.out.print("Hellen : ");
        System.out.print(a + " , ");
        System.out.print(b + " \n ");
    }
}
