
package com.ocp.day01;

public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account();
        Account a02 = new Account();
        Account a03 = new Account();
        a01.setBallance(1000);
        a02.setBallance(2000);
        a03.setBallance(3000);
        System.out.printf("a01 帳戶餘額: %,d\n",a01.getBallance());
        System.out.printf("a02 帳戶餘額: %,d\n",a02.getBallance());
        System.out.printf("a03 帳戶餘額: %,d\n",a03.getBallance());
        //存款
        System.out.println("存款後...");
        a01.depostit(500);
        System.out.printf("a01 帳戶餘額: %,d\n",a01.getBallance());
        //提款
        System.out.println("a02 提款 800 元後....");
        a02.withdraw(800);
        System.out.printf("a02 帳戶餘額: %,d\n",a02.getBallance());
        //存款
        System.out.println("a03 存款 -1200 元後....");
        a03.depostit(-1200);
        System.out.printf("a03 帳戶餘額: %,d\n",a03.getBallance());
        //提款
        System.out.println("a03 存款 -1200 元後....");
        a03.depostit(-1200);
        System.out.printf("a03 帳戶餘額: %,d\n",a03.getBallance());
        //提款
        System.out.println("a03 存款 5000 元後....");
        a03.withdraw(5000);
        System.out.printf("a03 帳戶餘額: %,d\n",a03.getBallance());
        
    }
    
}
