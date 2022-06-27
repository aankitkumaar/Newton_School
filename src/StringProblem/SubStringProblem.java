package StringProblem;

public class SubStringProblem {
    public static void main(String[] args) {
        String str1 = "Ankit";
        String str2 = "Kumar";
        str1 = str1+str2;
        //str2 = str2+str1;

        //System.out.println(str1);
        str2= str1.substring(0,5);
        System.out.println(str2);
        //str2 = str2+str1;
        str1 = str1.substring(5,10);
        System.out.println(str1);

    }
}
