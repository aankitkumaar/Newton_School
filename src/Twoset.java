import java.util.*;

public class Twoset {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n= ob.nextInt();
        int k= ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        int[] arr1 = twoSum(arr,k);
        System.out.println(Arrays.toString(arr1));

    }
       static public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int i=0; i<nums.length; i++)
            {
                int temp = target - nums[i];
                if(hm.keySet().contains(temp))
                {
                    return new int[] {hm.get(temp),i};
                }
                hm.put(nums[i],i);
            }
            return new int[0];
        }
    }
