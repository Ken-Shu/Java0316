package com.ocp.day06;

public class MyMath {
    //求總數
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double n : numbers) { //for-each
            sum += n;
        }
        return sum;
    }
    //求平均
    public static double avg(double[] numbers) {
        double avg = sum(numbers) / numbers.length;
        return avg;
    }
    //平方和
    public static double sumOfSquares(double[] numbers) {
        double sumOfSquares = 0; // 平方和
        for (double n : numbers) {
            sumOfSquares += Math.pow((n - avg(numbers)), 2);
        }
        return sumOfSquares;
    }
    //求標準差
    public static double sd(double[] numbers) {
        double sd = Math.sqrt((1.0 / numbers.length) * sumOfSquares(numbers));
        return sd;
    }
    //求變異係數
    public static double cv (double [] numbers){
        double cv = sd(numbers)/avg(numbers);
        return cv;
    }
    //最大值
    public static double max (double [] numbers){
        //取得Double的最小值
        double max = Double.MIN_VALUE;
        for(double num : numbers){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    //最小值
    public static double min(double [] numbers){
        //取的Double的最大值
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if(num < min ){
                min=num;
            }
        }
        return min;
    }
}
