package AAMock;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;


//00110101
//
//3

public class FindCountInBinaryString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();

        System.out.println(helper(str));
    }

    static int helper(String str)
    {
        int count=0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp=='0')
            {
                stack.push(temp);
            }
            else
            {
                stack.pop();
            }
            if(stack.empty())
            {
                count++;
            }

        }
        return count;

    }
}

