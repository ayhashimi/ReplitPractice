class replit139
{

    public String alphabetical(String str)
    {
        String temp = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (i == 0)
                temp = temp + str.charAt(i);
            else
            if (str.charAt(i) > str.charAt(i - 1))
                temp = temp + str.charAt(i);

        }

        return temp;
    }

    public static void main(String[] args)
    {
        replit139 run = new replit139();

        System.out.println(run.alphabetical("hello"));
        System.out.println(run.alphabetical("software"));
        System.out.println(run.alphabetical("language"));

    }
}

