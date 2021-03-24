
package com.ocp.myHomeworktoStock;

public class doWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 3; j > 0; j--) {
                if(i == j){
                    ++count;
                    break;
                }
            }
            System.out.println(count);
            continue;
        }
    }
    
}
