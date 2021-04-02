package com.dunin.factory;

public class FactoryMain {
    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = enemyShipFactory.makeEnemyShip();

        doStuffEnemy(enemyShip);
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
