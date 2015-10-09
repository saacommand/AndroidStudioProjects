package com.example;

/**
 * Created by Phil on 10/8/15.
 */
public class Weapon {
    private String name;
    private int hitPoints;
    private int damageInflicted;

    public Weapon(String name, int damageInflicted, int hitPoints) {
        super();
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageInflicted() {

        return damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }
}
