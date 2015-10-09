package com.example;

/**
 * Created by Phil on 10/8/15.
 */
public class Enemy {

    private int hitPoints;
    private int lives;

    public Enemy(int hitPoints, int lives){
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = getHitPoints() - damage;
        setHitPoints(remainingHitPoints);
        System.out.println("I took " + damage + " points damage, and have " + remainingHitPoints + " remaining");
    }

}
