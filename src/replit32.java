import java.util.Scanner;

public class replit32
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");

        String gender = scnr.nextLine();

        System.out.println("Please enter your age");

        int age = scnr.nextInt();

        if (gender.equals("M"))
        {
            if (age >= 25)
                System.out.println("Man");
            else
                System.out.println("Boy");
        }
        else
        {
            if (age >= 25)
                System.out.println("Woman");
            else
                System.out.println("Girl");
        }

    }
}