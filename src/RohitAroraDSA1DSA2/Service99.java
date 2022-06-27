package BatchMarch;

public class Service99 {

    // parent class reference can point to chilkd class object as well
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        p.doSomething();
        p.doNothing();

        p=new Dog(); // super
        p.doSomething();
        p.doNothing(); // no error

        p=new Snake(); // type snake
        p.doSomething();
        p.doNothing();
    }
}
