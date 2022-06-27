package RohitAroraDSA1DSA2;

import java.util.Scanner;

public class TowerOfHanoi {

    public static int count=0;

    public static void toh(int n,char initialRod,char finalRod,char helperRod){// 1
        if(n==0)
            return;
        toh(n-1,initialRod,helperRod,finalRod);
        System.out.println("Move disk "+n+" from "+ initialRod +" to "+ finalRod);
        count++;
        toh(n-1,helperRod,finalRod,initialRod);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'a','c','b');
        System.out.println(count);
    }
}
