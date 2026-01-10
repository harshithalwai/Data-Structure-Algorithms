import java.util.Scanner;

public class Lec83 {
    public static void main(String[] args) {
        double base = 2;// base
        int power = -2;// power
        if (base == 1 || base == 0) {
            System.out.println(base);
            System.exit(0);
        }
        if (power == 0) {
            System.out.println(1);
            System.exit(0);
        }
        long binForm = power;
        double ans = 1;
        if (power < 0) {
            base = 1 / base;
            binForm = -binForm;
        }

        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= base;
            }
            base *= base;
            binForm /= 2;
        }
        System.out.println(ans);
    }
}
