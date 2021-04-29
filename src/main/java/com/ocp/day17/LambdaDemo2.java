package com.ocp.day17;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LambdaDemo2 {

    public static void main(String[] args) {
        DoubleSummaryStatistics stat = Stream.of("國文", 100.0, "英文", 90.0, "數學", 70.5, "座號", 7)
                .filter(t -> {
                    //instanceof 判斷物件是否為 Double
                    if (t instanceof Double) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .mapToDouble(x -> (double) x)
                // 物件Double轉成基本資料型別double 才能變成 DoubleStream
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }

}
