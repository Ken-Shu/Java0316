
package com.ocp.day25;

//佇列 FIFO (first in first out)

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <String > queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Mary");
        queue.offer("Helen");
        
        System.out.println("目前排隊的人"+queue);
        //poll 取得物件 並且 移除物件
        String name = queue.poll();
        //peek 呼叫物件 不移除
        //String name = queue.peek();
        System.out.println("叫到"+name);
        
         System.out.println("目前排隊的人"+queue);
        //poll 取得物件 並且 移除物件
        String name2 = queue.poll();
        //peek 呼叫物件 不移除
        //String name = queue.peek();
        System.out.println("叫到"+name2);
        
         System.out.println("目前排隊的人"+queue);
        //poll 取得物件 並且 移除物件
        String name3 = queue.poll();
        //peek 呼叫物件 不移除
        //String name = queue.peek();
        System.out.println("叫到"+name3);
        
        System.out.println(queue.isEmpty());
    }
}
