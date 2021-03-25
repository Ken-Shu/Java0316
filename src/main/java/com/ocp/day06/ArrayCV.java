
package com.ocp.day06;

public class ArrayCV {
    public static void main(String[] args) {
        double [] numbers = {10,20,30};
        double sum = 0;
        for(double n : numbers){ //for-each
            sum+=n;
        }
        System.out.printf("sum : %.1f \n",sum);
        //求平均
        double avg = sum / numbers.length;
        System.out.printf("double : %.1f \n",avg);
        //求標準差(平方和)
        double sumOfSquares = 0; // 平方和
        for (double n : numbers) {
            sumOfSquares += Math.pow((n-avg),2);           
        }
        System.out.printf("Sum of squares: %.1f \n",sumOfSquares);
        //java Math.sqrt 開根號
        double sd = Math.sqrt((1.0/numbers.length)*sumOfSquares);
        System.out.printf("sd : %.1f\n",sd);
        //CV 變異係數
        double cv = sd/avg;
        System.out.printf("cv : %.1f \n",cv);
    }
}
