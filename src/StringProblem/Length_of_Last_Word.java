package StringProblem;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "Ankit kumarytht";
        String[] arr = s.split(" ");
        String[] arr2 = s.trim().split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
