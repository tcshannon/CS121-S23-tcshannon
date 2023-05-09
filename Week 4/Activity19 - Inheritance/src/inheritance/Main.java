//**************************************************************
// Activity 19 - Inheritance part 4 of 4
// Name: Tyler Shannon
// Date: 3/15/23
//***************************************************************
// Test class to run the universityMember superclass.
//*****************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// Parameters: List them here and comment
// A discussion of what the method/function does and required
// parameters as well as return value.

package inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a student object and set its properties
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.setDepartment("Computer Science");
        student.setStudentId("12345");

        // Create a professor object and set its properties
        Professor professor = new Professor();
        professor.setName("Bob");
        professor.setAge(40);
        professor.setDepartment("Mathematics");
        professor.setResearchArea("Number Theory");

        // Print the object states using their toString() methods
        System.out.println(student.toString());
        System.out.println(professor.toString());
    }
}
