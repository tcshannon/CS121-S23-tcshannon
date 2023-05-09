//**************************************************************
// Activity 31 - linked lists part 2 of 3
// Name: Tyler Shannon
// Date: 4/24/23
//***************************************************************
// This class creates a Student object and prints out the student's
// name and ID.
//********************************************************************
// FOR ALL METHODS IN StudentPrinter class
// Parameters: none
//
// Method descriptions:
// - main(String[] args): creates a Student object with a name, ID, and age, and prints out the student's name and ID
//********************************************************************

package serc;
import serc.Student;

public class StudentPrinter {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345, 20);
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
    }
}
