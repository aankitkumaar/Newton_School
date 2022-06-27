package StringProblem;

public class PalindroneSeconDMethod {
    public static void main(String[] args) {
        String str = "ANKNA";
        boolean flag = true;
        int i=0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
              flag = false;
            }
            i++;
            j--;
        }
        if(flag==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(str.length());
        System.out.println(str.charAt(4));
    }
}
