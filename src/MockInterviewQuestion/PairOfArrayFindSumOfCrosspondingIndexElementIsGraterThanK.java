package MockInterviewQuestion;

public class PairOfArrayFindSumOfCrosspondingIndexElementIsGraterThanK {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 6, 5, 7};
        int[] arr2 = {5, 8, 2, 1, 4, 6};
        int k = 100;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]+arr2[i]>=k)
            {System.out.println("Yes"); break;}
            if(i==arr1.length-1) System.out.println("No");
        }

    }
}
