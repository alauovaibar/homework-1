package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.EquipmentFactory;

public interface Character {

        void displayStats();
        void useSpecialAbility();
        void equip(EquipmentFactory factory);

    public abstract class CharacterFactory{
        public abstract Character createCharacter(String name);
    }
}
