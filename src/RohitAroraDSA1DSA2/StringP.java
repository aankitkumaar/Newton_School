package BatchMarch;

import java.util.Locale;

public class StringP {

    public static void main(String[] args) {
//        String str="Ne  w ton"; //->8
//        char c=str.charAt(2);
//        int asciiOfc=(int)c;
//
//        System.out.println(asciiOfc);
//        System.out.println((int)'\n');
//
//        System.out.println((char)201);

// https://www.asciitable.com/



        // a to z -> 97 to 122
        // A to Z -> 65 to 90

        // string duplicate characters  a to z
        // 0 to 25
        // arr[c-97]+=1
        // 000000...0

        // hasmap char,count

        // various methods of use

        // charAt -> tell the character at a particular index

        String str="welcome";

        // 100-> welcome tp  // space optimize
        // 1-> changed again
        System.out.println(str.charAt(4));
        String str2=" to newton SCHOOL";
        str=str.concat(str2);
        System.out.println(str);

        System.out.println(str.equals(str2));

        System.out.println(str.length());

        str=str.replace('w','x');// immutable
        System.out.println(str);

        // substring

        str=str.substring(2);
        System.out.println(str);
//        str=str.substring(3,7);
//        System.out.println(str);

        str=str.toLowerCase();
        System.out.println(str);

//        str=str.toUpperCase();
//        System.out.println(str);

       // System.out.println(str.contains("SCHOOL"));

        // chatAt

        System.out.println(str.lastIndexOf('c',14));
        // welcome // wecome
        // rahit  mahit
        // find index of a


// s.substring(0,4) + s.substring(6,n)


    }
}
