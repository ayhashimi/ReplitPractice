class replit141
{
    public static void main(String[] args)
    {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

    static public int maxValue(int[] a)
    {
        int temp = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (temp < a[i])
                temp = a[i];
        }

        return temp;
    }
}

