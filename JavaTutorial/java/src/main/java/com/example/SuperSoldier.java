package com.example;

/**
 * Created by Phil on 10/8/15.
 */
public class SuperSoldier extends Enemy {

    public SuperSoldier(int hitPoints, int lives){
        super(hitPoints, lives);
    }

    public void takeDamage(int damage){
        super.takeDamage(damage/2);
    }
}
