//**************************************************************
// Activity 9 part 1 of 1
// Name: Tyler Shannon
// Date: 2/6/23
//***************************************************************
// This program tests the user's extrasensory perception (ESP)
// by randomly selecting a color and asking the user to guess
// it. The program repeats this process 10 times, keeping track
// of the number of correct guesses. The possible colors are
// red, green, blue, orange, and yellow. The program displays
// the final score at the end.
//
// To run the program, compile and run the ESPGame class. The
// program prompts the user to enter a color for each round.
// The input should be in lowercase and match the spelling of
// the color exactly. The program then displays whether the
// guess was correct or not, and the selected color if the guess
// was incorrect.

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    private static final String[] COLORS = {"red", "green", "blue", "orange", "yellow"};
    private static final int NUM_ROUNDS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numCorrect = 0;

        System.out.println("Welcome to the ESP game!");
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            // Generate random color index
            int colorIndex = random.nextInt(COLORS.length);
            String selectedColor = COLORS[colorIndex];

            // Ask user to guess the color
            System.out.printf("%d. What color has the computer chosen?\n", i);
            String guessedColor = scanner.nextLine().toLowerCase();

            // Check if user guessed correctly
            if (guessedColor.equals(selectedColor)) {
                numCorrect++;
                System.out.println(">You guessed correctly!");
            } else {
                System.out.printf(">The computer chose %s.\n", selectedColor);
            }
        }

        // Display final score
        System.out.printf("You guessed %d out of %d colors correctly.\n", numCorrect, NUM_ROUNDS);
    }
}
