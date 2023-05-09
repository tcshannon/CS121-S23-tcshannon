//**************************************************************
// Activity 20 - Abstract and Interfaces
// Name: Tyler Shannon
// Date: 3/15/23
//***************************************************************
// This file defines another class that implements the Interface
// and provides an implementation for the calculate method.
//*****************************************************************
//*******************************************************************
// Class2::calculate(int x, int y)
// Parameters: x - an integer value
//             y - an integer value
// Returns: an integer value
// This method implements the calculate method defined in the
// Interface. It takes two integers as input and returns
// their quotient.
//********************************************************************

package interfaces;

public class Class2 implements Interface {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
