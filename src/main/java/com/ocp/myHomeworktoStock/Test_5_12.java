package com.ocp.myHomeworktoStock;

public class Test_5_12 {

    private boolean flag =true;

    public void displaySeries() {
        int num = 2;
        while (flag) {
            if (num % 7 == 0) {
                flag = false;
            }else
            {
                System.out.println(num);
                num += 2;
            }
        }
    }

    public static void main(String[] args) {
       new Test_5_12().displaySeries();
    }
}
