import java.time.Duration;
import java.time.LocalTime;

public class Lec51 {
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        if (n % 3 == 0) {
            return n == 3;
        }
        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0 || n % i + 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fib(int n) {
    double phi = (1 + Math.sqrt(5)) / 2;
    double psi = (1 - Math.sqrt(5)) / 2;

    long ans = Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    System.out.println(ans);
}

    public static void main(String[] args) {
        LocalTime st = LocalTime.now();

        LocalTime end = LocalTime.now();
        fib(50);
        Duration diff = Duration.between(st, end);
        System.err.println(diff.toNanosPart());
    }
}
