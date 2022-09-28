public class replit92
{
    public static void main(String[] args)
    {
        String s1 = "hello how are you";
        int length = s1.length();

        if (s1.charAt(length - 1) == 'u')
        {
            System.out.println(true);
        }
        else System.out.println(false);

        if (s1.substring(14).equals("world"))
        {
            System.out.println(true);
        }
        else System.out.println(false);

        if (s1.substring(14).equals("are"))
        {
            System.out.println(true);
        }
        else System.out.println(false);

        if (s1.substring(14).equals("you"))
        {
            System.out.println(true);
        }
        else System.out.println(false);
    }

}
