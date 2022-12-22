import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Test
{
    public static void main(String[] args) throws IOException {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
       // int n = tc;
        String[][] arr = new String[tc][5];
        for (int i = 0; i < tc; i++)
        {
            String temp = br.readLine();
            //int size = temp.length();
            arr[i] = temp.split(",");
            System.out.println(Arrays.toString(arr[i]));
        }
        String checkitem = br.readLine();
        String item = br.readLine();
//        int index = 0;
//        if(checkitem.equals("bank_acount_number")) index = 0;
//        if(checkitem.equals("account_holder_first_name")) index = 1;
//        if(checkitem.equals("account_holder_last_name")) index = 2;
//        if(checkitem.equals("registred_number")) index = 3;
//        if(checkitem.equals("branch_code")) index = 4;
        String result = "";
        for(String[] entry : arr)
        {
                for (int i = 0; i < entry.length; i++) {

//                    if(arr[i]);
                }
                System.out.println(result);
            }

        }
    }