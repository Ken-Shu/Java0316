package com.ocp.myHomeworktoStock.StocktoBufferReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Optional;
import java.util.stream.Stream;

public class MyPortfolio {

    public static void main(String[] args) throws Exception {
        String day = "20210416";
        String path = 
                String.format("https://www.twse.com.tw/exchangeReport/BWIBBU_d?response=csv&date=%s&selectType=ALL",day);
        System.out.println(path);
        InputStream inputStream = new URL(path).openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "Big5"));
        Stream<String> stream = reader.lines();
        //0:證券代號,1:證券名稱,2:殖利率(%),3:股利年度,4:本益比,5:股價淨值比,6:財報年/季,
        stream
                .filter(r -> r.split(",").length >= 7)
                //.filter(r -> !r.contains("證卷代號"))
                .map(r -> r.replace("\"", "")) //"6.51" -> 6.51
                .filter( r -> r.split(",")[2].matches("-?\\d+(\\.\\d+)?"))
                .filter( r -> r.split(",")[4].matches("-?\\d+(\\.\\d+)?"))
                .filter( r -> r.split(",")[5].matches("-?\\d+(\\.\\d+)?"))
                .filter(r -> {
                    double y = Double.parseDouble(r.split(",")[2]);
                    return y > 7.0;
                })
                .filter(r -> { //本益比
                    double pe = Double.parseDouble(r.split(",")[4]);
                    return pe < 10;
                })
                .filter(r -> { //股價淨值比
                    //double pb = Double.parseDouble(r.split(",")[5]);
                    Optional<Double> pb = Optional.of(Double.parseDouble(r.split(",")[5]));
                    return pb.get() < 1;
                })
                .forEach(System.out::println);
    }

}
