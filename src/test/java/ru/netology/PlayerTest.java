package ru.netology;

import ru.netology.weapon.Weapon;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.MatcherAssert.assertThat;




import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    private static Player player;
    private static Weapon[] weapons;



    @BeforeAll
    public static void playerCreate() {
        player = new Player();
        weapons = player.getWeapon();
    }

    @Test
    public void weaponNotNullTest() {
        assertNotNull(weapons);
    }

    /**
     * Hamcrest
     */
    @Test
    public void shotWithPistolTest() {
        final int weapon = 0;
        final String expected = "The player shoots a pistol";
        final String result = player.shotWithWeapon(weapon);
        assertThat(expected, equalToIgnoringWhiteSpace(result));
    }

    /**
     * Hamcrest
     */
    @Test
    public void giveArrayWeaponTest() {
        assertThat(weapons, arrayWithSize(5));
    }

    /**
     * Hamcrest
     */
    @Test
    public void showWithRpgTest() {
        final int weapon = 2;
        final String expected = "The player shoots from the RPG";
        final String result = player.shotWithWeapon(weapon);
        assertThat(expected, equalToIgnoringWhiteSpace(result));
    }



}