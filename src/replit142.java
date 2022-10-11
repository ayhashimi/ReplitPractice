class replit142
{
    public static void main(String [] args)
    {
        SyntaxTechnologies first = new SyntaxTechnologies();
        SyntaxTechnologies second = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");

        first.print();
        second.print();
    }
}


class SyntaxTechnologies
{
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public SyntaxTechnologies()
    {
    }

    public SyntaxTechnologies(String s, int b, int y, String l)
    {
        schoolName = s;
        batch = b;
        year = y;
        lastDayOfClass = l;
    }

    public void print()
    {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}



