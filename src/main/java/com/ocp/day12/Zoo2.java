
package com.ocp.day12;

public class Zoo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        palyShout(cat);
        Tiger tiger=new Tiger();
        palyShout(tiger);
        Cat cat2= new Tiger();
        palyShout(cat2);
    }
    public static void palyShout(Cat cat) {
        cat.shout();
    }
}
