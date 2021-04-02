package com.dunin.decorator;

public class MetallicPaint extends ToppingDecorator{

    private String description;
    private float cost;

    public MetallicPaint(Car tempCar) {
        super(tempCar);
        this.cost = 1000;
        this.description = ", Metallic Paint";
    }

    @Override
    public float price() {
        return super.price() + this.cost;
    }

    @Override
    public String description() {
        return super.description() + this.description;
    }
}
