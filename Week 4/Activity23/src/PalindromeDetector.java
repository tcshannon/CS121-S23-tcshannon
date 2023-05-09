//**************************************************************
// Activity 23 - recursion
// Name: Tyler Shannon
// Date: 3/20/23
//***************************************************************
// WIP
// This program contains the PalindromeDetector class, which
// implements a method to determine whether a given string is
// a palindrome using recursion. The main method demonstrates
// the use of the isPalindrome() method. To run the program,
// compile and run the PalindromeDetector.java file with no
// arguments. The program prompts the user for a string to test.
//*****************************************************************
//*******************************************************************
// PalindromeDetector::isPalindrome(String s)
// Parameters: String s - the string to check for palindrome
// Returns: boolean - true if s is a palindrome, false otherwise
// This method uses recursion to check if a given string s is
// a palindrome, i.e. it reads the same forwards and backwards.
// It compares the first and last characters of s, and if they
// match, recursively calls itself with the substring between
// them. If they don't match, it returns false. If the length
// of s is 0 or 1, it returns true.
//*******************************************************************
// As for the time complexity of this program, it is O(n) where n
// is the length of the string. This is because the isPalindrome()
// method recursively calls itself for each pair of characters in
// the string, checking if they are equal, until it reaches the middle
// of the string. Therefore, the number of recursive calls is
// proportional to the length of the string.
//********************************************************************


public class PalindromeDetector {

    public static boolean isPalindrome(String s) {
        // TODO: Implement recursion to determine if s is a palindrome
        boolean isPalindrome;(String) {
            if (s.length() <= 1) {
                return true;
            }
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            if (first == last) {
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        String s = "racecar";
        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

}
