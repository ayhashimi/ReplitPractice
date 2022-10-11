class replit148
{
    public static void main(String [] args)
    {
        ShoppingStore blanket = new ShoppingStore("Blanket", 99.98, 1);
        ShoppingStore mattress = new ShoppingStore("Mattress", 439.18, 1);

        double bp = blanket.itemTotalPrice();
        double mp = mattress.itemTotalPrice();

        System.out.println("You purchased " + (mp + bp) + " Today");
    }
}

class ShoppingStore
{
    String item; double price; int quantity;

    public ShoppingStore(String item, double p, int q)
    {
        this.item = item;
        price = p;
        quantity = q;
    }

    public double itemTotalPrice ()
    {

        System.out.println(this.item + " Total Value " + (price * quantity));
        return price * quantity;
    }
}



































































/*







**In ShoppingStore class:**

        Create variables as below.

        - item,
        - price,
        - quantity

        Create a constructor to initialize instance variables.

        Create a method with name itemTotalPrice.

        write a logic to to calculate the total values of items in stock.
        and print the result.

        return the total value.

        **In Main Class.**

        Create two Object of ShoppingStore and pass the parameters to Constructor.

        then using each object call the method itemTotalPrice.

        Store the returned value of each object.

        Calculate sum of both object and print the result.

        Output:

        ```
        Blanket Total Value 99.98
        ```

        ```
        Mattress Total Value 439.18
        ```

        ```
        You purchased 539.16 Today
        ```

        ```
        Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
        ```

*/
