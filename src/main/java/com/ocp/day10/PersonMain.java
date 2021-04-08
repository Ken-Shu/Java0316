package com.ocp.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),};
        //請印出未成年的人名
        Stream.of(persons)
                .filter(s -> s.getAge() < 18)
                .forEach(p -> System.out.println(p.getName()));
        
        System.out.println("---------------------------------");
        
        //請印出BMI合格的人名(18<bmi<=23) part1
        //filter內也可以寫入計算式
        Stream.of(persons)
                .filter(
                p -> {
                    //double bmi2 = bmi(p.getWeight(), p.getHeight());
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi <= 23) {
                        return true;
                    }
                    return false;
                }).forEach(p -> System.out.println(p.getName()));
        
        System.out.println("---------------------------------------");
        //請印出BMI合格的人名(18<bmi<=23) part2
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i].getWeight() / Math.pow(persons[i].getHeight() / 100, 2);
            if (bmi > 18 && bmi <= 23) {
                System.out.println(persons[i].getName());
            }
        }
        //請印出BMI合格的人名(18<bmi<=23)part3
        //BMI合格證的過濾邏輯
        Predicate<Person> normalbmi = p -> {
                    //double bmi2 = bmi(p.getWeight(), p.getHeight());
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi<= 23) {
                        return true;
                    }
                    return false;
                };
        Predicate<Person> thinBmi =p -> {
                    //double bmi2 = bmi(p.getWeight(), p.getHeight());
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi <= 18 ) {
                        return true;
                    }
                    return false;
                };
        Predicate<Person> fatBmi =p -> {
                    //double bmi2 = bmi(p.getWeight(), p.getHeight());
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 23) {
                        return true;
                    }
                    return false;
                };
        Stream.of(persons)
                .filter(normalbmi)
                .forEach(p ->System.out.println(p));
    }
    
//    public static double bmi(double height,double weight){
//            double bmi = weight/Math.pow(weight/100, 2);
//            return bmi;
//        }
}
