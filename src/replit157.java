/*
class replit157
{
    public static void main(String[] args)
    {
        Child run = new Child();

        run.m2();


    }
}


class Parent
{
    public Parent(){};
    public void m1 ()
    {
        System.out.println("m1 method in parent class");
    }
}

class Child extends Parent
{
    public Child(){};

    public void m1()
    {
        System.out.println("m1 method in child class");
    }

    public void m2()
    {
        this.m1();
        super.m1();
    }
}

*/
/*
Create a Parent class

create  instance method  m1 saying "m1 method in parent class"

        Create a Child class that will be a derived class from Parent

        Create same instance method m1 saying "m1 method in child class"

        Create another method m2 in child class and inside that method call method m1
        from child class and method m1 from parents class in Main class.

        Create and object of child class and call m2 method

**Expected Output:**

        ```
        m1 method in child class
```

        ```
        m1 method in parent class
```*/

