//*******************************************************************
// Activity 31 - linked lists
// Name: Tyler Shannon
// Date: 4/22/23
//*******************************************************************
// Student class represents a student in a university
// It contains instance variables for the student's first name,
// last name, ID, major, class standing, GPA, and course list.
// It also contains methods to add and remove courses from the course list,
// get the student's information, and display the student's courses.
//********************************************************************

import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, String id, String major, String classStanding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = 0.0;
        this.courseList = new LinkedList<String>();
    }

    public void addCourse(String course) {
        this.courseList.add(course);
    }

    public void removeCourse(String course) {
        this.courseList.remove(course);
    }

    public String getStudentInfo() {
        return "Name: " + this.firstName + " " + this.lastName +
                "\nID: " + this.id +
                "\nMajor: " + this.major +
                "\nClass Standing: " + this.classStanding +
                "\nGPA: " + this.gpa;
    }

    public void displayStudentCourses() {
        System.out.println("Course List:");
        for (String course : this.courseList) {
            System.out.println(course);
        }
    }
}
