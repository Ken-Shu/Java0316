
package com.ocp.day34;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

//歸納法

public class ReduceDemo {
    public static void main(String[] args) {
        long [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        //reduce 0 代表初始值
        //第一次時 total 是0   n 是 1
        /*
        (total , n) -> (0,1) ->1
        (total , n) -> (1,2) ->3
        (total , n) -> (3,3) ->6
        (total , n) -> (6,4) ->10
        (total , n) -> (10,5) ->15
        */
      long result = LongStream.of(numbers)
              .parallel() //多核平行運算
              .reduce(0, (total , n) -> total+n);
    }
    
}
