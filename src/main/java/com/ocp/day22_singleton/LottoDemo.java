
package com.ocp.day22_singleton;

public class LottoDemo {
    public static void main(String[] args) {
        Lotto a =  Lotto.getLotto();
        System.out.println("小明回報今日四星彩開獎:"+a.getValues());
        Lotto b =  Lotto.getLotto();
        System.out.println("小華回報今日四星彩開獎:"+a.getValues());
        Lotto c =  Lotto.getLotto();
        System.out.println("小英回報今日四星彩開獎:"+a.getValues());
    }
   
}
