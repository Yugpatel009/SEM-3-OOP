import java.util.Scanner;

public class VendingMachine {

    // An enum is a fixed set of named constants. Here, one per coin.
    enum Coin { ONE, TWO, FIVE, TEN }

    public static void main(String[] args) {
        final int PRICE = 15;            // snack price
        int total = 0;                   // money inserted so far
        Scanner sc = new Scanner(System.in);

        System.out.println("Snack price: " + PRICE);
        System.out.println("Insert coins (ONE, TWO, FIVE, TEN):");

        
        while (total < PRICE) {
            System.out.print("Coin: ");
            String input = sc.next().toUpperCase();     // read one word, ignore case

            Coin coin;
            try {
                coin = Coin.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("  Not a valid coin, try again.");
                continue;                                // ask again
            }

           
            int value = switch (coin) {
                case ONE  -> 1;
                case TWO  -> 2;
                case FIVE -> 5;
                case TEN  -> 10;
            };

            total += value;
            System.out.println("  Inserted so far: " + total);
        }

        
        System.out.println("Paid. Change: " + (total - PRICE));
        sc.close();
    }
}
