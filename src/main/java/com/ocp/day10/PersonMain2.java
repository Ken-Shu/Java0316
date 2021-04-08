package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),
        };
        /*建立 BMI 的資料計算邏輯 ,使用fumction
         *java function API
         *https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
         *T 代表傳入參數(argument) 在這指的就是Person 物件 也就是 P
         *R 代表 回傳資料型別 在這邊指的就是 BMI 的計算結果Double
        */
        //丟進去Person值 回傳Double值
        Function<Person ,Double> getBMI = p -> p.getWeight()/Math.pow(p.getHeight()/100, 2);
        //正常 bmi 的過濾器 Predicate<Person>
        //可以看Function API 內的 apply 就是
        //取的 getBMI.apple(p) 的計算結果
        Predicate<Person> normalBmi = p-> getBMI.apply(p)>18 && getBMI.apply(p)<=23;
        //印出人名
        Consumer<Person> printName = p -> System.out.println(p.getName());
        //印出正常bmi 的人名
        Stream.of(persons).filter(normalBmi).forEach(printName);
    }
}
