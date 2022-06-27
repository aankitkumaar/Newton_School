package BatchMarch.OOPS;

import java.util.Scanner;

public class Human {
    int x;
    int y;
    String name="danish";

    Human(int a, int b, String name){  //normal method
        this.x=a;
        this.y=b;
        this.name=name;
    }

    Human(int a, int b){
        this.x=a;
        this.y=b;
    }

    Human(){}

    public static void main(String[] args) {
        int x=45;

       Human myObj1 = new Human(5,9,"rohit");  // myobj1 - x

       // myObj1 875785 -> address to the instance of type human  ->    myObj1 [x y name]
         Human myObj2 = new Human(4, 7,"stuti" );// myobj2 -x     x
        Human myObj3 = new Human(3, 5,"harsh");
      //  myObj2.x = 25;//this change will only effect x of obj2
      //  System.out.println(x);


//        Scanner sc=new Scanner(System.in);
//        myObj1.x=sc.nextInt();
//        myObj1.y=sc.nextInt();
//        myObj1.name=sc.next();

        System.out.println(myObj1.x +" "+ myObj1.y+ " "+myObj1.name);
        System.out.println(myObj2.x+" "+ myObj2.y+ " "+myObj2.name);
        System.out.println(myObj3.x+" "+ myObj3.y+ " "+myObj3.name);
    }
}


// Human -> height weight name haircolor gender -> blueprint, template

// Human stuti  height weight name haircolor gender   -> instances
// Human Chrishti height weight name haircolor gender