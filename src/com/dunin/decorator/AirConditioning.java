package com.dunin.decorator;

public class AirConditioning extends ToppingDecorator{

    private String description;
    private float cost;

    public AirConditioning(Car tempCar) {
        super(tempCar);
        this.cost = 500;
        this.description = ", Air Conditioning";
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
