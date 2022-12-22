package Pizza_Bill;

public class DeluxePizza {
    static int price;
    static boolean veg;
    private int tropping = 150;
    private int extraCheese = 150;
    private int takeaway = 20;

    public DeluxePizza(boolean veg)
    {
        this.veg = veg;
        if(this.veg) this.price = 800;
        else this.price = 1000;
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
