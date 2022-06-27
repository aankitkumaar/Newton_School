package BatchMarch;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class GOGalaxy {

        public static boolean passedAllBuildings(int x,int buildings[]){  //50
            int energy=x;
            int n=buildings.length;
            // 1 2 3 4 5
            // 3     14

            // energy =7
            // 0 to 1l
            // b b b b b b b b b  => 100000
            // energy>=max

            for(int i=0;i<n;i++)
            {
                energy+=energy-buildings[i];//  a+=2 a=a+2
                // energy=energy+energy-b[i]= 2e-b[i]
                if(energy>=100000) return true; // optimisation
                if(energy<0) return false;
            }
            return true;
        }


        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();// no of buildings

            int buildings[]=new int[n]; // buildings array
            for(int i=0;i<n;i++){
                buildings[i]=sc.nextInt();
            }
// 0 1 2 3 4 5 ......100000
            int L=0;
            int R=100000;
            int ans=0;

            while(L<=R){
                int M=L+(R-L)/2;
                if(passedAllBuildings(M,buildings)){
                    R=M-1;
                    ans=M;
                }
                else{
                   L=M+1;
                }
            }
            System.out.println(ans);

        }

}
