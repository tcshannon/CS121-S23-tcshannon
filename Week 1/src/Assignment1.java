//**************************************************************
// Assignment #1
// Name: Tyler Shannon
// Date: 1/23/2023
//***************************************************************
// This program contains two tasks in Java.
//
// Task 1:
// The program prompts the user to enter their first and last name using Scanner.
// Then the program displays their name in three ways:
// 1. All uppercase
// 2. All lowercase
// 3. In reverse order
//
// Task 2:
// The program asks the user to enter two numbers using JOptionPane.
// Then the program performs seven operations: addition, subtraction, multiplication, division,
//  square root, power, and logarithm. The program displays the input numbers and the result of each operation.
//
// To run this program, simply compile and run the Java file. Follow the prompts to input the required data.
// No external files are required for this program.
//*****************************************************************

import java.util.Scanner; // Import Scanner for Task 1
import javax.swing.JOptionPane; // Import JOptionPane for Task 2

public class Assignment1 {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Name in all uppercase: " + (firstName + " " + lastName).toUpperCase());
        System.out.println("Name in all lowercase: " + (firstName + " " + lastName).toLowerCase());
        System.out.print("Name in reverse order: ");
        for (int i = (firstName + " " + lastName).length() - 1; i >= 0; i--) {
            System.out.print((firstName + " " + lastName).charAt(i));
        }
        System.out.println();

        // Task 2
        String input1 = JOptionPane.showInputDialog("Enter first number:");
        double num1 = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Enter second number:");
        double num2 = Double.parseDouble(input2);

        System.out.println("Input numbers: " + num1 + " and " + num2);
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println("Square root of first number: " + Math.sqrt(num1));
        System.out.println("First number raised to the power of the second number: " + Math.pow(num1, num2));
        System.out.println("Logarithm of first number: " + Math.log(num1));
    }

}