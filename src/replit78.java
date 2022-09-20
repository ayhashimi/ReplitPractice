import java.util.Scanner;

public class replit78
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        Scanner scr = new Scanner(System.in);

        System.out.println("Input:");

        int i;

        for (i = 0; i < intArray.length; i++)
        {
            intArray[i] = scr.nextInt();
        }

        for (i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i] * 10);
        }
    }
}
