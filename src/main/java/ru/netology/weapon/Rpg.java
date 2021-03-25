package ru.netology.weapon;

public class Rpg extends Weapon {
    @Override
    public String shot() {
        String event = "The player shoots from the RPG";
        System.out.println(event);
        return event;
    }
}
