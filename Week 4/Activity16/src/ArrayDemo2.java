//**************************************************************
// Activity 16 part 2 of 3
// Name: Tyler Shannon
// Date: 3/1/23
//
// This program demonstrates two different methods for declaring and
// initializing 4-dimensional arrays of integers. The program then
// prints the elements of these arrays to the console using both
// for-each loop and regular for loop.
//
// To run the program, simply compile and execute it. No input
// or output files are needed.
//
//*****************************************************************

public class ArrayDemo2 {
    public static void main(String[] args) {
        // Method 1 for declaration and initialization
        int[][][][] arr1 = new int[3][4][3][2];

        // Method 2 for declaration and initialization
        int[][][][] arr2 = {{{{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}},
                {{13, 14}, {15, 16}, {17, 18}},
                {{19, 20}, {21, 22}, {23, 24}}},

                {{{25, 26}, {27, 28}, {29, 30}},
                        {{31, 32}, {33, 34}, {35, 36}},
                        {{37, 38}, {39, 40}, {41, 42}},
                        {{43, 44}, {45, 46}, {47, 48}}},
        }
        ;
    }
}