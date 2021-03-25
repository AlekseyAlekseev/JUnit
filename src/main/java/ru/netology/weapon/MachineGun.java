package ru.netology.weapon;

public class MachineGun extends Weapon {
    @Override
    public String shot() {
        String event = "The player shoots from a machine gun";
        System.out.println(event);
        return event;
    }
}