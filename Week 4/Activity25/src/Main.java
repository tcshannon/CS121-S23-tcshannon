//**************************************************************
// Activity 25 - bubble & merge sort
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// WIP
// This program creates an instance of Sorting class, uses the Sorting instance to call
// Sorting methods, and prints the unsorted and sorted arrays of integers.
//*****************************************************************
//*******************************************************************
// Main::main()
// Parameters: String[] args - command line arguments
// This method is the entry point of the program that creates an instance of Sorting class,
// gets an unsorted array of integers from user input, calls the Sorting method to sort the array,
// and prints the unsorted and sorted arrays of integers.
// Return value: void


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create an instance of Sorting class
        Sorting sortingObj = new Sorting();

        // get an unsorted array of integers from user input
        int[] unsortedArray = sortingObj.getArray();

        // print the unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));

        // call the Sorting method to sort the array
        int[] sortedArray = sortingObj.sortArray(unsortedArray, "merge");

        // print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}

