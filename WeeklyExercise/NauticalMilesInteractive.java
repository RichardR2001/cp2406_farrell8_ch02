// NauticalMilesInteractive.java
import java.util.Scanner;
class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        final double KM_NAUTICAL_MILE = 1.852;
        final double MILE_NAUTICAL_MILE = 1.150779;
        double nauticalMile;
        double km;
        double mile;
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter distance in nautical mile >> ");
        nauticalMile = input.nextDouble();
        km = nauticalMile * KM_NAUTICAL_MILE;
        mile = nauticalMile * MILE_NAUTICAL_MILE;
        System.out.print(nauticalMile + " nautical miles equals " +
                km + " kilometers or " + mile + " miles.");
    }
}
