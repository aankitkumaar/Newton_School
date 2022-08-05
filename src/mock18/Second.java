package mock18;


import java.util.Scanner;

//Problem 2; Given an integer, write a recursive function that returns true if the given number is
//        palindrome, else false. For example, 12321 is a palindrome, but 1451 is not a palindrome.
//        Assume input as integer.
public class Second {
    public static void main(String[] args) {
//        Scanner ob = new Scanner(System.in);
//        String str= ob.nextLine();
        String str = "12321";

        if (check(str, 0, str.length() - 1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //12321
    static boolean flag = false;

    static boolean check(String str, int start, int end) {
        if (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                flag = true;
                return check(str, start + 1, end - 1);
            }
            else
            {
                return false;
            }
        }
        return flag;

    }
}


