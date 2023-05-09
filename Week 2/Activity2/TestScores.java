package Activity2;
//**************************************************************
// Assignment #2 part 2 of 2
// Name: Tyler Shannon
// Date: 1/23/23
//***************************************************************
// This program prompts the user to enter three test scores and
// calculates the average score. It then outputs the letter grade
// corresponding to the average score based on the grading scale
// specified in the assignment instructions.
//*****************************************************************


import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the score for test 1: ");
        double test1 = input.nextDouble();

        System.out.print("Enter the score for test 2: ");
        double test2 = input.nextDouble();

        System.out.print("Enter the score for test 3: ");
        double test3 = input.nextDouble();

        double average = (test1 + test2 + test3) / 3.0;

        System.out.println("The average test score is: " + average);

        if (average >= 90 && average <= 100) {
            System.out.println("Letter grade: A");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Letter grade: B");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Letter grade: C");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F");
        }
    }
}
