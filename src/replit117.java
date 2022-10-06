public class replit117
{
    public void calcSum (int a)
    {
        int sum = 0;

        for (int i = 0; i < a; i++)
        {
            if ((i + 1) % 2 == 0)
            {
                sum += i + 1;
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args)
    {
        replit117 run = new replit117();

        run.calcSum(5);
    }
}
