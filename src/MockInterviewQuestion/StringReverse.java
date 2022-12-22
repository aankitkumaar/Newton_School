package MockInterviewQuestion;

public class StringReverse {
    public static void main(String[] args) {
        String str = "shivam";
        int n=13;
        //System.out.println(str.substring(0,5));
        //System.out.println(str.charAt(str.length()-1));
        int lenght = n%str.length();
        for (int i = 0; i < lenght; i++) {
            str = str.charAt(str.length()-1)+str.substring(0,5);
        }
        System.out.println(str);
    }
}
