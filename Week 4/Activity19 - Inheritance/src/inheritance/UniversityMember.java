//*******************************************************************
// Activity 19 - Inheritance part 1 of 4
// Name: Tyler Shannon
// Date: 3/15/23
//*******************************************************************
// This file contains the UniversityMember superclass which has 3 instance
// variables: name, age, and department. It also has getters and setters for
// these variables, and a toString() method that returns a string representation
// of the object's state. Other classes can inherit from this class to reuse
// these instance variables and methods.
//*******************************************************************


package inheritance;

public class UniversityMember {
    private String name;
    private int age;
    private String department;

    public UniversityMember(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UniversityMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
