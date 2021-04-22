package com.ocp.day16;

public class AreaCalc {

    public static void main(String[] args) {
        double r = 15.0;
        CicleAreaImpl ci = new CicleAreaImpl();
        System.out.println(ci.getArea(r));
        //匿名內部類別(球圓面積) 直接在後方實作(覆寫原本的方法)
        CircleArea ca2 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        };
        System.out.println(ca2.getArea(r));

        //求圓體積
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return (4.0 / 3) * (Math.PI) * (Math.pow(r, 3));
            }
        };
        System.out.println(ca3.getArea(r));
    }
}
