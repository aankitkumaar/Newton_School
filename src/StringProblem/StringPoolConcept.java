package StringProblem;

public class StringPoolConcept {
    public static void main(String[] args) {
        String firstString = "Gaurav";
        String secondString = "Gaurav";
        String thirdString =  new String("Gaurav");
        System.out.print("Case 1 : ");
        System.out.println(firstString == secondString);
        System.out.print("Case 2 : ");
        System.out.println(firstString == thirdString);

        System.out.print("Case 3 : ");
        System.out.println(firstString.equals(thirdString));
    }
}
