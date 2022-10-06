class replit119
{
    String censorLetter(String a, char b)
    {
        String temp = a.replaceAll(String.valueOf(b), "*");

        return temp;
    }
    public static void main(String[] args)
    {
        replit119 run = new replit119();

        System.out.println(run.censorLetter("computer science", 'e'));
        System.out.println(run.censorLetter("trick or treat", 't'));
    }
}