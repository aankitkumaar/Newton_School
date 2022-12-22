package Adv_DSA_Batch;

public class mentorquestion {
    public static void main(String[] args) {
        int[] arr = {8,4,2,1};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n ; i++) {
            int left = i+1;
            int right = i+2;
            while(right<n)
            {
                if(arr[i]>arr[left] && arr[left]>arr[right]) count++;
                right++;
            }
            //left++;
        }
        System.out.println(count);

    }
}




//        int A[]= {8,4,2,1};
//        int count=0;
//        for(int j=1;j<A.length-1;j++)
//
//        {
//            int icount=0;
//            int jcount=0;
//            for (int i = j-1; i >= 0; i--) {
//                if (A[i] > A[j]) {
//                    icount++;
//                }
//            }
//            for (int k = j+1; k < A.length; k++) {
//                if(A[j]>A[k])
//                {
//                    jcount++;
//                }
//            }
//            count+= icount*jcount;
//        }
//        System.out.println(count);
//    }}