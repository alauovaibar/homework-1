package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    public int getDefense() {
        return 30;
    }
    public void displayInfo(){
        System.out.println("Armor:Plate Mail(Medieval) - Defense: " + getDefense());
    }
}

