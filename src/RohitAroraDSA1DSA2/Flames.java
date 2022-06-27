package BatchMarch;

import java.util.Scanner;

public class Flames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        String ans[]=new String[6];
        ans[0]="Siblings";
        ans[1]="Friends";
        ans[2]="Love";
        ans[3]="Affection";
        ans[4]="Marriage";
        ans[5]="Enemy";

        int arr1[]=new int[26];
        int arr2[]=new int[26];

        for(int i=0;i<str1.length();i++){
            arr1[str1.charAt(i)-'a']++;
        }

        for(int i=0;i<str2.length();i++){
            arr2[str2.charAt(i)-'a']++;
        }

        int sum=0;

       // arr1= [2 , , , , ,1 , , , .1......... 1, , 1, , ]
        // arr2=[1 , ,1 , ,,1 ,           1    ...............]


        // a   - 5
        //     - 3        2
        for(int i=0;i<26;i++){
            sum=sum+Math.abs(arr1[i]-arr2[i]);
        }

        System.out.println(ans[sum%6]);

    }
}
