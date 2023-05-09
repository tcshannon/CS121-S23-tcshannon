//******************************************************************
// Activity: 14 part 1 of 2
// Name: Tyler Shannon
// Date: 2/20/23
//******************************************************************
// This program demonstrates the use of overloaded constructors and
// methods in Java. The Car class has four instance variables, three
// overloaded constructors, and two overloaded methods. The Main class
// creates three instances of the Car class using each of the three
// constructors, calls the two overloaded methods using one of the
// instances, and prints out the updated mileage values of the instances.
// To run the program, compile and run the Main class.
//******************************************************************

public class Main {
    public static void main(String[] args) {
        // Create instances of the Car class using each of the 3 constructors
        Car car1 = new Car();
        Car car2 = new Car("Honda");
        Car car3 = new Car("Ford", "F-150", 2010, 50000);

        // Use an instance to call both the overloaded methods
        car2.drive();
        car3.drive(100);

        // Print out the updated mileage values
        System.out.println("Car 2 mileage: " + car2.getMileage());
        System.out.println("Car 3 mileage: " + car3.getMileage());
    }
}
