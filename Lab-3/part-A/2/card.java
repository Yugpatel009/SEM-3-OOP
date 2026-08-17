public class card {
    private String rank;
    private String suit;

    public card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        card other = (card) obj;
        return this.rank.equals(other.rank) && this.suit.equals(other.suit);
    }

    @Override
    public int hashCode() {
        return 31 * rank.hashCode() + suit.hashCode();
    }

}
