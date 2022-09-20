public class replit69
{
    public static void main(String[] args)
    {
        int numIterations = 8;
        int a;

        for(a = 0; a < numIterations; a++) // outer loop for rows
        {
            int num=1;
            for(int b = 0; b <= a; b++) // inner loop for rows
            {
                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }
    }
}
