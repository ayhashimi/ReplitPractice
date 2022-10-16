/**
 * 10/15/22
 * Polymorphism Homework
 *
 * Instructions Provided:
 *
 * Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
 * Define common behavior within parent class and override some of the methods in child classes
 * Define some methods specific to child classes
 * Write example of achieving run time polymorphism
 *
 * @author Abdul Hashimi
 *
 *//*


public class Main
{
    public static void main(String[] yargPirates)
    {
        Student[] students = {  new SyntaxStudent ("Abdul Hashimi", 35, 14),
                new CollegeStudent ("John Doe", 19, "Harvard"),
                new SchoolStudent ("Jane Doe", 14, "Middle School")};

        for (int i = 0; i < students.length; i++)
        {
            students[i].learn();

            if (students[i] instanceof SyntaxStudent)
                ((SyntaxStudent)students[i]).batch();
            else if (students[i] instanceof CollegeStudent)
                ((CollegeStudent)students[i]).college();
            else
                ((SchoolStudent)students[i]).school();

        }

        int [][] array = {{1,2,3}, {4,5,6}};

    }
}


class Student
{
    String name;
    int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void learn()
    {
        System.out.println("Student Class - Learn Method");
    }
}

class SyntaxStudent extends Student
{
    int batch;
    public SyntaxStudent(String name, int years, int batch)
    {
        super(name, years);
        this.batch=batch;
    }

    void learn()
    {
        System.out.println("SyntaxStudent Class - Learn Method");
    }

    void batch()
    {
        System.out.println("SyntaxStudent Batch " + batch);
    }
}



class CollegeStudent extends Student
{
    String college;
    public CollegeStudent(String name, int years, String college)
    {
        super(name, years);
        this.college=college;
    }

    void learn()
    {
        System.out.println("CollegeStudent - Learn Method");
    }

    void college()
    {
        System.out.println("CollegeStudent studying at " + college);
    }
}

class SchoolStudent extends Student
{
    String school;
    public SchoolStudent(String name, int years, String school)
    {
        super(name, years);
        this.school=school;
    }

    void learn()
    {
        System.out.println("SchoolStudent Learn Method");
    }

    void school()
    {
        System.out.println("SchoolStudent studying at " + school);
    }

}*/
