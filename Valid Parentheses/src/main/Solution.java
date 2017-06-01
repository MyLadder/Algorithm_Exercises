package main;

import java.util.Stack;

/**
 * Created by tanfujun on 9/8/16.
 */
public class Solution {

    public static void main(String args[]) {

    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                char current = s.charAt(i);
                stack.push(current);
            } else {
                char current = s.charAt(i);
                char top = stack.peek();
                boolean ispair = pair(top, current);
                if (ispair) {
                    stack.pop();
                } else {
                    stack.push(current);
                }

            }


        }

        return stack.isEmpty();

    }

    private boolean pair(char top, char current) {
        if (top == '(' && current == ')') {
            return true;
        } else if (top == '[' && current == ']') {
            return true;
        } else if (top == '{' && current == '}') {
            return true;
        }

        return false;
    }
}
