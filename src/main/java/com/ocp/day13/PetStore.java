
package com.ocp.day13;

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        Pet a1 = new Dog();
        Pet a2 = new Cat();
        Pet a3 = new EPet();
        a3.eat();
        a3.move();
        a1.eat();
        a1.move();
        a2.eat();
        a2.move();
        System.out.println(Animal.legs);
        
        Pet[] pets = {a1,a2,a3};
        Stream.of(pets).forEach(p -> p.eat());
    }
    
}
