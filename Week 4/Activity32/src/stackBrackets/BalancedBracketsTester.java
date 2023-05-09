//**************************************************************
// Activity 32 part 1 of 3
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program tests the BalancedBrackets class by checking if strings have
// balanced brackets. It creates a new instance of BalancedBrackets and calls
// the checkBalance() method with different string inputs. The output is printed
// to the console.
//
// Extra credit part of this activity has been attempted.
//*****************************************************************

package stackBrackets;

public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets balanced = new BalancedBrackets();
        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));
        System.out.println(balanced.checkBalance("() )"));
        System.out.println(balanced.checkBalance(" ) ( )"));
    }
}
