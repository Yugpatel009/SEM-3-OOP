import java.util.Objects;

public class point {
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;

        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        point other = (point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
