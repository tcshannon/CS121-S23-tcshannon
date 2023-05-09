//**************************************************************
// Activity 20 - Abstract and Interfaces
// Name: Tyler Shannon
// Date: 3/15/23
//***************************************************************
// This file contains a test class for the interfaces package.
// It instantiates Class1 and Class2, calls their calculate
// methods, and prints the results.
//*****************************************************************
//*******************************************************************
// TestClass::main(String[] args)
// Parameters: args - an array of command-line arguments (unused)
// This method instantiates Class1 and Class2, calls their
// calculate methods with two integer arguments, and prints the
// results.
//********************************************************************

package interfaces;

public class TestClass {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        System.out.println(c1.calculate(2, 3)); // should print 5
        System.out.println(c2.calculate(2, 3)); // should print 6
    }
}
