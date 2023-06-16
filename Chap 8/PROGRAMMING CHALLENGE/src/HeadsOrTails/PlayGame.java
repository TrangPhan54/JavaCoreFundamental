package HeadsOrTails;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter player 1 name: ");
        String name1 = kb.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Enter player 2 name: ");
        String name2 = kb.nextLine();
        Player player2 = new Player(name2);

        Coin coin = new Coin();


        while (player1.getPoints() < 5 && player2.getPoints() < 5) {
            System.out.println("Player 1 guess the side up: ");
            String player1Guess = kb.nextLine();
            coin.toss();
            if (player1Guess.equalsIgnoreCase(coin.getSideUp())) {
                player1.setPoints();
            } else {
                player1.minusPoint();
            }
            System.out.println(player1.getPoints());

            System.out.println("Player 2 guess the side up: ");
            String player2Guess = kb.nextLine();
            coin.toss();
            if (player2Guess.equalsIgnoreCase(coin.getSideUp())) {
                player2.setPoints();
            } else {
                player2.minusPoint();
            }
            System.out.println(player2.getPoints());

        }

        if (player1.getPoints() > player2.getPoints()) {
            System.out.println("Player 1 wins!");
        } else if (player1.getPoints() > player2.getPoints()) {
            System.out.println("player 2 wins!");
        } else {
            System.out.println("Draw!");
        }
    }

}
