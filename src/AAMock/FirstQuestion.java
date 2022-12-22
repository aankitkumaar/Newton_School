package AAMock;



//Given an integer, write a recursive function that returns true if the given number is palindrome,
// else false. For example, 12321 is a palindrome, but 1451 is not a palindrome. Assume input as integer.
public class FirstQuestion {
    public static void main(String[] args) {
        String str = "1231";
        int left= 0;
        int right = str.length()-1;
        System.out.println(check(str,left,right));
    }
    static public boolean  check(String str,int left,int right)
    {
       // if(str.length()==0 || str.length()==1) return  true;

        if(left==right) return true;

        if(str.charAt(left)!=str.charAt(right)) return false;

       if(left<(right+1)) return check(str,left+1,right-1);

        return true;

    }
}
