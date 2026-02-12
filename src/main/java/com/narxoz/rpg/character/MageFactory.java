package com.narxoz.rpg.character;

public class MageFactory extends CharacterFactory {
    public Character createCharacter(String name){
        return new Mage(name);
    }
}
