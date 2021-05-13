
package com.lab.pig;

public class Pig {
private String addr;
private String market_name;
private String context;

    @Override
    public String toString() {
        return "Pig{" + "addr=" + addr + ", market_name=" + market_name + ", context=" + context + '}';
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
