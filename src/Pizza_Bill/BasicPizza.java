package Pizza_Bill;

public class BasicPizza {
    static int price;
    static boolean veg;
    private int tropping = 100;
    private int extraCheese = 100;
    private int takeaway = 20;

    public BasicPizza(boolean veg)
    {
        this.veg = veg;
        if(this.veg) this.price = 300;
        else this.price = 600;
    }

    public void Chees()
    {
        price+=extraCheese;
    }

    public void Tropping()
    {
        price+=tropping;
    }

    public void TakeAway() { price+=takeaway;}

    public int getBill()
    {
        return this.price;
    }
}
