public class newMock {

    /*str1 = "Rahul"
    str2 ="salman"*/
    public static void main(String[] args) {
        String str1 ="Rahul";
        int sizeofstr1 = str1.length();
        String str2 = "salman";
        str1 = str1+str2;

        int sizeofstr2 = str2.length();
        str1 =  str1.substring(0,5);
      //  str2 =  str1.substring(sizeofstr1+1,sizeofstr2+sizeofstr1);
        System.out.println(str1);
        System.out.println(str2);
    }
}