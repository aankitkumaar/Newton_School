package MockInterviewQuestion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FirstQuestionMock {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,4,5,2,3};
        int n = arr.length;
        int target = 10;

        ArrayList<ArrayList<Integer>> ans  = Find3Sumindex(arr,n,target);
        System.out.println(ans);

    }

   // static boolean flag = true;
    static ArrayList<ArrayList<Integer>> Find3Sumindex(int[] arr, int n , int target) {



        for (int i = 0; i < n; i++) {

            int leftSum = target - arr[i];
            int left = i +1;
            int right = n;
            ArrayList<Integer> temp = new ArrayList<>();
            int[] result_Form = helper(arr, leftSum, left, right);
            if (result_Form.length == 2) {
                temp.add(i);
                for (int entry : result_Form) {
                    temp.add(entry);
                }
                result.add(temp);
            }

        }

        return result;

    }

    public static int[] helper(int[] arr, int leftsum, int left, int right)
    {
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = left; i < right; i++) {
            int leftSum2 = leftsum-arr[i];
            if(map.keySet().contains(leftSum2))
            {
                return new int[] {
                map.get(leftSum2), i};

            }
            else
            {
                map.put(arr[i],i);
            }
            }

        return new int[0];

        }
    }
