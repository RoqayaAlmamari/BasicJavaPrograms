package StackClasses;

import java.util.Stack;

public class BraceValidator3 {
    public static boolean validate(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '{') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{";
        boolean isValid = validate(input);

        System.out.println(isValid);
    }
}
