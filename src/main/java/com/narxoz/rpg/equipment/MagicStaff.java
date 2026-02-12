package com.narxoz.rpg.equipment;

public class MagicStaff implements Weapon{
    public int getDamage() {
        return 40;
    }
    public void displayInfo(){
        System.out.println("Weapon:Arcane Staff(Magic) - Damage" + getDamage());
    }
}
