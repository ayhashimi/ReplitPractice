public class replit137
{
    String name;
    private String city;
    public String schName;
    protected int batch;

    void display()
    {
        System.out.println("My name is " + name + " and I live in "
                + city + ". I study at " + schName + " in batch "
                + batch);
    }

    public static void main(String[] args)
    {
        replit137 run = new replit137();

        run.name = "John";
        run.city = "Miami";
        run.schName = "Syntax";
        run.batch = 9;

        run.display();
    }

}
