class replit122
{
    String name;
    String capital;
    long pop;

    void display()
    {
        System.out.println("The capital of " + name + " is " + capital + " and population is " + pop);
    }

    public static void main(String [] args)
    {
        replit122 run = new replit122();
        replit122 run2 = new replit122();

        run.name = "USA";
        run.capital = "Washington DC";
        run.pop = 330000000;

        run2.name = "Kazakhstan";
        run2.capital = "Astana";
        run2.pop = 18500000;

        run.display();
        run2.display();
    }
}
