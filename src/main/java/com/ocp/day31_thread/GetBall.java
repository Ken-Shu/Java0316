package com.ocp.day31_thread;

import java.util.LinkedHashMap;
import java.util.Map;

class Ball {

    private int max = 1000;

    public /*synchronized*/ void get() {
        synchronized (this) {
            if (max > 0) {
                String name = Thread.currentThread().getName();

                System.out.printf("%s 取到第 %d 顆球\n", name, max);
                max--;
                GetBall.map.put(name, GetBall.map.get(name)+1);
                //如果下方 GetBall 沒有給預設值 則可以使用 getOrDefault 給予預設值
                //GetBall.map.put(name, GetBall.map.getOrDefault(max, max));
            }
        }
    }
}

class BallThread extends Thread {

    private Ball ball;

    public BallThread(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            ball.get();
        }
        System.out.println(GetBall.map);
    }

}

public class GetBall {
static  Map<String , Integer> map = new LinkedHashMap<>();
static {
    map.put("Thread-0", 0);
    map.put("Thread-1", 0);
    map.put("Thread-2", 0);
    map.put("Thread-3", 0);
}
    public static void main(String[] args) {
        Ball ball = new Ball();
        new BallThread(ball).start();
        new BallThread(ball).start();
        new BallThread(ball).start();
        new BallThread(ball).start();
    }
}
