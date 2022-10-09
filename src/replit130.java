class replit130
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)
    {
        for (int num : array)
        {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num * 10;

            System.out.print(num + " ");
        }

    }
}