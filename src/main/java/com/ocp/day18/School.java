package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;

public class School {

    public static void main(String[] args) {
//        Arrays.stream(DataCenter.getPeople())
//                .forEach(System.out::println);
        //請問考試的總分與平均 = ?
        IntSummaryStatistics stat = Arrays.stream(DataCenter.getPeople())
                //.peek(x -> System.out.println(x.getClass()))
                .filter(x -> x instanceof Student)
                //.map(x -> (Student)x) 強轉成 Student 陣列
                //原本得到是 Pelple 陣列 所以要轉成 Studet 才能 getScore
                .mapToInt(x -> ((Student) x).getScore())//轉型Student
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        //請問老師薪資的總和 跟平均 ?
        IntSummaryStatistics stat2 = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher)x)
                .mapToInt(x -> x.getSalary())
                .summaryStatistics();
        System.out.println(stat2.getSum());
        System.out.println(stat2.getAverage());
        System.out.println("---------------------------------");
        //印出不及格的學生姓名 分數 跟 老師姓名 以及不及格的總平均
        Consumer<Student> p =  x ->System.out.printf("學生: %s , 分數: %d , 老師 : %s \n",x.getName(),x.getScore(),x.getTeacher().getName());
        double avg = Arrays.stream(DataCenter.getPeople())
                .peek(x -> x.getClass())
                .filter(x -> x instanceof Student)
                .map(x -> (Student)x)
                .filter(x -> ((Student)x).getScore()<60)
                //peek 是插入程式 可是在裡面寫入你要的東西
                //peek 要寫在 maptoInt 後面
                .peek(p)
                .mapToInt(Student::getScore)
                .average().getAsDouble();
                System.out.println("學生平均"+avg);
//                .map(x -> (Student)x)
//                .mapToInt(x -> x.getScore())
//                .filter(x -> x <60)
//                .summaryStatistics()
   }
}