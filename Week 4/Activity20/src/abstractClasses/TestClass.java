//**************************************************************
// Activity 20 - Abstract and Interfaces
// Name: Tyler Shannon
// Date: 3/15/23
//***************************************************************
// This file defines another subclass of AbstractClass that
// implements the calculate method.
//*****************************************************************
//*******************************************************************
// Subclass2::calculate(int x, int y)
// Parameters: x - an integer value
//             y - an integer value
// Returns: an integer value
// This method implements the calculate method defined in the
// AbstractClass. It takes two integers as input and returns
// their product.
//********************************************************************

package abstractClasses;

public class TestClass {
    public static void main(String[] args) {
        Subclass1 s1 = new Subclass1();
        Subclass2 s2 = new Subclass2();

        System.out.println(s1.calculate(2, 3)); // should print 5
        System.out.println(s2.calculate(2, 3)); // should print 6
    }
}
