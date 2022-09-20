import java.util.*;

public class replit76
{
    public static void main(String[] args)
    {
        String[] stringArray = new String[7];
        Scanner scr = new Scanner(System.in);

        int i;

        for (i = 0; i < stringArray.length; i++)
        {
            System.out.print("Please enter day " + (i + 1) + " of the week\n");
            stringArray[i] = scr.nextLine();
        }

        for (i = 0; i < stringArray.length; i++)
        {
            System.out.println(stringArray[i]);
        }
    }
}
