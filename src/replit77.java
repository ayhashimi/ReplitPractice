import java.util.*;

public class replit77
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        Scanner scr = new Scanner(System.in);

        System.out.println("Input:");

        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = scr.nextInt();
        }

        for (int i = intArray.length-1; i >= 0; i--)
        {
            System.out.println(intArray[i]);
        }
    }
}
