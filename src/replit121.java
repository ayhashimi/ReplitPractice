class replit121
{
    int n;
    double n2;
    char c;

    public static void main(String [] args)
    {
        replit121 run = new replit121();
        replit121 run2 = new replit121();

        run.n = 10;
        run.n2 = 10.23;
        run.c = 'a';

        run2.n = 100;
        run2.n2 = 100.23;
        run2.c = 's';

        System.out.println(run.n + "\n" + run.n2 + "\n" + run.c +
                "\n" + run2.n + "\n" + run2.n2 + "\n" + run2.c);
    }
}