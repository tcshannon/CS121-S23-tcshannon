//**************************************************************
// Activity 25 - Binary Search Algorithm with ArrayLists
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program tests the correctness of the binary search algorithm
// implemented in the BinarySearchDemo class. The program generates
// a random ArrayList of integers, sorts it using the built-in sort
// method, selects a target element at random, and calls the binary
// search method in BinarySearchDemo to search for the element. The
// program compares the expected result (the index of the target
// element in the sorted ArrayList) with the actual result returned
// by the binary search method. If the expected and actual results
// match, the test passes; otherwise, the test fails.
//
// To run the program, compile and run the BinarySearchTester class.
// No additional input is required.
//*****************************************************************
// FOR ALL METHODS IN THIS CLASS:
// Parameters: None
//
// Returns: None
//********************************************************************


import java.util.ArrayList;
import java.util.Random;

public class BinarySearchTester {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(100));
        }

        arr.sort(null);

        int x = arr.get(rand.nextInt(arr.size()));

        int expected = arr.indexOf(x);
        int actual = BinarySearchDemo.binarySearch(arr, x);

        System.out.println("Array: " + arr);
        System.out.println("Searching for: " + x);
        System.out.println("Expected result: " + expected);
        System.out.println("Actual result: " + actual);

        if (expected == actual) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
