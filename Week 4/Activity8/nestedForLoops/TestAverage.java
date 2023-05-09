//********************************************************************
// Activity 8
// Name: Tyler Shannon
// Date: 2/6/23
//********************************************************************
// This program prompts the user to enter the number of students and
// the number of test scores per student. It then asks for each test score
// and calculates the average for each student. The averages are printed
// to the console.
//********************************************************************
// To run the program, compile and run the TestAverage.java file. Follow
// the prompts to enter the number of students and number of tests per
// student, and then enter the test scores for each student as prompted.
// The program will calculate the average test scores and print them to
// the console.
//********************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// No methods in this class.
//********************************************************************

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many students there are
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        // Ask how many test scores there are per student
        System.out.print("Enter number of tests per student: ");
        int numTests = input.nextInt();

        // For each student
        for (int i = 1; i <= numStudents; i++) {
            double total = 0;

            // ask for each test score
            System.out.println("Student number " + i);
            for (int j = 1; j <= numTests; j++) {
                System.out.print("Enter score " + j + ": ");
                double score = input.nextDouble();
                total += score;
            }

            // calculate the average test score
            double average = total / numTests;

            // print the average test score
            System.out.printf("The average for student %d is %.2f\n", i, average);
        }
    }
}
