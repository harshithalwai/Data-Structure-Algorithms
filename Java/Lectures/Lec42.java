import java.util.Arrays;

public class Lec42 {
    public static void main(String[] args) {
        int[][] points = {
                { 0, 0 },
                { 0, 1 },
                { 1, 0 },
                { 0, 2 },
                { 2, 0 }
        };

        int n = points.length;
        double max = 0;
        Arrays.sort(points, (a, b) -> {
            return a[0] - b[0];
        });
        // check all triplets of points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = 0.5 * Math.abs(
                            points[i][0] * (points[j][1] - points[k][1])
                                    + points[j][0] * (points[k][1] - points[i][1])
                                    + points[k][0] * (points[i][1] - points[j][1]));
                    max = Math.max(max, area);
                    System.out.println("Points: (" + points[i][0] + "," + points[i][1] + "), (" +
                            points[j][0] + "," + points[j][1] + "), (" +
                            points[k][0] + "," + points[k][1] + ") -> Area: " + area);
                }
            }
        }

    }
}
