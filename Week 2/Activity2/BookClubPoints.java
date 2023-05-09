package Activity2;
//**************************************************************
// Assignment #2 part 1 of 2
// Name: Tyler Shannon
// Date: 1/23/23
//***************************************************************
// This program calculates the number of book club points earned
// based on the number of books purchased this month. It prompts
// the user for the number of books purchased and outputs the
// number of points earned based on the assignment instructions.
//*****************************************************************

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books purchased this month: ");
        int numOfBooks = input.nextInt();

        int pointsEarned = 0;

        if (numOfBooks == 1) {
            pointsEarned = 5;
        } else if (numOfBooks == 2) {
            pointsEarned = 15;
        } else if (numOfBooks == 3) {
            pointsEarned = 30;
        } else if (numOfBooks >= 4) {
            pointsEarned = 60;
        }

        System.out.println("The number of points earned this month is: " + pointsEarned);
    }
}
