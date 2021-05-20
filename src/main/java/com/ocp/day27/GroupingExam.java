package com.ocp.day27;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingExam {

    public static void main(String[] args) {
        List<Exam> exams = Arrays.asList(
                new Exam("John", 100),
                new Exam("Mary", 50),
                new Exam("Helen", 70),
                new Exam("Tom", 80),
                new Exam("Bob", 30)
        );
        //請問及格 / 不及格人數分組
        Map<String, Set<String>> result
                = exams.stream().collect(Collectors
                        .groupingBy(e -> e.getScore() >= 60 ? "及格" : "不及格",
                                Collectors.mapping(Exam::getName, Collectors.toSet())));
        System.out.println("result" + result);

        //如何把{不及格=[Bob, Mary], 及格=[Tom, John, Helen]}
        //放入 finalMap 並印出 finalMap
        Map<String, Set<String>> finalMap = exams.stream().collect(Collectors
                .groupingBy(e -> e.getScore() >= 60 ? "及格" : "不及格",
                        Collectors.mapping(Exam::getName, Collectors.toSet())));
        System.out.println(finalMap);
    }

}
