//**************************************************************
// Assignment #2
// Name: Tyler Shannon
// Data Structures Date: 1/23/2023
//***************************************************************
//
//*****************************************************************
//*******************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// Parameters: List them here and comment
// A discussion of what the method/function does and required
// parameters as well as return value.
//********************************************************************

import java.util.Scanner;

public class BookClubPoints
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books purchased this month: ");
        int booksPurchased = scanner.nextInt();

        int points = 0;
        if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;
        } else if (booksPurchased == 3) {
            points = 30;
        } else if (booksPurchased >= 4) {
            points = 60;
        }
        System.out.println("You have earned " + points + " points this month.");
    }
}

public class TestScores
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter test score 1: ");
        double score1 = scanner.nextDouble();
        System.out.print("Enter test score 2: ");
        double score2 = scanner.nextDouble();
        System.out.print("Enter test score 3: ");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3;
        System.out.println("The average test score is: " + average);

        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("The letter grade for the test score average is: " + letterGrade);
    }
}
