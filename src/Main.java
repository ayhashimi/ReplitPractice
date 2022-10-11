class Main
{
    public static void main(String[] args)
    {
        Child run = new Child("Vienna");
    }
}

class Parent
{
    public Parent(String city)
    {
        System.out.println(city);
    }

    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    public Child(String city)
    {
        super(city);
    }

}






























































/*
In Parent class.

        Create a constructor, it will take a String parameter called city.

        include the logic of printing the parameter value.

        Create another constructor without parameter.

        Include the logic of printing "Parent Constructor".

        Create a Child Class that should be a subclass of Parent class

Inside child class create a constructor that will make a call to parameterized
constructor of the parent class.

        In Main class.

        Create an Object of the child class by passing String value "Vienna"

        **Expected Output:**

        ```
        Vienna
        ```*/



























































/*
Step 1: Complete the StoreProduct.java class:

        Create below instance variables. (Choose proper datatype and naming
        convention for variable )

        * label

        * price

        * category

        * hasExpiration

        * stock (represent the stock quantity)

        Step 2: Write three constructors:

        * The main constructor( with all parameters)

        * Second constructor with all parameters except category and hasExpiration
        (category defaults to "misc", hasExpiration defaults to false inside constructor)

        * Third constructor all the parameters except category, expiration, and stock
        (stock default to 0 inside the constructor)

        Step 3: Method for display out put.

        in StoreProduct Class create a method to display the output of class variables.
        (Output sequence as as order of variable shown above. all in one line)

        Step 4: in Main Class Create an object of StoreProduct Class with each constructors.

        pass the values and then call the display method.

        Step 5: Execute your application :)

        Hint: each variable must be object specific

        Output:



        ```
        Eggs 3.0 Produce true 10
        Paper Towels 2.0 misc false 24
        Paper Towels 2.0 null false 0
        ```*//*





















*/
