package com.narxoz.rpg.character;

public class ArcherFactory extends CharacterFactory{
    public Character createCharacter(String name){
        return new Archer(name);
    }
}
