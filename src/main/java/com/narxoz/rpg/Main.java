package com.narxoz.rpg;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");
        CharacterFactory warriorFactory=new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory=new ArcherFactory();
        //
        EquipmentFactory medievalGear=new MedievalFactory();
        EquipmentFactory magicGear=new MagicFactory();
        EquipmentFactory archerGear=new ArcherEquipmentFactory();
        //
        Character warrior=warriorFactory.createCharacter("Geralt iz Rivi");
        warrior.equip(medievalGear);
        warrior.displayStats();
        warrior.useSpecialAbility();
        System.out.println();
        //
        Character mage=mageFactory.createCharacter("Nobara");
        mage.equip(magicGear);
        mage.displayStats();
        mage.useSpecialAbility();
        System.out.println();
        //
        Character archer=archerFactory.createCharacter("Hawkeye");
        archer.equip(archerGear);
        archer.displayStats();
        archer.useSpecialAbility();


        System.out.println("\n=== Demo Complete ===");
    }

}
