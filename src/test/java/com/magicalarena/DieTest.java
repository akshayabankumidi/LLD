package com.magicalarena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class DieTest {
    @Test
    void testDieRoll() {
        for (int i = 0; i < 1000; i++) {
            int roll = Die.roll();
            Assertions.assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
