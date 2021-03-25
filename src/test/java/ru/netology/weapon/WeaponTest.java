package ru.netology.weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeaponTest {

    private Weapon weapon;

    @Test
    public void weaponGeneralTest() {
        weapon = new Weapon();
        final String expected = "You must choose a weapon";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void weaponMachineGunTest() {
        weapon = new MachineGun();
        final String expected = "The player shoots from a machine gun";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void weaponPistolTest() {
        weapon = new Pistol();
        final String expected = "The player shoots a pistol";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void weaponRpgTest() {
        weapon = new Rpg();
        final String expected = "The player shoots from the RPG";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void weaponSlingshotTest() {
        weapon = new Slingshot();
        final String expected = "Player shoots a slingshot";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void weaponWaterGunTest() {
        weapon = new WaterGun();
        final String expected = "The player shoots a water pistol";
        final String result = weapon.shot();
        Assertions.assertEquals(expected, result);
    }

}