package com.narxoz.rpg.equipment;

public class MagicFactory  implements EquipmentFactory{
    public Weapon createWeapon(){
        return new MagicStaff();
    }
    public Armor createArmor(){
        return new SilkRobe();
    }
}
