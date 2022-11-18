// QuartsToGallons.java
class QuartsToGallons
{
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;     // set the constant as 1 gallon to be equal to 4 quarts
        int quartsRequired = 18;            // set the variable as integer since quart is always an integer
        int gallonsRequired;                // set the variable as integer
        int extraQuartsRequired;            // set variable as integer as it will be the remainder of the division
        gallonsRequired = quartsRequired / QUARTS_IN_GALLON;
        extraQuartsRequired = quartsRequired % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsRequired + " quarts requires " + gallonsRequired +
                " gallons plus " + extraQuartsRequired + " quarts.");   // print the line on a new line space
    }
}
