package com.magicalarena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArenaTest {
    @Test
    void testArenaInitialization() {
        Player player1 = new Player("A", 50, 5, 10);
        Player player2 = new Player("B", 100, 10, 5);
        Arena arena = new Arena(player1, player2);
        Assertions.assertNotNull(arena);
    }
}