package com.ocp.day30_thread;

import java.util.Random;

class Account { // 銀行帳戶

    private int balance; //帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    // 在提款方法前面加上 synchronized
    // 讓這個方法 一次只能進入一個執行緒
    public synchronized void withdraw(int cash)throws Exception{
        String name = Thread.currentThread().getName();
        System.out.printf("%s 準備提款...\n", name);
        //取得帳戶餘額
        int currentBalance = balance;
        if(currentBalance>= cash){ // 是否餘額足夠
            //開始提款
            Thread.sleep(new Random().nextInt(100)); //模擬提款花費時間
            //提款成功
            //回寫帳戶餘額
            balance = balance - cash;
            //印出交易單
            System.out.printf("%s 提款:$%d 成功 帳戶餘額 %d\n",name,cash,balance);
        }else{
            System.out.println("餘額不足");
        }
    }
}
class WithDraw implements Runnable{  // 提款執行緒
private Account account; //帳號
private int cash; //提款金額

    public WithDraw(Account account, int cash) {
        this.account = account;
        this.cash = cash;
    }
    @Override
    public void run() {
        try {
            account.withdraw(cash); //進行提款作業
        } catch (Exception e) {
        }
    }  
}

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new WithDraw(account, 5000),"小明");
        Thread t2 = new Thread(new WithDraw(account, 3000),"小華");
        Thread t3 = new Thread(new WithDraw(account, 4000),"小英");
        
        t1.start();
        
        t2.start();
        t3.start();
    }
}
