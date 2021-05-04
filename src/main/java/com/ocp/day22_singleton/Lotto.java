package com.ocp.day22_singleton;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

    private String value;
    //自己new 自己
    //讓所有人公用一個 static 物件
    //不用重複new
    private static Lotto Lottointstance = new Lotto();
    //自己創立一個 public 讓人可以取用
    //Use a static reference to point to the single instance
    public static Lotto getLotto(){
        return Lottointstance;
    }
    //Make the constructor private
    private Lotto() {
        Random r = new Random();

        int[] values = {r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,};
        value = Arrays.toString(values);
    }

    public String getValues() {
        return value;
    }
}
