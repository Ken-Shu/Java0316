
package com.ocp.day14;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        Employee e1 = new PG();
        e1.setSalary(50000);
        Employee e2 = new PG(70000);
        Employee e3 = new Art(28000);
        Employee e4 = new Art();
        e4.setSalary(60000);
        // 印出每一個人的工作
        Employee[] employees = {e1, e2, e3, e4};
        Stream.of(employees).forEach(e -> e.job());
        // 請求出總薪資與平均薪資
        int sum = Stream.of(employees).mapToInt(e->e.getSalary()).sum();
        double avg = sum/employees.length;
        System.out.printf("總薪資 : %d  總平均 : %.1f \n",sum,avg);
        IntSummaryStatistics stat = Stream.of(employees)
                .mapToInt(Employee::getSalary)
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}