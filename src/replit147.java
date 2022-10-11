
class replit147
{
    public static void main(String[] args)
    {
        carObject one = new carObject("Toyota 2019", 62500.0, 40);
        carObject two = new carObject("BMW 2019", 32649.0, 20);

        System.out.println(one.model + " Stock Value " + one.carStockValue());
        System.out.println(two.model + " Stock Value " + two.carStockValue());
    }
}

class carObject
{
    String model; double price; int quantity;

    public carObject (String m, double p, int q)
    {
        this.model = m;
        this.price = p;
        this.quantity = q;
    }

    public double carStockValue ()
    {
        return price * quantity;
    }
}











//40 toyotas
//20 beemers



































































/*



**In carObject class:**

        Create instance variables as below.

        - model
        - price,
        - quantity

        Create a constructor that will initialize instance variables.

        Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

        run the application in Main Class

        **Expected Output:**

        ```
        Toyota 2019 Stock Value 2500000.0
        BMW 2019 Stock Value 652980.0
        ```

        ```
        Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
        ```*/
