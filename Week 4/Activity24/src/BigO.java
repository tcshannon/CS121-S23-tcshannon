//**************************************************************
// Activity 24 - big o part 1 of 2
// Name: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// This program defines the BigO class with three methods to
// demonstrate the time complexities of O(1), O(n), and O(n^2).
// The printOnce() method prints a parameter value in constant
// time. The printNTimes() method prints a phrase n times in
// linear time. The printNSquaredTimes() method prints a phrase
// n^2 times in quadratic time.
//*****************************************************************

public class BigO {

    public void printOnce(Object obj) {
        System.out.println(obj);
    }

    public void printNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Printing " + (i+1) + " out of " + n + " times.");
        }
    }

    public void printNSquaredTimes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Printing " + (i*n + j + 1) + " out of " + (n*n) + " times.");
            }
        }
    }
}

