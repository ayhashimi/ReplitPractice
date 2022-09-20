public class replit74
{
    public static void main(String[] args)
    {
        int[] intArray = new int[11];

        int year = 2010;
        int i;

        for (i = 0; i < intArray.length; i++)
        {
            intArray[i] = year;
            year++;
        }

        for (i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
