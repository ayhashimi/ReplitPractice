/*
class replit150
{
    public static void main(String [] args)
    {
        Employee a = new Employee("Joe", "Smith", 35, 35000);
        Student b = new Student("Adam", "Smith", 15, 0, 10);
        Retiree c = new Retiree("Frank", "Smith", 15, 0, 0,"tour");

        a.print();
        b.print();
        c.print();
    }
}

class Person
{
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void print()
    {
        System.out.println(this.name + " " + this.lastName + " " + age);
    }
}

class Employee extends Person
{
    int salary;

    public Employee(String name, String lastName,
                    int age, int salary)
    {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void print()
    {
        System.out.println(this.name + " " + this.lastName + " " + age + " " + salary);
    }
}

class Student extends Employee
{
    int grade;

    public Student(String name, String lastName,
                   int age, int salary, int grade)
    {
        super(name, lastName, age, salary);
        this.grade = grade;
    }

    public void print()
    {
        System.out.println(this.name + " " + this.lastName + " " + age + " " + grade);
    }
}

class Retiree extends Student
{
    String seniorActivity;

    public Retiree(String name, String lastName,
                   int age, int salary,
                   int grade, String seniorActivity)
    {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }


    public void print()
    {
        System.out.println(this.name + " " + this.lastName + " " + age + " " + seniorActivity);
    }


}






























































*/
/*
1. Create four classes (Person, Employee, Student, Retiree)

        * Have properties

        For Person: name(String)

        For Person: lastName(String)

        For Person: age(int)

        For Employee: salary(int)

        For Student: grade(int)

        For Retiree: seniorActivity(String)

        At Employee, Student, Retiree Class have a print method
        in each that prints the properties in line as shown in the output

        Create multilevel inheritance: Person --> Employee --> Student --> Retiree

        From your Main class create objects of the Employee, Student
        and Retiree classes and call the print method.

        **Expected Output:**

        ```
        Joe Smith 35 35000
        Adam Smith 15 10
        Frank Smith 15 tour
        ```*//*


*/
