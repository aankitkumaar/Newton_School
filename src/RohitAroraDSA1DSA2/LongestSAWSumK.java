package BatchMarch;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSAWSumK {

    public static int lenOfLonSAWSumK(int arr[],int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;

        int ans=0;
        // k=10
// 0 1 2 3 4 5  6  7
//     56     56   66
        // 7-2=5
// 56->2
//
        for(int i=0;i<n;i++){

            sum=sum+arr[i];

            if(sum==k){
                ans=i+1;
            }


            if(!(hm.containsKey(sum))){
                hm.put(sum,i);
            }

            if(hm.containsKey(sum-k)){
                int len=(i-(hm.get(sum-k)));
                if(ans<len) {
                    ans = len;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long  t=sc.nextInt();

        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(lenOfLonSAWSumK(arr,n,k));
        }
    }
}
