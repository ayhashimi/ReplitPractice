import java.util.Scanner;
public class replit20
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please Enter First Name");

        String first = scnr.nextLine();

        System.out.println("Please Enter Last Name");

        String last = scnr.nextLine();

        System.out.println(first + " " + last);

    }

}