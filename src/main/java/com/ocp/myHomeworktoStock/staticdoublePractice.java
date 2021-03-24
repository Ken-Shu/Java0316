
package com.ocp.myHomeworktoStock;

public class staticdoublePractice {
    static double area;
    int b= 2 , h = 3;
    public static void main(String[] args) {
        double p,b,h;
        if(area == 0){
            b=3;
            h=4;
            p=0.5;
            area = p*b*h;
        }
       //java 若要執行運算 則必須給物件一個值
       //上方因為值寫在if內 所以僅有if內的物件才有數值
       //area = p*b*h;
    }
}
