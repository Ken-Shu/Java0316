package com.ocp.day01;

public class Account {

private int ballance;

    //查詢帳戶餘額的方法
    public int getBallance() {
        return ballance; //方法停止 並回傳 ballance
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    
    void withdraw(int money) {  //提款
        if (money <= 0 ) {
            System.out.println("存款金額不符");
            return; //存款方法到此結束
        } if(money > ballance){
            System.out.println("帳戶餘額不足");
            return;
        }
            this.ballance -= money;  
    }    

    void depostit(int money) {  //存款
        //驗證 money 是否符合存款的條件
        if (money <= 0) {
            System.out.println("存款金額不符");
            return; //存款方法到此結束
        } else {
            this.ballance += money;
        }
    }
}
