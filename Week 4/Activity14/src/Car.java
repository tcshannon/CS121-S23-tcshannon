//******************************************************************
// Activity 14 part 2 of 2
// Name: Tyler Shannon
// Date: 2/20/23
//******************************************************************
// This class represents a car, and has four instance variables:
// make, model, year, and mileage. There are three overloaded
// constructors: a default constructor, a constructor with one
// parameter for the make of the car, and a constructor with four
// parameters for all the instance variables. There are also getter
// and setter methods for each instance variable, and two overloaded
// methods for driving the car (one with no parameters and one with a
// distance parameter). To use the Car class, create an instance of
// the class using one of the constructors, and call its methods as
// needed.
//******************************************************************

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    public Car(String make) {
        this.make = make;
        this.model = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println("The " + make + " " + model + " is driving!");
    }

    public void drive(int distance) {
        mileage += distance;
        System.out.println("The " + make + " " + model + " has driven " + distance + " miles.");
    }
}
