
package com.ocp.myHomeworktoStock.StocktoBufferReader;

public class Demo {
//正則表示練習
public static void main(String[] args) {
        String str = "192.168.1.1";
        for (String s : str.split("\\.")) {
            System.out.println(s);
    }
        String str2 = "小學,國中,高中,大學,博士";
        for (String s2 : str2.split("\\,")) {
            System.out.print(s2);
    }
    }
    
}
