package BatchMarch.OOPS;

import java.sql.Time;

public class Order {// 10L

    int orderId;
    //User user;// salil
    String username;
    Time timeOfPlacingOrder;
    //OrderStatus orderStatus;


    //methods

    // all the orders which are getting placed.

    public static void main(String[] args) {
        Order adithyaOrder = new Order();// inherit variable and methods from the class
        adithyaOrder.orderId=1345;
        System.out.println(adithyaOrder.orderId);
    }
}
