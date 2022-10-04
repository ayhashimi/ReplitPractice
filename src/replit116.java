public class replit116
{
    public boolean bothEven (int a, int b)
    {
        if (a % 2 == 0 && b % 2 == 0)
        {
            return true;
        }
        else return false;

    }

    public static void main(String[] args)
    {
        Main run = new Main();

        System.out.println(run.bothEven(1, 2));
    }
}
