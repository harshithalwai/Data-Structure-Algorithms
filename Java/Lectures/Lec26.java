import java.util.ArrayList;

public class Lec26 {
    public static ArrayList<Integer> leader(int... arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;
        int currmax = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= currmax) {
                lst.add(0, arr[i]);
                currmax = arr[i];
            }
        }
        return lst;

        // int[] a = new int[n];
        // a[n - 1] = arr[n - 1];

        // // Build suffix max array (max from i to end)
        // for (int i = n - 2; i >= 0; i--) {
        // a[i] = Math.max(arr[i], a[i + 1]);
        // }

        // for (int i = 0; i < n; i++) {
        // if (arr[i] >= (i == n - 1 ? Integer.MIN_VALUE : a[i + 1])) {
        // System.out.print(arr[i] + " ");
        // }
        // }
        // System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(leader(16, 17, 4, 3, 5, 2));
        System.out.println(leader(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
