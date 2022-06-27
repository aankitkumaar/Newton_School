package BatchMarch;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int charIntVal= str.charAt(i)-'0';
            sum=sum+charIntVal;
        }

        if(sum%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
