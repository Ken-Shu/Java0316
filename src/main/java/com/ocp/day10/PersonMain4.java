package com.ocp.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain4 {

    public static void main(String[] args) {
        Person[][] persons = {
            {//A
                new Person("John", 17, 170, 60.5),
                new Person("Mary", 18, 160, 50.5)
            },
            {//B
                new Person("Jo", 19, 155, 42.5),
                new Person("Helen", 16, 185, 75.5),
                new Person("Tom", 21, 190, 120.5)
            }
        };
        //請印出 所有人的 bmi 資料
        //Maht.rount (四捨五入) 取整數值
        Function<Person, Double> getBMI = p -> Math.round(p.getWeight() / Math.pow(p.getHeight() / 100, 2)) * 100.0 / 100.0;
        DoubleSummaryStatistics stmt = Stream.of(persons)
                .flatMap(s -> Stream.of(s))
                .mapToDouble(getBMI::apply) //相當於 p-> getBMI.getApply(p)
                .summaryStatistics();
        Stream.of(persons)
                .flatMap(s -> Stream.of(s))
                .mapToDouble(getBMI::apply)
                //value -> System.out.println(value)
                .forEach(s -> System.out.println(s));
        System.out.println("---------------------------------");
        //請問哪一個人的BMI 最大
        double maxBmi = Stream.of(persons)
                .flatMap(s -> Stream.of(s))
                .mapToDouble(getBMI::apply)
                .summaryStatistics().getMax();
        //.max().getAsDouble()
        Consumer<Person> printPerson = p -> {
            System.out.printf("姓名: %s %d歲 身高: %.1f 體重: %.1f BMI: %.2f\n",
                     p.getName(), p.getAge(), p.getHeight(), p.getWeight(), getBMI.apply(p));
        };
        Stream.of(persons)
                .flatMap(s -> Stream.of(s))
                .filter(p -> getBMI.apply(p) == maxBmi)
                .forEach(printPerson);
    }
}
