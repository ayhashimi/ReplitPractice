public class replit114
{
    public void add (int a, int b)
    {
        System.out.println("Addition " + (a + b));
    }

    public void multiply (int a, int b)
    {
        System.out.println("Multiplication " + (a * b));
    }

    public void subtract (int a, int b)
    {
        System.out.println("Subtraction " + (a - b));
    }

    public static void main(String[] args)
    {
        replit114 run = new replit114();

        run.add(20, 10);
        run.multiply(3, 10);
        run.subtract(40, 10);
    }
}
