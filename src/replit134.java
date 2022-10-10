class replit134
{
    static int countVowels(String s)
    {

        int counter = s.replaceAll("[^aeiouAEIOU]","").length();

        return counter;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
