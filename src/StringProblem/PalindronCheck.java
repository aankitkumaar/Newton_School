package StringProblem;

public class PalindronCheck {
    public static void main(String[] args) {
        String str = "ANKNAA";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            str1 = s + str1;
        }
        if (str.equals(str1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
