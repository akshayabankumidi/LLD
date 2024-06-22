package com.magicalarena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void testPlayerInitialization() {
        Player player = new Player("Test", 100, 10, 5);
        Assertions.assertEquals("Test", player.getName());
        Assertions.assertEquals(100, player.getHealth());
        Assertions.assertEquals(10, player.getStrength());
        Assertions.assertEquals(5, player.getAttack());
        Assertions.assertTrue(player.isAlive());
    }

    @Test
    void testPlayerTakeDamage() {
        Player player = new Player("Test", 100, 10, 5);
        player.reduceHealth(30);
        Assertions.assertEquals(70, player.getHealth());
        Assertions.assertTrue(player.isAlive());
        player.reduceHealth(80);
        Assertions.assertEquals(0, player.getHealth());
        Assertions.assertFalse(player.isAlive());
    }
}