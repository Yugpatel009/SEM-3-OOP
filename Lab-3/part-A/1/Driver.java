import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
        // (d) In Driver.main: build a Point[] with some repeated coordinates.
        point[] points = {
                new point(1, 2),
                new point(3, 4),
                new point(5, 6),
                new point(5, 6),
                new point(5, 6),
                new point(5, 6),
                new point(5, 6),
                new point(7, 8),
                new point(9, 10),
        };
        int distinctCount = 0;

        for (int i = 0; i < points.length; i++) {
            boolean isDistinct = false;

            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    isDistinct = true;
                    break;
                }

            }
            if (!isDistinct) {
                distinctCount++;
            }

        }

        // Print “Distinct: N”.
        System.out.println("Distinct: " + distinctCount);
    }
}
