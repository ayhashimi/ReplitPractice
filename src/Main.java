class Main
{
    String censorLetter(String a, char b)
    {
        String temp = a.replaceAll(String.valueOf(b), "*");

        return temp;
    }
    public static void main(String[] args)
    {
        Main run = new Main();

        System.out.println(run.censorLetter("computer science", 'e'));
        System.out.println(run.censorLetter("trick or treat", 't'));
    }
}