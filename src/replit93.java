public class replit93
{
    public static void main(String[] args)
    {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        int i;

        for (i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)  == 'c')
            {
                System.out.println(i);
            }
        }

        for (i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)  == ' ')
            {
                System.out.println(i);
            }
        }

        for (i = 0; i < str.length(); i++)
        {
            if (i == str.length() - 1 || i == str.length() - 2 || i == str.length() - 3)
            {
                break;
            }
            else if (str.substring(i, i+3).equals(target1))
            {
                System.out.println(i);
            }
        }

        for (i = 0; i < str.length(); i++)
        {
            if (i == str.length() - 1 || i == str.length() - 2 || i == str.length() - 3)
            {
                System.out.println(-1);
                break;
            }
            else if (str.substring(i, i+4).equals(target2))
            {
                System.out.println(i);
            }
        }

    }
}
