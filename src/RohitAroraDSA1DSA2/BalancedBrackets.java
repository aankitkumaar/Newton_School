package RohitAroraDSA1DSA2;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character>  stack=new Stack<>(); // we will only push opening brackets
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
                continue;
            }
            if(stack.empty())
                return false;
            char popped=stack.pop(); // opening bracket
            switch (c){
                case ')' :
                    if(popped=='[' || popped=='{')
                        return false;
                    break;
                case '}' :
                    if(popped=='[' || popped=='(')
                        return false;
                    break;
                case ']' :
                    if(popped=='(' || popped=='{')
                        return false;
                    break;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String str="([{}])";
        String str1="[()]{}{[()()]()}";
        String str2="[()]";
        System.out.print(isBalanced(str2));

    }
}
