package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;

public class Archer implements Character {
    private String name;
    private Weapon currentWeapon;
    private Armor currentArmor;
    public Archer(String name){
        this.name=name;
    }
    public void equip(EquipmentFactory factory){
        this.currentWeapon= factory.createWeapon();
        this.currentArmor= factory.createArmor();
    }
    public void displayStats(){
        System.out.println("=== "+name+ " (Archer) ===");
        if (currentArmor!=null) currentArmor.displayInfo();
        if (currentWeapon!=null) currentWeapon.displayInfo();
    }
    public void useSpecialAbility(){
        System.out.println(name + "EAGLE VISION");;
    }
}
