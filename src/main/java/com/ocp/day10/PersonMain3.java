package com.ocp.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain3 {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),
        };
        //計算bmi 的平均 最大與最小各為多少?
        Function<Person , Double> getBMI = p -> p.getWeight()/Math.pow(p.getHeight()/100, 2);
        DoubleSummaryStatistics stmt = Stream.of(persons)
                .mapToDouble(getBMI::apply) //相當於 p-> getBMI.getApply(p)
                .summaryStatistics();
        System.out.printf("平均: %.2f 最大值 : %.2f 最小值 : %.2f\n",
                stmt.getAverage(),stmt.getMax(),stmt.getMin());
    }
}
