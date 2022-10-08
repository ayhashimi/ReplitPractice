class replit120
{
    int year;
    String schoolName;
    int batchNum;

    public static void main(String[] args)
    {
        replit120 run = new replit120();

        run.year = 2022;
        run.schoolName = "Syntax";
        run.batchNum = 14;

        System.out.println("I am a student of batch " + run.batchNum +
                " studying at " + run.schoolName + " in the year of " + run.year);
    }
}