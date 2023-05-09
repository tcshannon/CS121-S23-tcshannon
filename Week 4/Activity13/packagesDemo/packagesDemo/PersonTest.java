//**************************************************************
// Activity 13
// Name: Tyler Shannon
// Date: 2/20/23
// ***************************************************************
// This class tests the access modifiers of the Person class by creating
// a new instance of Person and calling its methods with different access
// modifiers. It demonstrates that public methods and variables can be
// accessed from any class, private methods and variables can only be
// accessed from the same class, protected methods and variables can be
// accessed from the same class and its subclasses, and default methods
// and variables can be accessed from the same package.
//********************************************************************
//*******************************************************************
// FOR ALL METHODS
// Parameters: none
// Return value: none
//********************************************************************

package packagesDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "123 Main St", "555-555-1234");

        // Testing public variables and methods
        System.out.println(person.name);  // Output: John Doe
        System.out.println(person.age);   // Output: 30
        person.setName("Jane Doe");
        System.out.println(person.getName());  // Output: Jane Doe

        // Testing private variables and methods
        // Uncommenting the following line will cause a compile error
        // System.out.println(person.address);
        // person.setAge(40);  // This line will also cause a compile error

        // Testing protected and default methods
        person.setAddress("456 Second St");
        System.out.println(person.getAddress());  // Output: 456 Second St
        person.setPhone("555-555-5678");
        System.out.println(person.getPhone());    // Output: 555-555-5678
    }
}
