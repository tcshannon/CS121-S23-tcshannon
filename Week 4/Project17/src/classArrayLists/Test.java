//*******************************************************************
// Activity 17
// Name: Tyler Shannon
// Date: 3/1/23
//*******************************************************************
// This program demonstrates the use of ArrayLists in Java by
// creating a test class that prompts the user to enter course info
// or "q to quit" and prints the info as a table using the CourseInfo
// class. The program uses standard input and output to interact with
// the user. Course info should be entered in the following format:
//
// [Course Name]
// [GPA]
// [Score]
// [Letter Grade]
//
// For example:
//
// Algebra
// 3.5
// 92
// A-
//
// When the user enters "q", the program prints the table to the console.
//********************************************************************


package classArrayLists;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseInfo courseInfo = new CourseInfo();

        while (true) {
            System.out.print("Enter course name (q to quit): ");
            String courseName = scanner.nextLine();
            if (courseName.equals("q")) {
                break;
            }

            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.print("Enter letter grade: ");
            String letterGrade = scanner.nextLine();

            courseInfo.addCourse(courseName, gpa, score, letterGrade);
        }

        courseInfo.printTable();
    }
}
