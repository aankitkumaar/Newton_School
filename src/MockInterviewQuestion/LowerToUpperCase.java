package MockInterviewQuestion;

public class LowerToUpperCase {
    public static void main(String[] args) {

        String str="AnKIT KumAR";

        String upperCaseString="";

        for(int i=0;i<str.length();++i){

            char charValue=str.charAt(i);

            if(charValue>='a' && charValue<='z'){

                upperCaseString+=(char)(charValue-' ');

            }

            else

            {

                upperCaseString+=charValue;

            }

        }

        System.out.println(upperCaseString);

    }

}