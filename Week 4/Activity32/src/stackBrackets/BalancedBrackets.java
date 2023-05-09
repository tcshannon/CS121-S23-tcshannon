//**************************************************************
// Activity 32 part 3 of 3
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This program checks if a string has balanced brackets. It uses a stack to
// loop through the string and push opening brackets to the stack and pop the top
// of the stack for closing brackets. If the stack is empty at the end of the loop,
// the brackets are balanced. Otherwise, the brackets are unbalanced.
//*****************************************************************

package stackBrackets;

import java.util.Stack;

public class BalancedBrackets {
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
