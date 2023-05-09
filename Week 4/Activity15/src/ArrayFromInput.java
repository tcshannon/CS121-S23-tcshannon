//**************************************************************
// Activity 15
// Name: Tyler Shannon
// Date: 3/1/23
//***************************************************************
// This program prompts the user to enter names, ages, and salaries
// for three employees, and stores the data in three arrays. The
// program then prints out the data in a table with headers. The
// arrays include a String array for the names, an int array for
// the ages, and a double array for the salaries.
//
// To run the program, simply execute the main() method. The program
// will prompt the user for input and then print out a table of data.
// Data input format is specified by the program prompts.
//*****************************************************************


import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create the arrays
        String[] names = new String[3];
        int[] ages = new int[3];
        double[] salaries = new double[3];

        // populate the arrays with user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name #" + (i+1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter age #" + (i+1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter salary #" + (i+1) + ": ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character left behind by nextDouble()
        }

        // print the arrays in a table
        System.out.printf("%-10s %-10s %-10s\n", "Name", "Age", "Salary");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10s %-10d %-10.2f\n", names[i], ages[i], salaries[i]);
        }
    }
}
