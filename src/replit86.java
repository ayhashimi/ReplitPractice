

public class replit86
{

        String name;
        int roll_no;

        public replit86()
        {
            name = null;
            roll_no = 0;
        }

        public void setName (String nam)
        {
            name = nam;
        }

        public void setNo (int no)
        {
            roll_no = no;
        }


        public static void main(String[] args)
        {
            replit86 test = new replit86();

            test.setName("John");
            test.setNo(2);

            System.out.println("Name is " + test.name + " and roll number is " + test.roll_no);
        }
    }