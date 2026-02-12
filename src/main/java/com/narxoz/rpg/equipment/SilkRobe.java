package com.narxoz.rpg.equipment;

public class SilkRobe implements Armor{
    public int getDefense(){
        return 10;
    }
    public void displayInfo(){
        System.out.println("Armor: Silk Robe(Magic) - Defense: " + getDefense());
    }
}
