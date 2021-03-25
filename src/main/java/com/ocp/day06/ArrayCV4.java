
package com.ocp.day06;
/*某公司有18位員工，
其中10位在去年投資股票，一年的獲利率如下(單位：%)：
7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外8位員工投資買公債一年內獲利率如下(單位：%)
6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數
以及哪一種投資的獲利較穩健 ?
求出股票投資最大獲利與最低獲利的獲利率
*/
public class ArrayCV4 {
    public static void main(String[] args) {
        double [] stock = {7.6, 3.9 ,15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double [] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double stock_cv = 100*(MyMath.cv(stock));
        double bonds_cv = 100*(MyMath.cv(bonds));
        String result = (stock_cv>bonds_cv)? "公債比較賺錢":"股票比較賺錢";
        System.out.printf("stock_cv : %.1f%% , bonds_cv : %.1f%% 結果:%s\n",stock_cv,bonds_cv,result);
        System.out.printf("股票最大獲利值 :%.1f , 公債最大獲利值: %.1f\n",MyMath.max(stock),MyMath.max(bonds));
        System.out.printf("股票最小獲利值 :%.1f , 公債最小獲利值: %.1f\n",MyMath.min(stock),MyMath.min(bonds));
    }
}
