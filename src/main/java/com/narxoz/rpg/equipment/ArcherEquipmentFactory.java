package com.narxoz.rpg.equipment;

public class ArcherEquipmentFactory implements EquipmentFactory{
    public Weapon createWeapon(){
        return new LongBow();
    }
    public Armor createArmor(){
        return new LeatherVest();
    }
}
