//**************************************************************
// Activity 26 - selection, insertion, & quick sort
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This class contains methods to sort an array of integers using
// one of three sorting algorithms: selection sort, insertion sort,
// or quicksort. The getArray() method allows the user to enter 5
// unsorted integers, which are returned as an array. The sortArray()
// method takes an array and an algorithm name as parameters, sorts
// the array using the specified algorithm, and returns the sorted
// array.
//*****************************************************************


import java.util.Scanner;

public class Sorting {

    public int[] getArray() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 unsorted integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] sortArray(int[] arr, String algorithm) {
        if (algorithm.equals("selection")) {
            selectionSort(arr);
        } else if (algorithm.equals("insertion")) {
            insertionSort(arr);
        } else if (algorithm.equals("quick")) {
            quickSort(arr, 0, arr.length - 1);
        } else {
            System.out.println("Invalid algorithm.");
        }
        return arr;
    }

    private void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    private void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
