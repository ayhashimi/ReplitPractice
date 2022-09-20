public class replit71
{
    public static void main(String[] args)
    {
        int[] numArray = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        for (int i = 0; i < numArray.length; i++)
        {
            if (i == 0 || i % 2 ==0)
                System.out.print(numArray[i] + " ");
        }
    }
}
