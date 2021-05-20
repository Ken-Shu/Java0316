
package com.ocp.day27;

public class Fruit {
private String name;
private int qty;
private double price;

    public Fruit(String name, int qty, double price) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }

}
