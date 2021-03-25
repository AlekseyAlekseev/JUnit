package ru.netology;

import ru.netology.weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Pistol(),
                new MachineGun(),
                new Rpg(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public Weapon[] getWeapon() {
        return weaponSlots;
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
    public String shotWithWeapon(int slot) {
        if(slot > getSlotsCount() - 1 || slot < 0)
            throw new IllegalArgumentException("The length of the edge of the array was exceeded");
        Weapon weapon = weaponSlots[slot];
        String event = weapon.shot();
        return event;
    }
}
