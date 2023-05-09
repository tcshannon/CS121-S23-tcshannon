//**************************************************************
// Activity 26 - selection, insertion, & quick sort
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This class contains the main method that creates an instance of
// the Sorting class, calls the getArray() method to get an array of
// unsorted integers from the user, prints the unsorted array,
// calls the sortArray() method to sort the array using the quicksort
// algorithm, and prints the sorted array.
//*****************************************************************


public class Main {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] unsortedArray = sorting.getArray();
        System.out.println("Unsorted array: ");
        printArray(unsortedArray);
        int[] sortedArray = sorting.sortArray(unsortedArray, "quick");
        System.out.println("Sorted array: ");
        printArray(sortedArray);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
