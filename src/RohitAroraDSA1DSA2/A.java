package BatchMarch;

public class A {
    int a;// next
    int b;//prev
    int c;//data
    int d;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}


class C{

    public static void main(String[] args) {
        A obj1=new A(2, 4, 6);
        A obj2=new A(7,8,9);

       // System.out.println(obj1.a);
        System.out.println(obj1);
        System.out.println(obj2);
        obj1=obj2;
        System.out.println(obj1);
        System.out.println(obj2);
       System.out.println(obj1.a + " "+ obj1.b+ " "+ obj1.c);

    }
}
