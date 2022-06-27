package BatchMarch;

/* File name : VirtualDemo.java */
public class VirtualDemo {

    public static void main(String [] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);

        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}


//Constructing an Employee
//Constructing an Employee
//Call mailCheck using Salary reference --
//Within mailCheck of Salary class
//Mailing check to Mohd Mohtashim  with salary 3600.00
//Call mailCheck using Employee reference--
//Within mailCheck of Salary class
//Mailing check to John Adams  with salary 2400.00

//virtual method invocation
//virtual method