import java.util.Scanner;

public class replit33
{
    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int usr = input.nextInt();

        if (usr % 2 == 0)
        {
            System.out.println("Value is even");

            if (usr > 1000)
            {
                System.out.println("Even value is large");
            }
            else System.out.println("Even value is just right");
        }
        else
        {
            System.out.println("Value is odd");

            if (usr > 1000)
            {
                System.out.println("Odd value is large");
            }
            else System.out.println("Odd value is just right");
        }
    }
}
