package Pizza_Bill;

import java.util.Scanner;

public class Pizza {
    static Scanner ob = new Scanner(System.in);
    public static void BasicPizza()
    {
        System.out.println("1. Veg" +"\n"+
                "2. Non-Veg");

        int type = ob.nextInt();

        if(type==1)
        {
            BasicPizza basic = new BasicPizza(true);
            System.out.println("Did You Want To Customized Pizza :- y/n");
            char c = ob.next().charAt(0);
            switch (c)
            {
                case 'y':
                {
                    System.out.println("Add More Chees(y/n)");
                    char extra1 = ob.next().charAt(0);
                    System.out.println("Add More Tropping(y/n)");
                    char extra2 = ob.next().charAt(0);

                    if(extra1 == 'y') basic.Chees();
                    if(extra2 == 'y') basic.Tropping();
                    System.out.println("Did You Want To TakeAway(y/n)");
                    char take = ob.next().charAt(0);
                    if(take=='y') basic.TakeAway();
                    System.out.println("Total Bill :- "+basic.getBill()+"\n"+
                            "Thank You For Order");
                    break;
                }
                case 'n':
                {

                    System.out.println("Total Bill :- "+basic.getBill()+"\n"+
                            "Thank You For Order");
                    break;
                }
            }
        }
        else
        {
            BasicPizza basic = new BasicPizza(false);
            System.out.println("Did You Want To Customized Pizza :- y/n");
            char c = ob.next().charAt(0);
            switch (c)
            {
                case 'y':
                {
                    System.out.println("Add More Chees(y/n)");
                    char extra1 = ob.next().charAt(0);
                    System.out.println("Add More Tropping(y/n)");
                    char extra2 = ob.next().charAt(0);

                    if(extra1 == 'y') basic.Chees();
                    if(extra2 == 'y') basic.Tropping();
                    System.out.println("Did You Want To TakeAway(y/n)");
                    char take = ob.next().charAt(0);
                    if(take=='y') basic.TakeAway();
                    System.out.println("Total Bill :- "+basic.getBill()+"\n"+
                            "Thank You For Order");
                    break;
                }
                case 'n':
                {

                    System.out.println("Total Bill :- "+basic.getBill()+"\n"+
                            "Thank You For Order");
                    break;
                }
            }
        }





    }
    public static void DeluxePizza() {
        System.out.println("1. Veg" + "\n" +
                "2. Non-Veg");

        int type = ob.nextInt();

        if (type == 1) {
            DeluxePizza deluxe = new DeluxePizza(true);
            System.out.println("Did You Want To Customized Pizza :- y/n");
            char c = ob.next().charAt(0);
            switch (c) {
                case 'y': {
                    System.out.println("Add More Chees(y/n)");
                    char extra1 = ob.next().charAt(0);
                    System.out.println("Add More Tropping(y/n)");
                    char extra2 = ob.next().charAt(0);

                    if (extra1 == 'y') deluxe.Chees();
                    if (extra2 == 'y') deluxe.Tropping();
                    System.out.println("Did You Want To TakeAway(y/n)");
                    char take = ob.next().charAt(0);
                    if(take=='y') deluxe.TakeAway();
                    System.out.println("Total Bill :- "+ deluxe.getBill()+"\n"+
                    "Thank You For Your Order");
                    break;
                }
                case 'n': {

                    System.out.println("Total Bill :- "+ deluxe.getBill()+"\n"+
                            "Thank You For Your Order");
                    break;
                }
            }
        }
        else
        {
            DeluxePizza deluxe = new DeluxePizza(false);
            System.out.println("Did You Want To Customized Pizza :- y/n");
            char c = ob.next().charAt(0);
            switch (c) {
                case 'y': {
                    System.out.println("Add More Chees(y/n)");
                    char extra1 = ob.next().charAt(0);
                    System.out.println("Add More Tropping(y/n)");
                    char extra2 = ob.next().charAt(0);

                    if (extra1 == 'y') deluxe.Chees();
                    if (extra2 == 'y') deluxe.Tropping();
                    System.out.println("Did You Want To TakeAway(y/n)");
                    char take = ob.next().charAt(0);
                    if(take=='y') deluxe.TakeAway();
                    System.out.println("Total Bill :- "+ deluxe.getBill()+"\n"+
                            "Thank You For Your Order");
                    break;
                }
                case 'n': {

                    System.out.println("Total Bill :- "+ deluxe.getBill()+"\n"+
                            "Thank You For Your Order");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("<-: PRICE TABLE :->");
        System.out.println("Basic Pizza - 300(Veg)/600(Non-Veg)"+"\n"+
                "Deluxe Pizza - 800(Veg)/1000(Non-Veg)"+"\n"+
                "Tropping - 100"+"\n"+
                "Cheeze - 100"+"\n"+
                "Take Away - 20"+""+"\n");
        System.out.println("Enter The Pizza Type");
        System.out.println("1. Basic Pizza "
        +"\n"+
                "2. Deluxe Pizza");
        int order = ob.nextInt();

        switch (order)
        {
            case 1:
            {
                BasicPizza();
                break;
            }
            case 2:
            {
               DeluxePizza();
               break;
            }

        }
    }
}
