package com.ignavarro;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"}; // rock, paper, scissors
        String pcMove = rps[new Random().nextInt(rps.length)];

        Scanner sn = new Scanner(System.in); // input from user, java.util.Scanner
        String playerMove;
        while (true) {
            System.out.println("Enter your move (r, p, or s)");
            playerMove = sn.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + " Not a valid move");
        }
        System.out.println("Computer played: " + pcMove);

        if (playerMove.equals(pcMove)) {
            System.out.println("Tie");
        } else if (playerMove.equals("r")) {
            if (pcMove.equals("p")) {
                System.out.println("You lose!");
            } else if (pcMove.equals("s")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("p")) {
            if (pcMove.equals("r")) {
                System.out.println("You win");
            } else if (pcMove.equals("s")) {
                System.out.println("You lose");
            }
        } else if (playerMove.equals("s")) {
            if (pcMove.equals("p")) {
                System.out.println("You win");
            } else if (pcMove.equals("r")) {
                System.out.println("You lose");
            }
        }
    }
}
