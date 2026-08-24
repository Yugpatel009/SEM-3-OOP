import java.util.Objects;

public class Driver {
    public static void main(String[] args) {

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

        System.out.println("Distinct: " + distinctCount);
    }
}
