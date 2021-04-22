
package com.ocp.day16;

public class SevenEleven {
    //結帳方法
    //如果方法內有(區域變數) 則在JAVA8之後 
    //會自動在變數前方加上 final
    //final class 不能有子類別(不能被繼承)
    //final method 不能有覆寫方法
    public void submit(int price){
        /*(final)*/ String name = "違例炸醬麵";
        //交易類別
        class Transaction{
            //交易資料
            void print (){
                System.out.printf("%s 交易金額 : %d \n",name,price);
            }
        }
        Transaction t = new Transaction();
        t.print();
    }
    public static void main(String[] args) {
        SevenEleven se = new SevenEleven();
        se.submit(100);
    }
}
