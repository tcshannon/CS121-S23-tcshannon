//**************************************************************
// Activity 25 - bubble & merge sort
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program contains a Sorting class and a Main class. The Sorting class contains
// methods for getting an unsorted array of integers from user input, sorting the array using
// Bubble Sort or Merge Sort algorithm, and returning the sorted array. The Main class uses
// the Sorting instance to call the Sorting methods and print the unsorted and sorted arrays.
//*****************************************************************
//*******************************************************************
// Sorting::getArray()
// Parameters: None
// This method gets 5 unsorted integers from the user, adds the integers to an array, and
// returns the unsorted array.
// Return value: int[] array of 5 unsorted integers

// Sorting::bubbleSort()
// Parameters: int[] arr - array of integers to be sorted
// This method implements the Bubble Sort algorithm to sort the array of integers.
// Return value: void

// Sorting::mergeSort()
// Parameters: int[] arr - array of integers to be sorted, int l - leftmost index of subarray,
// int r - rightmost index of subarray
// This method implements the Merge Sort algorithm to sort the subarray of integers.
// Return value: void

// Sorting::merge()
// Parameters: int[] arr - array of integers to be sorted, int l - leftmost index of subarray,
// int m - middle index of subarray, int r - rightmost index of subarray
// This method is a helper method for Merge Sort algorithm that merges two subarrays of
// arr[] into a single sorted subarray.
// Return value: void

// Sorting::sortArray()
// Parameters: int[] arr - array of integers to be sorted, String sortType - type of sorting algorithm
// This method calls either Bubble Sort or Merge Sort algorithm based on sortType parameter to sort
// the array of integers.
// Return value: int[] array of sorted integers

import java.util.Scanner;

public class Sorting {
    // Method to get an unsorted array from user input
    public int[] getArray() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Bubble Sort Algorithm
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Merge Sort Algorithm
    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Method to call Bubble Sort or Merge Sort based on user input
    public int[] sortArray(int[] arr, String merge) {
        if (sortType.equalsIgnoreCase("bubble")) {
            bubbleSort(arr);
        } else if (sortType.equalsIgnoreCase("merge")) {
            mergeSort(arr, 0, arr.length-1);
        } else {
            System.out.println("Invalid sorting algorithm");
        }
        return arr;
    }
}
