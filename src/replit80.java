public class replit80
{
    public static void main(String[] args)
    {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for (double row = 0.0; row < a.length; row++)
        {
            for (double col = 0; col < a[(int) row].length; col++)
            {
                System.out.print((a[(int) row][(int) col]*2) + " ");
            }
            System.out.println();
        }
    }
}
