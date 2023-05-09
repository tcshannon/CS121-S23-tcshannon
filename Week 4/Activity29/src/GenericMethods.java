//*******************************************************************
// Activity 29 - generics part 2 of 2
// Name: Tyler Shannon
// Date: 4/22/23

// GenericMethods::printArrayList(ArrayList<T> arrList)
// Parameters: arrList - an ArrayList of any type
//
// This method takes an ArrayList of any type and prints out all its elements.
//********************************************************************


import java.util.ArrayList;

public class GenericMethods {

    public <T> void printArrayList(ArrayList<T> arrList) {
        for (T element : arrList) {
            System.out.println(element);
        }
    }
}
