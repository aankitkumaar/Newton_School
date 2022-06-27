package BatchMarch.OOPS;

class A {
    int x = 20;

    void honk(){

    }
}
class B extends A {
    int x = 30;
    int y;

}


class Test {
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.x + b.y);

        A a = new A();
        System.out.println(a.x);

        A a2 = new B();
        a2.honk();
        System.out.println(a2.x);

    }
}
// everything in java work as reference
