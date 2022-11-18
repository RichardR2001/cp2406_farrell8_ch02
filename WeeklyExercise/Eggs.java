// Eggs.java
import java.util.Scanner;
class Eggs
{
    public static void main(String[] args)
    {
        final int DOZEN = 12;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_PIECE = 0.45;
        int eggs;
        int dozens;
        int remainder;
        double totalPay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter eggs needed (in pieces) >> ");
        eggs = input.nextInt();
        dozens = eggs / DOZEN;
        remainder = eggs % DOZEN;
        totalPay = dozens * PRICE_PER_DOZEN + remainder * PRICE_PER_PIECE;
        System.out.println("You ordered " + eggs + " eggs. That's " +
                dozens + " dozen at $" + PRICE_PER_DOZEN +
                " per dozen and " + remainder + " loose eggs at " +
                (int) (PRICE_PER_PIECE * 100) + " cents each for a total of $" + totalPay);
    }
}
