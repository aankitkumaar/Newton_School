package StringProblem;

public class Print1to100WithOutUsingNumbers {
    public static void main(String[] args) {
        int one = 'a' / 'a';
        // System.out.println(one);
        int last = ("**********".length()) * ("**********".length()); //100


        for (int i = one; i <= 'd'; i++) {
            System.out.print(i + " ");
        }


        for (int i = one; i <= last; i++) {
            System.out.print(i + " ");
        }
        int newString = "..........".length();

        String str1 = "Ankit";
        String str2 = "Kumar";
        int str2length = str2.length();

        int sstr1length = str1.length();

        str1 = str1 + str2;
        str2 = str1.substring(0,sstr1length);
        str1 = str1.substring(sstr1length,sstr1length+str2length);
        System.out.println();
        System.out.println(str1);
        System.out.println(str2);
    }
}

///'a'  -1000/1000
 //1
