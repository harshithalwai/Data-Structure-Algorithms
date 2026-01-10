import java.util.Scanner;

public class Lec82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int ans = n-Math.min(i, Math.min(j, Math.min(2 * n - 1 - i, 2 * n - 1 - j)));
                System.out.print(ans + " ");
            }
            System.out.println();
        }

    }
}
