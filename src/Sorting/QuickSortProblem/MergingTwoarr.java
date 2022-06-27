package Sorting.QuickSortProblem;

import java.util.Arrays;

public class MergingTwoarr {
    public static void main(String[] args) {
       int nums1[] = {1,2,3,0,0,0};
       int nums2[] = {2,5,6};
       int n= 3;
       int m = 3;
        merge(nums1, m, nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            // public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0;
            int j=0;
            int k=0;
            int arr[] = new int[m];
            for (int p = 0; p < m; p++) {
                arr[p] = nums1[p];
            }
            System.out.println(Arrays.toString(arr));
            //int arr[] = new int[n+m];
            while(i<m && j<n)
            {
                if(arr[i]<= nums2[j])
                {
                    nums1[k] = arr[i];
                    i++;
                }
                else {
                   // nums1[i+1] = nums1[i];
                    nums1[k] = nums2[j];
                    j++;
                }
                k++;
            }
         while(i<m)
         {
             nums1[k] = arr[i];
             i++;
             k++;

         }
            while(j<n)
            {
                nums1[k] = nums2[j];
                j++;
                k++;
            }

            //nums1 = arr;
        }
    }
