public class replit88
{
    String breed;
    String name;
    String color;

    public replit88()
    {
        breed = null;
        name = null;
        color = null;
    }

    public void bark()
    {
        System.out.println(breed + " can bark");
    }

    public void run()
    {
        System.out.println(breed + " can run");
    }

    public void play()
    {
        System.out.println(breed + " can play");
    }

    public static void main(String [] args)
    {
        replit88 husky = new replit88();
        replit88 bulldog = new replit88();
        replit88 labrador = new replit88();

        husky.breed = "Husky";
        husky.name = "Husk";
        husky.color = "Grey";

        bulldog.breed = "Bulldog";
        bulldog.name = "Bully";
        bulldog.color = "White";

        labrador.breed = "Labrador";
        labrador.name = "Labby";
        labrador.color = "Light brown";

        husky.bark();
        husky.run();
        husky.play();

        bulldog.bark();
        bulldog.run();
        bulldog.play();

        labrador.bark();
        labrador.run();
        labrador.play();
    }

}
