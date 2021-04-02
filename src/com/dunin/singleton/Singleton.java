package com.dunin.singleton;

public class Singleton {

    private static Singleton firstInstance = null;

    public static Singleton getInstance() {

        if (firstInstance == null) {
            firstInstance = new Singleton();
        }
        return firstInstance;
    }
    private Singleton() {


    }
}
