
package com.ocp.day25;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //Shift+F1 可以查看 API
        //也可以在 Vector 後方的 ()內 加入數字給預設空間
        //也可以使用(x , y) x = 預設數字 y = 每次增加的數量
        Vector<Integer> v = new Vector<>();
        int n = 10;
        for (int i = 0; i <= n; i++) {
            v.add(i);
        }
        v.add(10);
        v.add(20);
        //capacity 查看容積空間 原長度*2 假設:原值=10 
        //若給值為11
        //則容積空間會變成20
        System.out.printf("capacity(容積空間): %d \n",v.capacity());
        System.out.printf("size(已使用) : %d \n ",v.size());
        System.out.printf("殘餘空間: %d\n",v.capacity()-v.size());
    }
}
