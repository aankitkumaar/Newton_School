package BatchMarch;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static void printNextGreaterElements(int arr[], int n){

        for(int i=0;i<n;i++){
            int nge=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    nge=arr[j];
                    break;
                }
            }
            System.out.print(nge+" ");
        }
    }

 //   12 11 10 9 8 7 6 5 4 3 100

    // 12 11 10 9 8 7
   // n 2n 3n ~ n

    // 4 5 2 25
//            c
    // stack ->  25
    //          p=5

    // 4->5
    // 2->25
    // 5->25
    // 25->-1

    public static void printNextGreaterElementsUsingStack(int arr[],int n){
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        int popped;


        for(int i=1;i<n;i++){
            int curr=arr[i];

            popped=stack.pop();
            while(popped<curr){
                System.out.println(popped + "->  "+ curr);
                if(stack.isEmpty())
                    break;
                popped=stack.pop();
            }
            if(popped>curr){
                stack.push(popped);
            }
            stack.push(curr);
        }


        while(!stack.isEmpty()){
            System.out.println(stack.pop() + "->  "+ "-1");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printNextGreaterElements(arr,n);
        System.out.println();
        printNextGreaterElementsUsingStack(arr,n);

    }
}
