import java.time.LocalTime;
import java.time.Duration;
import java.util.*;

public class Lec45 {
public static boolean isPrime(long n) {
    if (n < 2) return false;
    if (n % 2 == 0) return n == 2;
    for (long i = 3; i * i <= n; i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime st = LocalTime.now();

        System.out.print("Enter the number a : ");
        long a = sc.nextLong();

        boolean result = isPrime(a);

        LocalTime end = LocalTime.now();

        Duration diff = Duration.between(st, end);

        System.out.println(end);
        System.out.println("Is prime: " + result);
        System.out.println("Time taken: " + diff.toMillis() + " ms");
    }
}
