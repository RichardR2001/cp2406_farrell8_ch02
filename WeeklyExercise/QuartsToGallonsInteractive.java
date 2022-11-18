// QuartsToGallonsInteractive.java
import java.util.Scanner;
class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        // copy the code from QuartsToGallons since they share similar code,
        // with the addition to let user input the number of quarts instead of pre-determine
        final int QUARTS_IN_GALLON = 4;
        int quartsRequired;
        int gallonsRequired;
        int extraQuartsRequired;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts required >> ");      // ask user for input
        quartsRequired = input.nextInt();
        gallonsRequired = quartsRequired / QUARTS_IN_GALLON;
        extraQuartsRequired = quartsRequired % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsRequired + " quarts requires " + gallonsRequired +
                " gallons plus " + extraQuartsRequired + " quarts.");   // print the line on a new line space
    }

}
