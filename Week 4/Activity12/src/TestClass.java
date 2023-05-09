//**************************************************************
// Activity 12 part 1 of 3
// Name: Tyler Shannon
// Date: 2/30/23
//***************************************************************
// This program tests the Person and Book classes by
// instantiating objects of each class and calling their
// respective methods to print their details. It demonstrates
// how to use the classes to create objects and access their
// methods.
//*****************************************************************

// Test class
public class TestClass {
    public static void main(String[] args) {
        // instantiate Person class
        Person person1 = new Person("John Doe", 35, "Engineer", true);
        // call method to print person's details
        person1.printDetails();

        // instantiate Book class
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281, true);
        // call method to print book details
        book1.printDetails();
    }
}