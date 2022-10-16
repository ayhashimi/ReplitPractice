import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please input integer values between 0 and 10,000, " +
                "when you are done inputting, please type NULL (Case Sensitive)");

        Scanner input = new Scanner(System.in);

        int [] array = new int[2];

        String temp ;

        for (int i = 0; i < array.length; i++)
        {
            temp = input.nextLine();

            if (temp.equals("NULL"))
            {
                i = array.length;
            }
            else
            {
                array[i] = Integer.parseInt(temp);
            }
            if (i == array.length - 1)
            {
                System.out.println("INSIDE FIRST IF STATEMENT");
                System.out.println(Arrays.toString(array));
                array = enlarge(array);   //array is filled, and I need to pass it over to enlargen the array,
                                        // but then I need to store that new array back into the old array variable
            }
        }

        ArrayList<Student> theList = new ArrayList<>();

    }

    static int[] enlarge(int[] array)
    {
        int [] newArray = new int[array.length * 2];

        for (int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }

        return newArray;
    }
}

class Student
{

}