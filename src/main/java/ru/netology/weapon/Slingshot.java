package ru.netology.weapon;

public class Slingshot extends Weapon {
    @Override
    public String shot() {
        String event = "Player shoots a slingshot";
        System.out.println(event);
        return event;

    }
}
