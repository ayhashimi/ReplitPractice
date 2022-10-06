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
        replit116 run = new replit116();

        System.out.println(run.bothEven(1, 2));
    }
}
