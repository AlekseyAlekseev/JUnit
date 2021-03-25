package ru.netology.weapon;

public class WaterGun extends Weapon {
    @Override
    public String shot() {
        String event = "The player shoots a water pistol";
        System.out.println(event);
        return event;
    }
}
