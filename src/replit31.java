import java.util.Scanner;

public class replit31
{
    public static void main(String[] args)
    {
        boolean isSunny;
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.println("Is it sunny outside?");

        isSunny = input.nextBoolean();

        if (isSunny)
        {
            System.out.println("It is a sunny day, I should go somewhere!");

            System.out.println("What is the temperature outside?");

            temp = input.nextInt();

            if(temp > 85)
            {
                System.out.println("I am going to the beach!");
            }
            else System.out.println("I am going to the park");
        }
        else System.out.println("I stay home and practice Java");

    }
}
