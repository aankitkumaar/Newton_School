import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        //String
        String s = new String("ANkit");
        int n=10;
        String[] arr = new String[10];
        arr[0]="aankit";
        arr[1] = "1";
        s ="s +happy";
        s ="hello";
        System.out.println(s.equalsIgnoreCase("hello"));
        for(String a:arr)
        System.out.print(a+" ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println(Arrays.toString(arr));
    }
}
