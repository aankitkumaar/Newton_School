public class Ifconditioncheck {
    public static void main(String[] args) {
        int a=5;
        int b=20;
        for (int i = 0; i <11000; i++) {
            a=a+10;
            if(a>50)
                break;
        }
        System.out.println(a);
    }
}
