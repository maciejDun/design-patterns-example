package com.dunin.observer;

public class Client2 implements Observer{

    @Override
    public void update() {
        System.out.println("End of thread work!!! Massage from Client2");
    }
}
