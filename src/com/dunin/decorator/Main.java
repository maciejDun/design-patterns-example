package com.dunin.decorator;

public class Main {
    public static void main(String[] args) {
        Car tempCar = new AirConditioning(new MetallicPaint(new i20Car()));
        Car car = new i20Car();
        Car car1 = new MetallicPaint(car);
        Car car3 = new AirConditioning(car1);
        System.out.println(car1.description());
        System.out.println(car3.description());
//        System.out.println(tempCar.description());
//        System.out.println(tempCar.price());
    }
}
