package com.dunin.singleton;

import com.dunin.factory.EnemyShip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSingleton {
    public static void main(String[] args) {

        Singleton singletonInstance = Singleton.getInstance();

        System.out.println(singletonInstance.getClass());

        int a = 5;
        int b = 10;

        sum(a, b);
        sum(5, a);

    }

    private static void sum(int a, int b) {
        int c = a + b;
    }
}
