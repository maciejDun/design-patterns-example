package com.dunin.observer;

import java.util.UUID;

public class Client1 implements Observer{

    @Override
    public void update() {
        System.out.println("End of thread work!!! Massage from Client1");
    }
    
}
