package com.ocp.myHomeworktoStock.Exception;

public class MyException {

    public static void main(String[] args) {
            try {
                checkFood("炸雞");
        } catch (BadFoodException e) {
                System.out.println(e.getMessage());
        }
    }

    public static void checkFood(String s) throws BadFoodException {
        String[] badfood = {"炸雞", "薯條", "可樂"};
        for (String string : badfood) {
            if (s.equals(string)) {
                String errorMas = string + "是垃圾食物";
                BadFoodException e = new BadFoodException(errorMas);
                throw e;
            }
        }
        System.out.println(s + "不是垃圾食物");
    }
}
