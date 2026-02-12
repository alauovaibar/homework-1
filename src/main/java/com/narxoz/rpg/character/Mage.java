package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;

public class Mage implements Character {
    private String name;
    private Weapon currentWeapon;
    private Armor currentArmor;

    public Mage(String name) {
        this.name = name;
    }

    public void equip(EquipmentFactory factory) {
        this.currentWeapon = factory.createWeapon();
        this.currentArmor = factory.createArmor();
        System.out.println(name + " equips magical gear.");
    }

    public void displayStats() {
        System.out.println("\n=== " + name + " (Mage) ===");
        if (currentWeapon != null) currentWeapon.displayInfo();
        if (currentArmor != null) currentArmor.displayInfo();
    }

    public void useSpecialAbility() {
        System.out.println(name + "FIREBALL!");
    }
}