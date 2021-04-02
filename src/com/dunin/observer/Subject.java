package com.dunin.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Subject {

    List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    public void startWork() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (Observer observer : observers) {
                observer.update();
                System.out.println(observer.sendData());
            }
        });
        thread.start();
    }
}
