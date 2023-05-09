//**************************************************************
// Project 1 - Pokemon Battle in JAVA
// Name: Tyler Shannon
// Date: 2/13/23
//***************************************************************
// WIP
//
//This file keeps getting larger and larger...
//
// This program is a simple Pokemon battle game for 2 players. It
// asks the players to enter an odd number of rounds, and for each
// round, each player selects a Pokemon and enters its stats (name,
// hit points, move, move's power, attack speed). The program then
// determines the round's winner based on speed, subtracts the
// winner's power from the loser's hit points, and adds 1 point to
// the winner's win total. The round continues until there is a
// winner, and after all the rounds are complete, the program
// prints the final scores and determines which player has the
// highest number of wins, and prints that player has won the game.
//***************************************************************

import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundCount, player1Wins = 0, player2Wins = 0;

        System.out.print("Enter the number of rounds: ");
        roundCount = scanner.nextInt();

        for (int round = 1; round <= roundCount; round++) {
            System.out.println("Round " + round);

            // Player 1 inputs
            System.out.println("Player 1, enter your Pokemon's details:");
            String player1Name = scanner.next();
            int player1HP = scanner.nextInt();
            String player1Move = scanner.next();
            int player1Power = scanner.nextInt();
            int player1Speed = scanner.nextInt();

            // Player 2 inputs
            System.out.println("Player 2, enter your Pokemon's details:");
            String player2Name = scanner.next();
            int player2HP = scanner.nextInt();
            String player2Move = scanner.next();
            int player2Power = scanner.nextInt();
            int player2Speed = scanner.nextInt();

            // Determine who strikes first
            int strikeFirst = 0;
            if (player1Speed > player2Speed) {
                strikeFirst = 1;
            } else if (player2Speed > player1Speed) {
                strikeFirst = 2;
            } else {
                strikeFirst = random.nextInt(2) + 1;
            }

            // Battle loop
            boolean roundOver = false;
            while (!roundOver) {
                if (strikeFirst == 1) {
                    // Player 1 strikes
                    player2HP -= player1Power;
                    System.out.println(player1Name + " used " + player1Move + "!");
                    System.out.println(player2Name + " took " + player1Power + " damage.");
                    if (player2HP <= 0) {
                        System.out.println(player1Name + " wins the round!");
                        player1Wins++;
                        roundOver = true;
                        break;
                    }

                    // Player 2 strikes
                    player1HP -= player2Power;
                    System.out.println(player2Name + " used " + player2Move + "!");
                    System.out.println(player1Name + " took " + player2Power + " damage.");
                    if (player1HP <= 0) {
                        System.out.println(player2Name + " wins the round!");
                        player2Wins++;
                        roundOver = true;
                        break;
                    }
                } else {
                    // Player 2 strikes
                    player1HP -= player2Power;
                    System.out.println(player2Name + " used " + player2Move + "!");
                    System.out.println(player1Name + " took " + player2Power + " damage.");
                    if (player1HP <= 0) {
                        System.out.println(player2Name + " wins the round!");
                        player2Wins++;
                        roundOver = true;
                        break;
                    }

                    // Player 1 strikes
                    player2HP -= player1Power;
                    System.out.println(player1Name + " used " + player1Move + "!");
                    System.out.println(player2Name + " took " + player1Power + " damage.");
                    if (player2HP <= 0) {
                        System.out.println(player1Name + " wins the round!");
                        player1Wins++;
                        roundOver = true;
                        break;
                    }
                }
            }
        }
    }
}