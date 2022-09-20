public class replit81
{
    public static void main(String[] args)
    {

        int [][] array = {{5,4,8},};

        int maxElement = 0;

        // checking each element of matrix
        // if it is greater than maxElement,
        // update maxElement
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > maxElement)
                {
                    maxElement = array[i][j];
                }
            }
        }

        System.out.println(maxElement);
    }
}
