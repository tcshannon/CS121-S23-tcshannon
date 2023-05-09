//*******************************************************************
// Activity 19 - Inheritance part 2 of 4
// Name: Tyler Shannon
// Date: 3/15/23
//*******************************************************************
// This file contains the Student subclass which inherits from the
// UniversityMember superclass. It has an additional instance variable: studentId.
// It has getters and setters for both the inherited and new instance variables,
// and a toString() method that returns a string representation of the object's
// state. This class can be used to represent a student in a university.
//*******************************************************************


package inheritance;

public class Student extends UniversityMember {
    private int studentId;

    public Student(String name, int age, String department, int studentId) {
        super(name, age, department);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", department='" + getDepartment() + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
