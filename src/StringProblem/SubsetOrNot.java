package StringProblem;

public class SubsetOrNot {
    public static void main(String[] args) {
        int arr[] = {1,6,3,2,7,8};
        int arr1[] = {1,2,7,77};
        int count=0;
                ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr[i] == arr1[j])
                {
                    count++;
            }
            }

        }
        if(count==arr1.length)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
