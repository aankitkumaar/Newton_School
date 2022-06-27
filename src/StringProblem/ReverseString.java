package StringProblem;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ANKIT";
        String rev="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rev = c+rev;
        }
        System.out.println(rev);
    }
}
