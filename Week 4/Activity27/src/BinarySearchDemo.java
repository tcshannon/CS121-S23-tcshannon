//**************************************************************
// Activity 25 - Binary Search Algorithm with ArrayLists
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program demonstrates the use of the binary search algorithm
// to search for an element in an ArrayList. The program first
// creates an ArrayList of integers, sorts it in ascending order,
// and then searches for a target element using the binary search
// algorithm. The program outputs the index of the target element
// if it is present in the ArrayList, or "Element not present"
// otherwise.
//
// To run the program, compile and run the BinarySearchDemo class.
// No additional input is required.
//*****************************************************************
// FOR ALL METHODS IN THIS CLASS:
// Parameters:
// - arr: the ArrayList to search in
// - x: the target element to search for
//
// Returns:
// - the index of the target element if found, or -1 if not found
//********************************************************************


import java.util.ArrayList;

public class BinarySearchDemo {

    public static int binarySearch(ArrayList<Integer> arr, int x) {
        int left = 0, right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == x) {
                return mid;
            }

            if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 4, 10, 40));
        int x = 10;

        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
