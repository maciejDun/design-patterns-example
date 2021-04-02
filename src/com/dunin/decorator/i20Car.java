package com.dunin.decorator;

public class i20Car implements Car {

    @Override
    public float price() {
        return 20000;
    }

    @Override
    public String description() {
        return "Hyundai i20";
    }
}
