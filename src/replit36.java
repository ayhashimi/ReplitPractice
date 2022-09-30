import java.util.Scanner;

public class replit36
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        String a;
        String b;
        int n1;
        int n2;

        System.out.println("Please enter two strings");

        a = input.nextLine();
        b = input.nextLine();

        System.out.println("Please enter two numbers");

        n1 = input.nextInt();
        n2 = input.nextInt();

        if (n1 == n2 && a.equals(b))
        {
            System.out.println("AND");
        }
        else if (n1 == n2 || a.equals(b))
        {
            System.out.println("OR");
        }
        else System.out.println("NONE");

    }
}


//locate project root folder
//navigate to location using cd
//home directory is where you start
//check with pwd
//go to project and look at properties, get directory path
//cd to that path
//git init
