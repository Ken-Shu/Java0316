
package com.ocp.day29_assert;

public class AssertDemo {
    public static void main(String[] args) {
        //要在主檔案裏面 Properties/Run 裡面 下方欄位要上 -ea 
        //執行時使用上方綠色Run鍵 才能吃到 assert 的判斷
        int score = 110;
        //1.設定 Main Calss
        //2.加上 -ea
        //3.找出問題後 要把 assert拔除
        //assert (score>=0 && score<=100):"分數錯誤" + score;
        if(score >=00 && score<=100){
            System.out.println(score>=60?"Pass":"Fali");
        }else {System.out.println("分數錯誤");}
    }
    
}
