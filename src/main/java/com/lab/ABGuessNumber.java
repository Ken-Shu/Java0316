
package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class ABGuessNumber {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);        
        Util util = new Util();        
        int [] ansArray = Util.getAnsArray();
        System.out.println(Arrays.toString(ansArray));
        do {            
            System.out.print("請輸入一組不重複的四位數字: ");
            String guess = sc.next();
           
            int [] guessArray = {guess.charAt(0)-48,guess.charAt(1)-48,guess.charAt(2)-48,guess.charAt(3)-48};
          
            //判斷 a , b
            int a = 0;
            int b = 0;
            for(int i = 0 ; i < 4 ; i++){
             if(ansArray[i] == guessArray[i]){
                 a++;
             }   
            }
            for(int i = 0 ; i < 4 ; i ++){
                for (int j = 0; j < 4; j++) {
                    if(ansArray[i] == guessArray[j]){
                        b++;
                        break;
                    }
                }
            }
            b -= a;
            System.out.printf("%d A %d B \n",a,b);
            if(a== 4){
                System.out.println("Bingo");
                break;
            }
        } while (true);      
    }  
}
