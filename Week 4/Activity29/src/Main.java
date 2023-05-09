//**************************************************************
// Activity 29 - generics part 1 of 2
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// WIP
// This program demonstrates the use of a generic method in Java
// which takes an ArrayList of any type and prints all the elements
// in the ArrayList. It creates an instance of the `GenericMethods`
// class and initializes 4 different types of ArrayLists (Integer,
// String, Double, Boolean) using the `Arrays.asList()` method. The
// `printArrayList()` method is called on each of them using the
// `GenericMethods` instance. The program demonstrates the use of
// generics in Java.
//*****************************************************************

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GenericMethods gm = new GenericMethods();

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(3.14, 1.618, 2.718));
        ArrayList<Boolean> boolList = new ArrayList<>(Arrays.asList(true, false, true, true));

        gm.printArrayList(intList);
        gm.printArrayList(strList);
        gm.printArrayList(doubleList);
        gm.printArrayList(boolList);
    }
}