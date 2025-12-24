import java.util.Arrays;
import java.util.Scanner;

public class Lec56 {
    public static int[] pairSortedSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int st = 0, end = arr.length - 1;
        int target = sc.nextInt();
        while (st < end) {
            if (arr[st] + arr[end] == target) {
                return new int[] { st, end };
            } else if (arr[st] + arr[end] > target) {
                end--;
            } else {
                st++;
            }
        }
        sc.close();
        return new int[] { -1, -1 };
    }

    public static int[] pairSum() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        int target = sc.nextInt();

        int i = 0, sum = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {
                return new int[] { i, j }; // 0-based index
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(pairSum()));
    }
}
