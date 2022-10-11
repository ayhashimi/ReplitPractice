/*

Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
 *//*



class Main
{
    public static void main(String[] args)
    {
        Car one = new Car("Toyota", "Prius", 4, 120, 30000.0);
        Car two = new Car("Toyota", "Prius",120, 30000.0);
        Car three = new Car(4,120, 30000.0);
        Car four = new Car("Toyota", "Prius",4);

        one.display();
        two.display();
        three.display();
        four.display();
    }
}

class Car
{
    String make, model;
    int numberOfDoors, topSpeed;
    double price;

    public Car(String m, String md, int nD, int sp, double pr)
    {
        make = m;
        model = md;
        numberOfDoors = nD;
        topSpeed = sp;
        price = pr;
    }

    public Car(String m, String md, int sp, double pr)
    {
        make = m;
        model = md;
        numberOfDoors = 4;
        topSpeed = sp;
        price = pr;
    }

    public Car(int nD, int sp, double pr)
    {
        make = "unknown";
        model = "unknown";
        numberOfDoors = nD;
        topSpeed = sp;
        price = pr;
    }

    public Car(String m, String md, int nD)
    {
        make = m;
        model = md;
        numberOfDoors = nD;
        topSpeed = 90;
        price = 0.0;
    }

    public void display()
    {
        System.out.println(make + " " + model + " "
                + numberOfDoors + " " + topSpeed + " " + price);
    }
}



















































*/
/*
1. Complete the Car.java class:

        Create the following variable (**Choose proper datatype**)

        * make

        * model

        * numberOfDoors

        * topSpeed

        * price

        following the proper naming convention for variables.

        Write four constructors:

        * The first constructor(with all parameters)

        * A secondary constructor Have all parameters
        **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)

        * A third constructor Have all parameters
        **except make and model .** **(**make and model value should assign
        to "unknown" inside constructor)

        * A fourth constructor Have all parameters
        **except topSpeed and price**;**(**topSpeed value should assign to "90"
        and price value should be assign to 0 inside constructor)

        Create a display method in Cars class to print the class variable value in console.

        2. Test your code with the Main.java class:

        Create several Car objects using all Constructors.

        then call display method with each object.

        Output:

        ```
        Toyota Prius 4 120 30000.0
        Toyota Prius 4 120 30000.0
        unknown unknown 4 120 30000.0
        Toyota Prius 4 90 0.0
        ```*/

