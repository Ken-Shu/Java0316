
package com.ocp.day06;

/*
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
請問哪一個較集中
*/
public class ArrayCV3 {
    public static void main(String[] args) {
        double [] height = {172,168,164,170,176};
        double [] weight = {62,57,58,64,64};        
        double h_cv = 100*(MyMath.cv(height));
        double w_cv = 100*(MyMath.cv(weight));
        String result = h_cv>w_cv? "體重比較集中": "身高比較集中";
        System.out.println(result);
//        if(h_cv>w_cv){
//            System.out.printf("height_cv = %.2f%%  weight_cv = %.2f%% 體重比較集中",h_cv,w_cv);
//        }else System.out.printf("height_cv = %.2f%%  weight_cv = %.2f%% 身高比較集中",h_cv,w_cv);
    }    
}
