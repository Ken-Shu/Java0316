
package com.ocp.day34;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class sumTask extends RecursiveTask<Long>{
    private static final int THRESHOLD = 3 ; //門檻值
private long [] nulbers ; //數列
private int from; // 第一個數字
private int to; //尾數 不包含

    public sumTask(long[] nulbers, int from, int to) {
        this.nulbers = nulbers;
        this.from = from;
        this.to = to;
    }
    @Override
    protected Long compute() {
        if(to-from <= THRESHOLD){ // 小於等於門檻值進行計算
            long total = 0;
            for (int i = from; i < to; i++) {
                total += nulbers[i];
            }
            System.out.printf("from : %d  to : %d total : %d -> %s\n"
                    ,from,to , total ,Thread.currentThread().getName());
            return total;
        }else { //大於門檻值拆分
            //將任務 一分為二
            int middle = (from+to)/2;
            System.out.printf("左邊 from : %d to : %d \n",from,middle);
            System.out.printf("右邊 from : %d to : %d \n",middle,to);
            sumTask left = new sumTask(nulbers, from, middle);
            sumTask right = new sumTask(nulbers, middle, to);
            //fork 拆分
            left.fork();
            right.fork();
            
            return left.join()+right.join();
        }
    }
    
}

public class ForkJoinSum {
    public static void main(String[] args) {
        long [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        //可以在後面寫入想使用的核心數
        ForkJoinPool pool = new ForkJoinPool(4);
        int from = 0 , to = numbers.length;
        long result = pool.invoke(new sumTask(numbers,from,to));
        System.out.println("result"+result);
        
    }
    
}
