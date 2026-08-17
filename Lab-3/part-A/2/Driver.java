public class Driver {
    public static void main(String[] args) {

        card[] c = new card[6];

        c[0] = new card("Ace", "Spades");
        c[1] = new card("King", "Hearts");
        c[2] = new card("Queen", "Diamonds");
        c[3] = new card("Jack", "Clubs");
        c[4] = new card("Jack", "Clubs");
        c[5] = new card("10", "Spades");
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].equals(c[j])) {
                    System.out.println("Duplicate card found: " + c[i]);
                    break;
                }
            }
        }

    }
}
