public class replit69
{
    public static void main(String[] args)
    {
        int numIterations = 7;
        int a;

        for(; 0 < numIterations; numIterations--) // outer loop for rows
        {
            int num=1;
            for(int b = 0; b < numIterations; b++) // inner loop for rows
            {
                // printing num with a space
                if (numIterations >= 1)
                System.out.print(num+ " ");
                else break;

                //incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }

        numIterations = 7;

        for(a = 0; a < numIterations; a++) // outer loop for rows
        {
            int num=1;
            if (a > 0)
            {
                for (int b = 0; b <= a; b++) // inner loop for rows
                {
                    // printing num with a space
                    System.out.print(num + " ");

                    //incrementing value of num
                    num++;
                }

                // ending line after each row
                System.out.println();
            }
        }
    }
}
