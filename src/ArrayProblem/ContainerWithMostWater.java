package ArrayProblem;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxwater = find(arr);
        System.out.println(maxwater);

    }
    public static int find(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        int maxarea = 0;
        while(left<right)
        {
            maxarea = Math.max(maxarea,(right-left)*Math.min(arr[left],arr[right]));

            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return  maxarea;
    }
}
