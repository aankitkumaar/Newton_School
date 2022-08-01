package MockInterviewQuestion;


import java.util.*;
/*Given a string that consists of ‘(' and ‘)’ characters, find the maximum length sub-string with valid parenthesis.
        input: ()()()(((((())))*/

public class newMockFirst {
    public static void main(String[] args) {
        String str = "()()()()))(()())";
        int n = str.length();
        System.out.println(helper(str,n));

    }

    static int helper(String str, int n)
    {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {

            char temp = str.charAt(i);


            if(temp == '(') {
                stack.push(temp);
                //count++;
                continue;
            }

            //char temp1 = stack.pop();

            if(temp==')') {
                if (stack.peek() == '(') {
                    stack.pop();
                    count++;
                }
                else {
                    count=0;
                }
            }


        }
        return count*2;


    }
}
