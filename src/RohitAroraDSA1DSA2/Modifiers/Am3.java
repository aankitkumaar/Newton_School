package BatchMarch.Modifiers;

public class Am3 {
}

abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
abstract class Student extends Main {
    public int graduationYear = 2018;
//    public void study() { // the body of the abstract method is provided here
//        System.out.println("Studying all day long");
//    }
}


class SportsStudent extends Student{
    public void study(){
        System.out.println("Padlo thoda");
    }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        SportsStudent myObj = new SportsStudent();
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}
