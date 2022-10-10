class AnotherClass
{
    private String a ()
    {
        return "private";
    }

    String b()
    {
        a();
        return a() + "\ndefault";
    }

    protected String c()
    {
        return "protected";
    }

    public String d()
    {
        return "public";
    }


}

class replit138
{
    public static void main(String[] args)
    {
        AnotherClass run = new AnotherClass();

        System.out.println(run.b());
        System.out.println(run.c());
        System.out.println(run.d());

    }


}
