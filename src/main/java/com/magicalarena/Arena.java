package com.magicalarena;

public class Arena {
    private final Player player1;
    private final Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startFight() {
        System.out.println("Fight begins between " + player1.getName() + " and " + player2.getName() + "!");
        Player attacker = (player1.getHealth() <= player2.getHealth()) ? player1 : player2;
        Player defender = (attacker == player1) ? player2 : player1;

        int round = 1;
        while (player1.isAlive() && player2.isAlive()) {
            System.out.println("\nRound " + round + ":");
            executeRound(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
            round++;
        }

        System.out.println("\nGame Over!");
        System.out.println(player1.getName() + " Final Health: " + player1.getHealth());
        System.out.println(player2.getName() + " Final Health: " + player2.getHealth());

        String winner = player1.isAlive() ? player1.getName() : player2.getName();
        System.out.println(winner + " wins!");
    }

    private void executeRound(Player attacker, Player defender) {
        int attackRoll = Die.roll();
        int defendRoll = Die.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;
        int netDamage = Math.max(0, attackDamage - defendStrength);

        defender.reduceHealth(netDamage);

        System.out.println(attacker.getName() + " attacks! Roll: " + attackRoll + ", Damage: " + attackDamage);
        System.out.println(defender.getName() + " defends! Roll: " + defendRoll + ", Defense: " + defendStrength);
        System.out.println("Net damage: " + netDamage + ". " + defender.getName() + "'s health reduced to " + defender.getHealth());
    }
}