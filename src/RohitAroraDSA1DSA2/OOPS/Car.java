package BatchMarch.OOPS;
// is-a relatinship
public class Car extends Vehicle{
    String modelname="Mustang";

    public void honk(){
        System.out.println("pooni pooni");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.honk();
        System.out.println(obj.brand+" "+obj.modelname);
    }

}
