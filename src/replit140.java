class replit140
{

    public static void main(String[] args)
    {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }


    static String maxLength(String[] ar)
    {
        String temp = new String();

        for (int i = 0; i < ar.length; i++)
        {
            if (temp == null)
            {
                temp = ar[i];
            }
            else
            if (temp.length() < ar[i].length())
                temp = ar[i];


        }

        return temp;
    }

}
