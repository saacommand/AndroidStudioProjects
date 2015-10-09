package com.example;

import java.util.ArrayList;

/**
 * Created by Phil on 10/8/15.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Inventory_item> inventory_items;

    public Player(){

        handleName = "Unknown Player";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
        inventory_items = new ArrayList<Inventory_item>();
        setDefaultWeapon();
    }

    public Player(String handle){
        this();
        handleName = handle;
    }

    public Player(String handle, int level){
        this();
        setHandleName(handle);
        setLevel(level);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
    
        return level;
    }

    public int getLives() {
        return lives;
    }

    public int getScore() {
        return score;
    }



//    public void setNameandLevel(String name, int level){
//        this.setHandleName(name);
//        this.setLevel(level);
//    }
    public String getHandleName(){
        return handleName;
    }

    public void setHandleName( String name){
        handleName = name ;
    }

    public ArrayList<Inventory_item> getInventoryItems(){
        return inventory_items;
    }

    public void addInventoryItem(Inventory_item inventory_item){
        inventory_items.add(inventory_item);
    }

    public boolean removeInventoryItem(Inventory_item inventory_item){
        if(this.inventory_items.contains(inventory_item)){
            inventory_items.remove(inventory_item);
            return true;
        }
        return false;
    }
}
