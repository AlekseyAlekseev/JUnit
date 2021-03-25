package ru.netology.weapon;

public class Pistol extends Weapon {
    @Override
    public String shot() {
        String event = "The player shoots a pistol";
        System.out.println(event);
        return event;
    }
}
