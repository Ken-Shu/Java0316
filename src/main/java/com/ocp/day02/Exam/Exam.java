package com.ocp.day02.Exam;

public class Exam {

    public String name;
    public int chinese;
    public int math;

    public Exam() {
    }

    
    
    public Exam(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public int getSum() {
//    int sum = chinese+math;
//    return sum;
        return chinese + math;
    }

    public double getAvg() {
//    double avg = getSum()/2.0;
//    return avg;
        return getSum() / 2.0;
    }

    public String getPrintData() {
//    int sum = getSum();
//    double avg = getAvg();
//    String print = "姓名:" +name+ " 國文:" +chinese+ " 數學:" +math+ " 總分:" +sum +" 平均:"+avg;
//    System.out.println(print);
//    return print;
        //String.format 直接回傳字串原始資料
        return String.format("姓名 :%s 國文 :%d 數學 :%d 總分 :%d 平均 :%.1f", name, chinese, math, getSum(), getAvg());
    }
}
