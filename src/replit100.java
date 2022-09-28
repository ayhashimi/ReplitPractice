import java.util.Scanner;
import java.util.Arrays;

public class replit100
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        char [] ca = new char [s.length()];
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++)
        {
            ca[i] = s.charAt(j);
            j--;
        }

        System.out.println(String.valueOf(ca));
    }
}
