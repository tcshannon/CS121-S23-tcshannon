//*******************************************************************
// Activity 17
// Name: Tyler Shannon
// Date: 3/1/23
//*******************************************************************
// This program demonstrates the use of ArrayLists in Java by
// creating a class CourseInfo that uses ArrayLists to store course
// information such as the course name, GPA, score, and letter grade.
// The class has a method to add a new item to each list and a method
// to print the class info as a table with headers for Course Name,
// GPA, Score, and Letter Grade. A test class is included that prompts
// the user to enter course info or "q to quit" and prints the table to
// the console when done.
//********************************************************************
//*******************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// Parameters: List them here and comment
// A discussion of what the method/function does and required
// parameters as well as return value.
//********************************************************************


package classArrayLists;

import java.util.ArrayList;

public class CourseInfo {
    private ArrayList<String> courseNames;
    private ArrayList<Double> gpas;
    private ArrayList<Integer> scores;
    private ArrayList<String> letterGrades;

    public CourseInfo() {
        courseNames = new ArrayList<>();
        gpas = new ArrayList<>();
        scores = new ArrayList<>();
        letterGrades = new ArrayList<>();
    }

    public void addCourse(String courseName, double gpa, int score, String letterGrade) {
        courseNames.add(courseName);
        gpas.add(gpa);
        scores.add(score);
        letterGrades.add(letterGrade);
    }

    public void printTable() {
        System.out.println("Course Name\tGPA\tScore\tLetter Grade");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.printf("%s\t\t%.2f\t%d\t%s\n", courseNames.get(i), gpas.get(i), scores.get(i), letterGrades.get(i));
        }
    }
}
