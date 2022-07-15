package LinkedlistProblem;

import java.util.Stack;

public class BalancedExpresion {
    public static void main(String[] args) {
        String str = "({{[}})";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
                continue;
            }

           /* if(stack.empty())
            {
                System.out.println("Not balanced");
            }*/

            char popeditem = stack.pop();

            switch (c)
            {
                case ')':
                    if(popeditem == '{' || popeditem == '[')
                        System.out.println("Not balanced");
                         break;

                case '}':
                    if(popeditem == '(' || popeditem == '[')
                        System.out.println("Not balanced");
                    break;

                case ']':
                    if(popeditem == '{' || popeditem == '(')
                        System.out.println("Not balanced");
                    break;

            }
        }
       // System.out.println(stack);

        if(stack.empty())
        {
            System.out.println("Yes it is Balanced");
        }


    }



}
