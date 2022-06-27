package Adv_DSA_Batch.Contest;

//import java.util.Scanner;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Leaderboard {
    public static int binary(ArrayList<Integer> list , int x, int n){
        int l = 0, r = n-1;
        int ind = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(list.get(mid)==x) return mid;
            else if(list.get(mid)>x) {
                ind = mid;
                l = mid+1;
            }
            else r = mid-1;
        }
        return ind+1;
    }
    public static void main (String[] args) {
        // TreeSet<integer> rank = new TreeSet<>();
        //int min = -1, max = 10000009;
        Scanner s=  new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
            if(i==0) list.add(arr[i]);
            else if(arr[i]!=arr[i-1]) list.add(arr[i]);
        }
        int count =list.size();
        int m = s.nextInt();
        for(int i=0;i<m;i++){
            int t = s.nextInt();
            if(t<arr[n-1]){
                System.out.println(count+1);
            }
            else if(t==arr[n-1]) System.out.println(count);
            else if(t>=arr[0]) System.out.println("1");
            else{
                int ind = binary(list, t, list.size());
                System.out.println(ind+1);
            }
        }
    }
}