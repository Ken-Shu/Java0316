
package com.ocp.day02.BMI;

//設計 計算BMI 應該要有的資源與方法
public class BMI {
    String name;
    double height; //身高
    double weight; //體重

    public BMI() {
    }

    
    
    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    
    //取的計算後的bmi 值
    public double getBMIValue(){ 
        double bmiValue = weight/Math.pow(height/100, 2);
        return bmiValue; //回傳 bmiValue (要回傳與方法一樣的型別 也就是double 值)
    }
    
    //取的 BMI 的分析結果
    public double getBMIValue(String n, double h, double w){
        this.name = n;
        this.height=h;
        this.weight=w;
        double bmi = weight/Math.pow(height/100, 2);
        return bmi;
    }
    public String getresultValue(){
        double bmiValue = getBMIValue(); //直接取得 bmi 的計算結果
        String result1Value = (bmiValue > 23)?"過重":(bmiValue<18)?"過輕":"正常";
        return  result1Value;
    }
    
    //列印資料
    public void print(){
        double bmiValue = getBMIValue();
        String resultValue = getresultValue();
     System.out.printf("姓名 :%s 身高 :%.1f 體重 :%.1f BMI : %.2f 結果: %s\n"
             ,name,height,weight,bmiValue,resultValue);   
    }
}
