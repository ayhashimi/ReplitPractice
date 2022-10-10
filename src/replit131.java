class replit131
{
    static String thirdLetter(String s)
    {
        String temp = "";

        for (int i = 0; i < s.length();)
        {
            temp = temp + s.charAt(i);

            i += 3;
        }

        return temp;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
