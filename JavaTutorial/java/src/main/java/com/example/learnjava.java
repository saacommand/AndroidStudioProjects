package com.example;

public class learnjava {

    public static void main(String[] args) {
        //TODO: message stub
//
//        int lives = 3;
//        boolean isGameOver = (lives<1);
//        System.out.println(isGameOver);
//        if(isGameOver)
//            System.out.println("Game Over");
//        else
////            System.out.println("You Are Alive");
//        Weapon myAxe = new Weapon("GoldShine Axe", 15, 50);
//        Player tim= new Player("Tim",6);
//        System.out.println(tim.getWeapon().getName());
//        System.out.println(tim.getHandleName());
//        System.out.println(tim.getLevel());
//        tim.setWeapon(myAxe);
//        System.out.println(tim.getWeapon().getName());
//        Inventory_item redPotion = new Inventory_item(ItemType.POTION, "Red Potion");


//        tim.addInventoryItem(redPotion);

//        tim.addInventoryItem(new Inventory_item(ItemType.ARMOR, "+3 Chest Armor"));
//        tim.addInventoryItem(new Inventory_item(ItemType.RING, "+3 ring"));
//
//        ArrayList<Inventory_item> allItems = tim.getInventoryItems();
//        for(Inventory_item item:allItems){
//            System.out.println(item.getName());
//        }
//
//        System.out.println("");
//
//
//
//        Player alan = new Player();
//
//        alan.setHandleName("alan");
//        System.out.println(alan.getHandleName());
//        System.out.println(alan.getLevel());
//        System.out.println(alan.getWeapon().getName());


//        Player alan = new Player();
//        alan.setHandleName("alan");
//        alan.setLevel( "blah");
//        System.out.println(alan.getHandleName());
        Enemy enemy = new Enemy(10,3);
        System.out.println("Hit Points : " + enemy.getHitPoints() + " damage : " + enemy.getLives());
        enemy.takeDamage(3);
        Soldier soldier = new Soldier(25,1);
        System.out.println("Hit Points : " + enemy.getHitPoints() + " damage : " + enemy.getLives());
        soldier.takeDamage(4);

        SuperSoldier supersoldier = new SuperSoldier(25,1);
        supersoldier.takeDamage(4);




    }

}

