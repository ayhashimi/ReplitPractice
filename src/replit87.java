public class replit87
{
    String carColor;
    int carYear;
    String carMake;

    public replit87()
    {
        carColor = null;
        carYear = 0;
        carMake = null;
    }

    public static void main(String[] args)
    {
        replit87 car1 = new replit87();
        replit87 car2 = new replit87();

        car1.carColor = "Black";
        car1.carYear = 2019;
        car1.carMake = "BMW";
        car2.carColor = "White";
        car2.carYear = 2018;
        car2.carMake = "Toyota";

        System.out.println("Car color is " + car1.carColor + " and car year is "
                + car1.carYear + " and car model is " + car1.carMake);

        System.out.println("Car color is " + car2.carColor + " and car year is "
                + car2.carYear + " and car model is " + car2.carMake);
    }
}
