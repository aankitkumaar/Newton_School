package BatchMarch.OOPS;

public class Main {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}

class Second {
    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
