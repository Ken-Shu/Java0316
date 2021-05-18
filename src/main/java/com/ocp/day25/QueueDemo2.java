
package com.ocp.day25;

//佇列 FIFO (first in first out)

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue <String > queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Mary");
        queue.offer("Helen");
        System.out.println("目前排隊的人"+queue);
        
        while (!queue.isEmpty()) {            
            String name = queue.poll();
            System.out.println("叫到" +name);
            System.out.println("目前排隊的人" + queue);
        }
    }
}
