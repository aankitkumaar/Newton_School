package BatchMarch;

public class StringPractice {

    public static void main(String[] args) {
       // String s1="rohit";

        // Human
        // Human[] h=new Human[5];
        // h[0]=null
        //h[1]..
        int[] s={1,2,3,4};

        for(int r:s){
            r=5;
            System.out.println(r);
        }

        for(int r:s){
            System.out.println(r);
        }

        String[] str=new String[5];
        str[0]="rohit";
        str[1]="welcome";
        //..

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        for(String s1:str){
            System.out.println(s1);
        }

    }
}
