package com.dunin.factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip() {

        char[] options = {'R', 'U', 'B'};
        int randomNumber = (int) (Math.random() * 3);
        char newShipType = options[randomNumber];

        if (newShipType == 'R') return new RocketEnemyShip();

        if (newShipType == 'U') return new UFOEnemyShip();

        if (newShipType == 'B') return new BigUFOEnemyShip();

        int a = 3;


        return null;
    }

}
