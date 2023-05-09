//**************************************************************
// Project 2 - Pokemon Selection Class
// Group members: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// This file contains the implementation of the PokemonSelection class.
// The PokemonSelection class includes methods for selecting the values needed to create an instance of a
// Pokemon, as well as assigning a Pokemon to each player and displaying its stats. The class uses Scanner
// to get input from the user, and also includes a method for closing the Scanner once input is complete.

package main.java;

import java.util.Scanner;

public class PokemonSelection {
    private Scanner scanner = new Scanner(System.in);

//createPokemon method
public Pokemon createPokemon() {
        System.out.print("Enter Pokemon Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Hit Points: ");
        int hitPoints = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Move: ");
        String move = scanner.nextLine();
        System.out.print("Enter Move Power: ");
        int movePower = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Attack Speed: ");
        int attackSpeed = scanner.nextInt();
        scanner.nextLine();

        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
        }

//assignPokemon method
public void assignPokemon(int playerNum) {
        System.out.println("Player " + playerNum + ": Select a Pokemon and enter its stats");
        Pokemon pokemon = createPokemon();
        System.out.println("Player " + playerNum + " Pokemon");
        System.out.println(pokemon.displayPokemonStats());
        }

//close scanner
public void closeScanner() {
        scanner.close();
        }
}
