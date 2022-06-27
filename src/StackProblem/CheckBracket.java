package StackProblem;

import java.util.Stack;

public class CheckBracket {
    public static boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
                continue;
            }
            //([{}])
            System.out.println(stack);

            if (stack.empty())
                return false;

            char temp1 = stack.pop();

            switch (temp) {
                case ')':
                    if (temp1 != '(')
                        return false;
                    break;

                case ']':
                    if (temp1 != '[')
                        return false;
                    break;

                case '}':
                    if (temp1 != '{')
                        return false;
                    break;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String str = "([{}])";

        System.out.println(isBalanced(str));
    }
}
