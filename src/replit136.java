public class replit136
{
    private void a()
    {
        System.out.println("This is Private Method");
    }

    void b ()
    {
        System.out.println("This is Default Method");
    }

    protected void c()
    {
        System.out.println("This is Protected Method");
    }

    public void d()
    {
        System.out.println("This is Public Method");
    }


    public static void main(String[] args)
    {
        replit136 run = new replit136();

        run.a();
        run.b();
        run.c();
        run.d();
    }

}