import java.util.Scanner;

public class replit104
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String [] names = new String[5];
        int i;

        for (i = 0; i < 5; i++)
        {
            names[i] = input.nextLine();
        }


        for (i = 0; i < names.length; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(names[i].charAt(j));
            }
            System.out.println();
        }
    }
}
