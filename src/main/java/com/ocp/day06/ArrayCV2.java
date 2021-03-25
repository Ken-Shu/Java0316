
package com.ocp.day06;

public class ArrayCV2 {
    public static void main(String[] args) {
        double [] nums = {10,20,30};
        System.out.printf("sum : %.1f\n",MyMath.sum(nums));
        System.out.printf("avg : %.1f\n",MyMath.avg(nums));
        System.out.printf("sd : %.1f\n",MyMath.sd(nums));
        System.out.printf("sumOfSquares : %.1f\n",MyMath.sumOfSquares(nums));
        System.out.printf("cv : %.1f\n",MyMath.cv(nums));
    }
    
}
