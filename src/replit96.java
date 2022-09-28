import java.util.Scanner;

public class replit96
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String language = sc.nextLine();

        if (language.equals("Java"))
        {
            System.out.println("Java is a programming language");
        }
        else if (language.equals("C"))
        {
            System.out.println("C is a procedural programming language");
        }
        else if (language.equals("C++"))
        {
            System.out.println("C++ is a middle level programming language");
        }
        else
        {
            System.out.println("Doesn't mach any programming language");
        }

    }
}
