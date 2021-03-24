
package com.ocp.myHomeworktoStock;

public class Test3_12 {
    public static void main(String[] args) {
        int [] data = {2010,2013,2014,2015,2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if(e != key){
                continue;
                //因為上方已經continue了 所以count++沒意義
                //count++;
            }
        }
        System.out.println(count);
    }
    
}
