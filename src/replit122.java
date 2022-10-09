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
        Main run = new Main();
        Main run2 = new Main();

        run.name = "USA";
        run.capital = "Washington, DC";
        run.pop = 330000000;

        run2.name = "Kazakhstan";
        run2.capital = "Astana";
        run2.pop = 18500000;

        run.display();
        run2.display();
    }
}
