package com.dunin.factory;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public String getName() {
        return name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the Hero ship!");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does damage: " + getAmtDamage());
    }
}
