//**************************************************************
// Activity 24 - big o part 2 of 2
// Name: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// This program creates an instance of the BigO class and calls
// its three methods to demonstrate time complexities. The
// printOnce() method prints a parameter value in constant time.
// The printNTimes() method prints a phrase n times in linear
// time. The printNSquaredTimes() method prints a phrase n^2
// times in quadratic time.
//*****************************************************************

public class Test {

    public static void main(String[] args) {
        BigO bigO = new BigO();

        // Test printOnce()
        bigO.printOnce("Hello World!"); // O(1)

        // Test printNTimes()
        bigO.printNTimes(5); // O(n)

        // Test printNSquaredTimes()
        bigO.printNSquaredTimes(3); // O(n^2)
    }
}
