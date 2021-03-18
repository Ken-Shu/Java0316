
package com.ocp.day02.Student;

import com.ocp.day02.Exam.Exam;

public class StudentCase {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 60 , 100 , 80);
        s1.print();
        s1.exam = new Exam(s1.name, 100, 90);
        s1.print();
        
        //請單獨印出BMIValue 資料
        System.out.println(s1.bmi.getBMIValue());
        //單除印出 平均分數資料
        System.out.println(s1.exam.getAvg());
        //修改數學分數 = 75分
        s1.exam.math=75;
        s1.print();
    }
}
