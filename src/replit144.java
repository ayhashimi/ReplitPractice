class StoreProduct
{
    String label, category;
    double price;
    boolean hasExpiration;
    int stock;

    public StoreProduct(String lbl, String cat, double pr, boolean ex, int st)
    {
        label = lbl;
        category = cat;
        price = pr;
        hasExpiration = ex;
        stock = st;
    }

    public StoreProduct(String lbl, double pr, int st)
    {
        label = lbl;
        category = "misc";
        price = pr;
        hasExpiration = false;
        stock = st;
    }

    public StoreProduct(String lbl, double pr)
    {
        label = lbl;
        price = pr;
        hasExpiration = false;
        stock = 0;
    }

    public void display()
    {
        System.out.println(label + " " + category
                + " " + price + " " + hasExpiration + " " + stock);
    }
}

class replit144
{
    public static void main(String [] args)
    {
        StoreProduct one = new StoreProduct("Eggs", "Produce", 3.0,true, 10);
        StoreProduct two = new StoreProduct("Paper Towels", 2.0, 24);
        StoreProduct three = new StoreProduct("Paper Towel", 2.0);

        one.display();
        two.display();
        three.display();
    }
}