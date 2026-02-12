package com.narxoz.rpg.equipment;

public class LongBow implements Weapon{
    public int getDamage(){
        return 30;
    }
    public void displayInfo(){
        System.out.println("Weapon: Long Bow (Archer) - Damge: "+getDamage());
    }
}
