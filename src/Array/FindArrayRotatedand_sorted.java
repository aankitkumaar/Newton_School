package Array;

public class FindArrayRotatedand_sorted {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int l = 0, r = arr.length - 1;
        int k = 6;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (arr[mid] == k) {
                System.out.println(mid);
            }
            if (arr[l] <= arr[mid]) {
                if (k > arr[mid] || k < arr[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (k < arr[mid] || k > arr[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
    }
}
