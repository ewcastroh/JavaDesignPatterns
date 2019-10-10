package com.ewch.java.design.patterns.structural.flyweight;

public class Private implements Enemy {

    private String weapon;
    private final String LIFE;

    public Private() {
        this.LIFE = "200";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("Private's weapon is " + this.weapon + ".");
    }

    @Override
    public void lifePoints() {
        System.out.println("The private has " + this.LIFE + " life points.");
    }
}
