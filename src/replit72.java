public class replit72
{
    public static void main(String[] args)
    {
        char[] charArray = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        for (int i = 0; i < charArray.length; i++)
        {
            if (i == 0 || i % 2 == 0)
                System.out.print(charArray[i]);
        }
    }
}
