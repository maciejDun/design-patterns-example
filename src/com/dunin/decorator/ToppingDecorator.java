package com.dunin.decorator;

public abstract class ToppingDecorator implements Car {

    private Car tempCar;

    public ToppingDecorator(Car tempCar) {
        this.tempCar = tempCar;
    }

    @Override
    public float price() {
        return tempCar.price();
    }

    @Override
    public String description() {
        return tempCar.description();
    }
}
