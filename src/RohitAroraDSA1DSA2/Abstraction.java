package BatchMarch;

abstract class Abstraction {

    public abstract void sendMessage();

    public int getNumber(){
        return 5;
    }

    public static void main(String[] args) {
       // Abstraction obj=new Abstraction();
    }

}

class Ab1 extends Abstraction{


    @Override
    public void sendMessage() {
        System.out.println("msg1");
    }


}


class Ab2 extends Abstraction{


    @Override
    public void sendMessage() {
        System.out.println("msg2");
    }
}

class Service55{

    public static void main(String[] args) {
        Ab1 obj=new Ab1();
        Ab2 obj1=new Ab2();

        obj1.sendMessage();
        obj.sendMessage();
    }
}



