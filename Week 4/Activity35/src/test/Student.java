//**************************************************************
// Activity 31 - linked lists part 1 of 3 test
// Name: Tyler Shannon
// Date: 4/24/23
//***************************************************************
// This class defines a Student object with a name, ID, and age.
// It includes methods to get and set each of these variables.
//********************************************************************
// FOR ALL METHODS IN Student class
// Parameters:
// - String name: the student's name
// - int id: the student's ID number
// - int age: the student's age
//
// Method descriptions:
// - Student(String name, int id, int age): constructor that initializes a Student object with a name, ID, and age
// - String getName(): returns the student's name
// - int getId(): returns the student's ID
// - int getAge(): returns the student's age
// - void setName(String name): sets the student's name to the given value
// - void setId(int id): sets the student's ID to the given value
// - void setAge(int age): sets the student's age to the given value
//********************************************************************


package test;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
