import java.util.Scanner;

public class replit35
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you need a loan?");

        boolean uinput = input.nextBoolean();

        if (uinput)
        {
            System.out.println("What is your credit score?");
            int ucr = input.nextInt();

            if (ucr < 600)
                System.out.println("Not eligible");
            else if (ucr >= 600  && ucr <= 700)
                System.out.println("Maybe eligible");
            else if (ucr >= 601  && ucr <=800)
                System.out.println("Definitely eligible");
        }
    }
}
