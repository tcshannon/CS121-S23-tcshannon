//*******************************************************************
// Activity 17
// Name: Tyler Shannon
// Date: 3/1/23
// *********************************
// This program demonstrates the use of ArrayLists in Java by
// creating a class StringArrayList that has methods to add and
// remove strings from an ArrayList, get the size of the list, and
// get an element by index. The class also has a method to display
// the list elements using both the for-each loop and the regular
// for loop. A test class is included to run all of the methods.
//********************************************************************
//*******************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// Parameters: List them here and comment
// A discussion of what the method/function does and required
// parameters as well as return value.
//********************************************************************


package stringArrayList;

import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> strings;

    public StringArrayList() {
        strings = new ArrayList<>();
    }

    public void add(String string) {
        strings.add(string);
    }

    public void remove(int index) {
        strings.remove(index);
    }

    public int size() {
        return strings.size();
    }

    public String get(int index) {
        return strings.get(index);
    }

    public void display() {
        // using the for-each loop
        System.out.println("Using the for-each loop:");
        for (String s : strings) {
            System.out.println(s);
        }

        // using the regular for loop
        System.out.println("Using the regular for loop:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
