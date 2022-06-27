package Dqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxNUmberInKConsecutiveUsingSlidingWindow {


    // 5 7 4 8  k=3
    // 5

    // 7 8 6 5 7   max

    public static void findMaxNumbersInKConsecutiveWindows(int arr[],int n,int k){
        int max;
        for(int i=0;i<=n-k;i++){
            max=arr[i];
            for(int j=1;j<k;j++){   // how many further elements u r comparing
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            System.out.print(max+ " ");
        }
    }
    //  <- ---  ---     --<-
    public static void findMaxNumbersInKConsecutiveWindowsUsingSlidingWindow(int arr[],int n,int k){

        Deque<Integer> deque=new LinkedList<>();

        for(int i=0;i<k;i++){

            while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
//[x c v    b n m a s d f g h ]
// 0 1 2    3
        for(int i=k;i<n;i++){
            System.out.print(arr[deque.peekFirst()]+" ");// for previous window

            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.print(arr[deque.peekFirst()]+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        findMaxNumbersInKConsecutiveWindows(arr,n,k);
        System.out.println();
        findMaxNumbersInKConsecutiveWindowsUsingSlidingWindow(arr,n,k);

    }

}









