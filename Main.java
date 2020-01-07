import java.util.Scanner;

public class Main
{

    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the volume of your house");
        double houseVolume = keyboard.nextDouble();
        System.out.println("now please enter approximate number of roaches in your house ");
        double roachesPopulation = keyboard.nextDouble();
        int countWeeks = 0;
        double totalPopulation= 0.0;
        double newPopulaiton = 0;



        while (totalPopulation < houseVolume)
        {
            newPopulaiton = roachesPopulation * ONE_BUG_VOLUME;
            totalPopulation = newPopulaiton 

        }

        System.out.println("starting with the roaches: " + roachesPopulation);
        System.out.println("house volume: " + houseVolume);
        System.out.println("it will take " + countWeeks + " weeks to fill a complete house");
        System.out.println("with roaches size of: " + totalPopulation);



    }
}
