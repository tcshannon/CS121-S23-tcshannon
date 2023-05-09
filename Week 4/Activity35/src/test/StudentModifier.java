//**************************************************************
// Activity 31 - linked lists part 2 of 3 test
// Name: Tyler Shannon
// Date: 4/24/23
//***************************************************************
// This class creates a Student object and modifies the student's age.
//********************************************************************
// FOR ALL METHODS IN StudentModifier class
// Parameters: none
//
// Method descriptions:
// - main(String[] args): creates a Student object with a name, ID, and age, and modifies the student's age
//********************************************************************

package test;
import test.Student;

public class StudentModifier {
    public static void main(String[] args) {
        Student student = new Student("Jane Smith", 67890, 21);
        System.out.println("Original age: " + student.getAge());
        student.setAge(22);
        System.out.println("New age: " + student.getAge());
    }
}
