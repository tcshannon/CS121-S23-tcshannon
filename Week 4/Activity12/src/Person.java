//**************************************************************
// Activity 12 part 2 of 3
// Name: Tyler Shannon
// Date: 2/30/23
//***************************************************************
// This program defines a Person class that contains information
// about a person such as their name, age, occupation, and
// employment status. It also includes a method to print the
// person's details. The class can be used to instantiate
// objects of a person.
//*****************************************************************
//*******************************************************************
// Person::printDetails()
// Parameters: None
// Prints the person's details such as their name, age,
// occupation, and employment status.
// Return Value: None
//********************************************************************

// Class 1: Person
class Person {
    // instance variables
    String name;
    int age;
    String occupation;
    boolean isEmployed;

    // constructor
    public Person(String name, int age, String occupation, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.isEmployed = isEmployed;
    }

    // method to print person's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Employed: " + isEmployed);
    }
}