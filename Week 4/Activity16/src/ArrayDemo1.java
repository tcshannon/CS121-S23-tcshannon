//**************************************************************
// Activity 16 part 1 of 3
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


public class ArrayDemo1 {
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

                {{{49, 50}, {51, 52}, {53, 54}},
                        {{55, 56}, {57, 58}, {59, 60}},
                        {{61, 62}, {63, 64}, {65, 66}},
                        {{67, 68}, {69, 70}, {71, 72}}}};

        // Print arr1 using for-each loop
        for (int[][][] dim1 : arr1) {
            for (int[][] dim2 : dim1) {
                for (int[] dim3 : dim2) {
                    for (int i : dim3) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        // Print arr2 using regular for loop
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2[0][0].length; k++) {
                    for (int l = 0; l < arr2[0][0][0].length; l++) {
                        System.out.print(arr2[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
