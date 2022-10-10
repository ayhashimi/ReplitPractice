import java.util.Arrays;

class replit132
{

    static int[][] reduce10 (int [][] array)
    {
        int[][] ar = new int [3][4];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                ar[row][col]  = array[row][col] - 10;
            }
        }


        return ar;
    }


    public static void main(String[] args)
    {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };


        for (int row = 0; row < a.length; row++)
        {
            for (int col = 0; col < a[row].length; col++)
            {
                System.out.print((a[row][col] - 10) + " " );
            }

            System.out.println();
        }
    }
    //create method reduce10 here

}
