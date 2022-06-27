package BatchMarch;

import java.util.*;

public class FindDuplicates {

    // Stack , Queue, LinkedList, Arraylist, vector, hasmap, hashtable, ...
    //  pop , push   enqueue dequeue

//    public static String fg(String[] words){
//
//    }

    public static void printDuplicateElements(int arr[],int n){

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        // 2 5 4 2 5 6 6 7 8 9 4 2

        // 2 5 2 4
        //Hm=>
        // 2->2
        // 5->1
        // 4->1

        boolean areDuplicatesPresent=false;
// 2 5 4 2 5 6 6 7 8 9
        for(int i=0;i<n;i++){   // 100
            if(map.containsKey(arr[i])){ // will check if key is present return true, otherwise false
                areDuplicatesPresent=true;
                count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> s:map.entrySet()){   // 100
            if(s.getValue()>1){

                System.out.println(s.getKey()+ " ");
            }
        }

        if(!areDuplicatesPresent){
            System.out.println("-1");
        }



    }

    public static void main(String[] args) {
        // if there will be no duplicates print -1
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printDuplicateElements(arr,n);

    }

}
