import java.util.Scanner;

public class replit99
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        //System.out.println("In:");
        String givenString = input.nextLine();

        if (givenString.contains(" "))
        {
            givenString = givenString.replaceAll(" ", "");
        }

        String strb = new StringBuffer(givenString).reverse().toString();

        if ((givenString.replaceAll(" ", "")).equals(strb))
        {
            System.out.println(true);
        }
        else System.out.println(false);
    }

}
