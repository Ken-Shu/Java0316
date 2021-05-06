
package com.ocp.day23Set;

public class Score {
    //判斷分數是否在合理範圍
public static boolean isValid(int score){
    return score>= 0 && score<=100 ? true : false;
}
}
