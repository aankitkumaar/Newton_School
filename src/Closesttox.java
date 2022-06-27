import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Closesttox
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        long[] arr= new long[n];
        long[] arr1= new long[n];

        int i,j;
        long c=0,diff=0,a=0,sum=0;
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        //int x= br.nextInt();

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               // c=Math.abs((arr[i]+arr1[j])-x);
                if(i==0 && j==0){
                //    a=Math.abs((arr[0]+arr1[0])-x);
                }
                if(c<a){
                    a=c;

                }
            }
        }
        System.out.print(a+" ");
    }
}