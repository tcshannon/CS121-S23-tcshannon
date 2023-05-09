//**************************************************************
// Activity 20 - Abstract and Interfaces
// Name: Tyler Shannon
// Date: 3/15/23
//***************************************************************
// This file defines a subclass of AbstractClass that implements
// the calculate method.
//*****************************************************************
//*******************************************************************
// Subclass1::calculate(int x, int y)
// Parameters: x - an integer value
//             y - an integer value
// Returns: an integer value
// This method implements the calculate method defined in the
// AbstractClass. It takes two integers as input and returns
// their sum.
//********************************************************************

package abstractClasses;

public class Subclass1 extends AbstractClass {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
