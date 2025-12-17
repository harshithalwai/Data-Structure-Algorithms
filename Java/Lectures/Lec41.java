import java.util.Arrays;

public class Lec41 {
    public static void validTriangle1(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
            }
        }
    }

    public static int binSearch(int[] arr, int target, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target > arr[mid]) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int validTriangle2(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                int k = binSearch(arr, sum, j + 1, n - 1);
                if (k != -1) {
                    count += (k - j);
                }
            }
        }
        return count;
    }

    public static int validTriangle3(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(arr);
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 2, 3, 4 };
        int[] arr = { 1, 2, 1, 10 };
        System.out.println(validTriangle3(arr));
    }
}
