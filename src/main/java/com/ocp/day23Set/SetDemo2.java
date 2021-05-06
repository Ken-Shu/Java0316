package com.ocp.day23Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo2 {

    public static void main(String[] args) {
        //國英數的分數是介於0~100之間
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        System.out.println(scores);
        //Iterator it 這實是 取的每一個物件
        Iterator it = scores.iterator();        
        int sum = 0;
        while (it.hasNext()) {
            Object next = it.next();
//            if(next instanceof Double || next instanceof Boolean){
//                it.remove();
//                continue;
//            }
//            if ((Integer) next >= 100 || (Integer) next < 0) {
//                it.remove();
//            }
                if (next instanceof Integer) {
                    int score = (Integer) next;
                   if(!(score>=0 && score <= 100)){
                       it.remove();
                   }             
                }else {
                it.remove();
                }
            }
            System.out.println(scores);
            it = scores.iterator(); // 重新指派
            //求總分
            while (it.hasNext()) {
            Object next = it.next();
            if(next instanceof Integer)
            sum += (Integer)next;
        }
           System.out.println(sum);
            
        }

    }
