import java.util.Scanner;

public class replit105
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i++)
        {
            switch (word.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(word.charAt(i));
                    break;
            }
        }
    }
}
