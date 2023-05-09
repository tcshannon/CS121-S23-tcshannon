package Activity3;
//*****************************************************************
// Assignment #3 part 1 of 3
// Name: Tyler Shannon
// Date: 2/1/23
//*****************************************************************
// This program prompts the user to enter a number and checks if
// the number is even or odd using if/else statements. It then prints
// the result to the console. To run the program, execute the main method
// in the EvenOrOdd class. The user should input a single integer value.
//*****************************************************************

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        sc.close();
    }
}
