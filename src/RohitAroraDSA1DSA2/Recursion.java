package BatchMarch;

import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();


//        int ans=fact(n);
//        if(ans==-1)
//        {
//            System.out.println("Invalid input");
//        }
//        else {
//            System.out.println(ans);
//        }

      //  System.out.println(sumOfNNaturalNumber(n));


        String str="aaaabb   ddd";

        System.out.println(cleanMyString(str));

//        Recursion obj=new Recursion();
//
//        System.out.println(obj.countPairs(str));

    }


    // a b a b b c d d ->a+ b+ a + b+ c + d
    //a+ b+ a + b+ c + d
    //b+ a + b+ c + d
    // a + b+ c + d
    //b+ c + d
    // b+ c + d
    // c + d
    // d


    // rohit
    // ohit

    // aaaabb   ddd


    //
    public static String cleanMyString(String str){

        if(str.length()<=1){
            return str;
        }

        if(str.charAt(0)==str.charAt(1)) {
            return cleanMyString(str.substring(1));
        }
        else{
            return str.charAt(0)+cleanMyString(str.substring(1));
        }
    }

    // 2
    //2
    // 1+ 1
    // 1
    //1
    // 1+ 0
// str= rohit
    // str.substring(3)
    // it
    public int countPairs(String str) {

        if(str.length()<=2){
            return 0;
        }

        if(str.charAt(0)==str.charAt(2)){
            return 1+countPairs(str.substring(1));
        }
        else{
            return countPairs(str.substring(1));
        }
    }
    // 6=?1+2+3..+6

    public static int sumOfNNaturalNumber(int n){

        if(n==0)
            return 0;
        else{
            return n + sumOfNNaturalNumber(n - 1);
        }
    }


    public static int fact(int n){// we will get input >=0

        if(n<0){
            return -1;
        }

        if(n==0 || n==1) {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
