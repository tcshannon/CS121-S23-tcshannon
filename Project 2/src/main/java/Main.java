//**************************************************************
// Project 2 - Main Class
// Group members: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// This file contains the implementation of the Main class.
// The Main class contains the main() method, which creates an instance of the PokemonSelection class and
// uses this instance to call its assignPokemon() method. The method assigns a Pokemon to each player and
// displays their stats. The program can be run from this file.

package main.java;

//Main class
public class Main {
    public static void main(String[] args) {
        PokemonSelection pokemonSelection = new PokemonSelection();
        //assign pokemon to player 1
        pokemonSelection.assignPokemon(1);

        //assign pokemon to player 2
        pokemonSelection.assignPokemon(2);

        pokemonSelection.closeScanner();
    }
}
