//**************************************************************
// Activity 32 part 2 of 3
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program is an extension of BalancedBrackets that checks if a string has
// balanced parentheses, curly braces, and square brackets. It uses the same
// algorithm as BalancedBrackets but with added checks for the other bracket types.
//*****************************************************************

package stackBrackets;

import java.util.Stack;

public class BalancedAllBrackets {
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return "unbalanced";
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return "unbalanced";
                }
            }
        }
        if (stack.empty()) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
