package com.lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ABGuessNumber2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] number = new int[4];

        for (int i = 0; i < number.length;) {
            int n = r.nextInt(9) + 1;
            boolean boo = b(number, n);
            if (!boo) {
                number[i] = n;
                i++;
            }
        }
        System.out.println(Arrays.toString(number));

        aorb(number);
    }

    public static boolean b(int[] na, int n) {
        boolean b = true;
        for (int i = 0; i < na.length; i++) {
            if (na[i] == n) {
                return b;
            }
        }
        b = false;
        return b;
    }

    public static void aorb(int[] na) {

        do {
            System.out.print("請輸入不重複的四位數字 : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int zero = n / 1000;
            int one = (n % 1000) / 100;
            int two = (n % 1000 % 100) / 10;
            int three = (n % 1000 % 100 % 10);
            int[] scn = {zero, one, two, three};
            int a = 0;
            int b = 0;
            String nstring = Integer.toString(n);
           
                 //輸入多餘4位數字 或少餘
            if (n>9999 || n<100) {
                System.out.println("輸入錯誤 請重新輸入不重複四位數字");
                continue;
                }
            
            try {
                for (int i = 0; i < scn.length; i++) { //驗算是否有輸入重複數字              
                    for (int j = 0; j < scn.length; j++) {
                        if (i == j) {
                            continue;
                        } else if (scn[i] == scn[j]) {
                            System.out.println("輸入重複數字");
                            main(null);
                        }
                    }
                }
            } catch (Exception e) {
            }

            for (int i = 0; i < na.length; i++) {
                if (na[i] == scn[i]) {
                    a++;
                }
            }
            for (int i = 0; i < na.length; i++) {
                for (int j = 0; j < na.length; j++) {
                    if (na[i] == scn[j]) {
                        b++;
                        break;
                    }
                }
            }
            b -= a;
            System.out.printf("%d A %d B \n", a, b);
            if (a == 4) {
                System.out.println("Bingo");
                break;
            }
        } while (true);
    }
}
