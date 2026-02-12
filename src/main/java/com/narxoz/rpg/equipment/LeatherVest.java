package com.narxoz.rpg.equipment;

public class LeatherVest implements Armor{
    public int getDefense(){
        return 15;
    }
    public void displayInfo(){
        System.out.println("Armor: Leather Vest(Archer) - Defense: "+ getDefense());
    }
}
