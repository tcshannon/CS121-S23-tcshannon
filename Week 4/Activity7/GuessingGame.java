//**************************************************************
// Activity 7 part 2 of 2
// Name: Tyler Shannon
// Date: 2/6/2023
//***************************************************************
// This program is a guessing game that allows the user to guess a random number between 1 and 100.
// The user can input their guess or 'q' to quit the game. The program will inform the user if the
// guess is too high or too low, and when the user guesses the correct number, it will output the
// number of guesses it took and terminate the game. If the user quits the game, the program will
// output the correct number. This program demonstrates the use of a while loop and user input validation.
// To run the program, compile and run the whileLoopActivity class (in part 1 of 2).
//*****************************************************************
import java.util.Scanner;

public class GuessingGame {
    private int number;
    private int numberOfGuesses;

    public GuessingGame() {
        this.number = (int) (Math.random() * 100) + 1;
        this.numberOfGuesses = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean quit = false;
        while (!quit) {
            System.out.print("Guess a number between 1 and 100, or enter 'q' to quit the game: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitter! The number was " + this.number + ".");
                quit = true;
            } else {
                try {
                    int guess = Integer.parseInt(input);
                    if (guess < 1 || guess > 100) {
                        System.out.println("Your guess should be between 1 and 100.");
                    } else {
                        this.numberOfGuesses++;
                        if (guess == this.number) {
                            System.out.println("Correct!");
                            System.out.println("Number of guesses: " + this.numberOfGuesses);
                            quit = true;
                        } else if (guess < this.number) {
                            System.out.println("Too low. Guess again.");
                        } else {
                            System.out.println("Too high. Guess again.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Your guess should be a number or 'q'.");
                }
            }
        }
        scanner.close();
    }
}
