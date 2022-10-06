class replit118
{
    String spaceOut(String a)
    {
        String temp = "";

        for (int i = 0; i < a.length(); i++)
        {
            temp = temp + " " + a.charAt(i);
        }

        return temp;
    }
    public static void main(String[] args)
    {
        replit118 run = new replit118();

        System.out.println(run.spaceOut("Hello"));
    }
}