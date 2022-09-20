public class replit79
{
    public static void main(String[] args)
    {
        Double [][] tooDeeArray = {{1.4, 2.0, 3.3, 2.0}, {4.0, 1.5, 6.1, 1.0}, {1.2, 3.1, 4.0, 1.6}};

        for (double row = 0.0; row < tooDeeArray.length; row++)
        {
            for (double col = 0; col < tooDeeArray[(int) row].length; col++)
            {
                System.out.print(tooDeeArray[(int) row][(int) col] + " ");
            }
            System.out.println();
        }
    }
}
