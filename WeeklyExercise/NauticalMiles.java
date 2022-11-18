// NauticalMiles.java
class NauticalMiles
{
    public static void main(String[] args)
    {
        final double KM_NAUTICAL_MILE = 1.852;
        final double MILE_NAUTICAL_MILE = 1.150779;
        double nauticalMile = 100;
        double km;
        double mile;
        km = nauticalMile * KM_NAUTICAL_MILE;
        mile = nauticalMile * MILE_NAUTICAL_MILE;
        System.out.print(nauticalMile + " nautical miles equals " +
                km + " kilometers or " + mile + " miles.");
    }
}
