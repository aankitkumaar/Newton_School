package RohitAroraDSA1DSA2;

import java.util.Scanner;

public class BitMani {

    //26->     11010   & 00001  -> 00000
    //27->      11011   & 00001  -> 00001

    public static boolean checkOddEven(int x){
        if((x&1)==0)
            return true;
        return false;
    }

    // 101010010101  4->
    // 122-> 1111010 -> 3rd bit -> true
    //        543210


    //1111010  & 0001000 -> 0000000 ->0
    //158 -> 10011110 & (00001000) -> 00001000
    public static boolean checkIfNthBitSet(int x,int n){
        if((x&(1<<n))>0) {
            return true;
        }
        return false;
    }


   // 158 -> 10011110 | 00100000   ->5
    // 10111110 -> 190
    public static int setMyNthBit(int x,int n){
        return x | (1<<n);
    }


    // 158 -> 10011110  &     11101111 -> 4
    // 10001110 -> 142
    public static int unSetMyNthBit(int x,int n){
        return x & ~(1<<n);
    }

    public static int toggleMyNthBit(int x,int n){
        return x ^ (1<<n);
    }
// 1->on 0->off

    // 157 -> 10011100
    //156
    public static int turnOffRightmostBit(int x){
        //return (x>>1)<<1;

        return x & (x-1);
    }

    // 158 -> 10011111 | 10100000

    // even-> righmost 0
    // odd -> righmost 1
    public static int turnOnRightmostBit(int x){
        return x | 1;

        //return x | (x+1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

      //  System.out.println(checkOddEven(x)); // true->even , otherwise -> false

        int n=sc.nextInt();
      //  System.out.println(checkIfNthBitSet(x,n)); // true-> set 1 , otherwise false

      //  System.out.println(setMyNthBit(x,n));

     //   System.out.println(unSetMyNthBit(x,n));

     //   System.out.println(toggleMyNthBit(x,n));

     //   System.out.println(turnOffRightmostBit(x));

        System.out.println(turnOnRightmostBit(x));
    }
}
