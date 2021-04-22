package com.ocp.day16;

public class PrimeMain {

    public static void main(String[] args) { //求質數
        //如果是質數的話
        PrimeNumber pr = (n) -> {
            boolean b = true;
            if(n == 1) return true;
           for (int i = 2; i < n; i++) {               
                   if(n % i == 0){
                       b = false;
                       break;
                   }
            } 
           return b;
        };
        System.out.println(pr.isPrime(7));
    }

}
