package BatchMarch.Modifiers;

//Access modifiers -> public private protected default

//1.Class -> public(accesible to any other class) default(in same package)

//2. Method ->  public(accesible for all the classes), private(only in declared class), protected(same package and subclasses)
// ,default(same package)

//3.Variables ->  public(accesible for all the classes), private(only in declared class), protected(same package and subclasses)
// ,default(same package)


// Non Access Modifiers ->



//1.Class -> final(can not be inherited), abstract(u cant create its objects)


//transient,synchronized,volatile
//2. Method -> final(overriden not allowed) abstract(not having any body, only be present in abstract class) static(belomg to class and not object)

//3.Variables ->final(modification not allowed)  static(belong to class and not object)

import javax.swing.*;

// class Mouse  -> CloseButton extending Mouse -> click
// abstract click()

public  abstract class AccessModifiers {  // default only

    public  static int a=500;

    public static void getMeSomething(){
        a=600;
    }

    abstract void walk();

    public static void main(String[] args) {

      //  AccessModifiers obj=new AccessModifiers();
        AccessModifiers.a=700;

        getMeSomething();
    }

}





// Human -> static noOfLegs=2->memory  walk()->static

//1cr
// swati ->
// Aditya ->
