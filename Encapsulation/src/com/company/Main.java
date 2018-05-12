package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Feliphe";
//        player.health = 20;
//        player.weapon = "bow";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Feliphe", 75, "Bow");
        System.out.println("Initial health is " + player.getHealth());
    }
}
