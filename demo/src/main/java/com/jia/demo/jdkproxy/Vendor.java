package com.jia.demo.jdkproxy;

import static java.lang.System.out;

public class Vendor implements Sell {
    public void sell() {
        System.out.println("In sell method");
    }
    public void ad() {
        System.out.println("ad method");
    }
}
