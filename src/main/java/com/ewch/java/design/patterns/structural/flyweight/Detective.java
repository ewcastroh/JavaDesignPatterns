package com.ewch.java.design.patterns.structural.flyweight;

public class Detective implements Enemy {

    private String weapon;
    private final String LIFE;

    public Detective() {
        this.LIFE = "1000";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("Detective's weapon is " + this.weapon + ".");
    }

    @Override
    public void lifePoints() {
        System.out.println("The detective has " + this.LIFE + " life points.");
    }
}
