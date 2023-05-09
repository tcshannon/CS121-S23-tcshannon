//*******************************************************************
// Class: whileLoopActivity
// Name: Tyler Shannon
// Date: 2/6/2023
// Description:
// This class contains the main method to start the guessing game. It creates an instance of the
// GuessingGame class and calls the start() method to begin the game.
// Method:
// public static void main(String[] args)
// Parameters: args (String[]) - command line arguments
// The main method creates an instance of GuessingGame and calls its start() method to begin the game.
// It does not take any arguments and does not return any value.
// Check part 2 of 2 for more details.
//********************************************************************
public class whileLoopActivity {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.start();
    }
}
