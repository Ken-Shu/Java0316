package com.lab.pig;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
        List pigs = Stream.of(Util.getPigs())
                .filter(c -> c.getAddr().contains("桃園"))
                .collect(toList());
                
        System.out.println("家數 : " + pigs.size());
        

    }

}
