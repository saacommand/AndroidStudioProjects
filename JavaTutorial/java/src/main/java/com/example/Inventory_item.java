package com.example;

/**
 * Created by Phil on 10/8/15.
 */
enum ItemType {
    POTION, 
    RING, 
    ARMOR}
public class Inventory_item {

    private ItemType type;
    private String name;

    public Inventory_item(ItemType type,String name) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {

        return name;
    }

    public ItemType getType() {
        return type;
    }

}
