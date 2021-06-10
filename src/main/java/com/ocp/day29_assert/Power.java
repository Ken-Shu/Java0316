
package com.ocp.day29_assert;

//電力換算
//W(瓦數) W = V*A
//V(電壓)
//A(電流)
public class Power {
    public int V;
    public int W;
    public int A;
    //取得W 方法 getW(int V , int A)
    public int getW(int V , int A){
        W = V*A;
        return W;
    }
    //取得A 方法 getA(int V , int W)
    public int getA(int V , int W){
        A = W/V;
        return A;
    }
    //取得V 方法 getV(int W , int A)
    public int getV(int W , int A){
        V = W/A;
        return V;
    }
            
}
