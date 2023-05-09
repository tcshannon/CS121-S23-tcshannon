//*******************************************************************
// Activity 19 - Inheritance part 3 of 4
// Name: Tyler Shannon
// Date: 3/15/23
//*******************************************************************
// This file contains the Professor subclass which inherits from the
// UniversityMember superclass. It has an additional instance variable: researchArea.
// It has getters and setters for both the inherited and new instance variables,
// and a toString() method that returns a string representation of the object's
// state. This class can be used to represent a professor in a university.
//*******************************************************************


package inheritance;

public class Professor extends UniversityMember {
    private String researchArea;

    public Professor(String name, int age, String department, String researchArea) {
        super(name, age, department);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", department='" + getDepartment() + '\'' +
                ", researchArea='" + researchArea + '\'' +
                '}';
    }
}
