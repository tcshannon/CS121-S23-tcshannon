//**************************************************************
// Project 2 - Pokemon Class
// Group members: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// This file contains the implementation of the Pokemon class.
// The Pokemon class contains instance variables and methods that define a Pokemon, including its name,
// hit points, moves, move power, and attack speed. The class includes getters and setters for each instance
// variable, as well as a displayPokemonStats() method that returns a formatted string of the Pokemon's stats.

package main.java;
public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getMovePower() {
        return movePower;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    //displayPokemonStats method
    public String displayPokemonStats() {
        return "Name: " + this.name + "\nHit Points: " + this.hitPoints + "\nMove: " + this.move +
                "\nMove Power: " + this.movePower + "\nAttack Speed: " + this.attackSpeed;
    }
}
