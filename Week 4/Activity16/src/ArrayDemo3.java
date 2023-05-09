//**************************************************************
// Activity 16 part 3 of 3
// Name: Tyler Shannon
// Date: 3/1/23
//
// This program creates a 3-dimensional array of strings and prints
// it to the console using a regular for loop.
//
// To run the program, simply compile and execute it. No input
// or output files are needed.
//*****************************************************************

public class ArrayDemo3 {
    public static void main(String[] args) {
        // Declare and initialize a 3-dimensional array of strings
        String[][][] myStrings = {
                {{"one", "two"}, {"three", "four"}},
                {{"five", "six"}, {"seven", "eight"}},
                {{"nine", "ten"}, {"eleven", "twelve"}}
        };

        // Print the elements of the array using a regular for loop
        for (int i = 0; i < myStrings.length; i++) {
            for (int j = 0; j < myStrings[i].length; j++) {
                for (int k = 0; k < myStrings[i][j].length; k++) {
                    System.out.print(myStrings[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
