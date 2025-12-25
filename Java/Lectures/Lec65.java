import java.util.Arrays;

public class Lec65 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // int []arr={1,1,1,1};
        // int []arr={2,3,4,5};
        int k = 1;
        Arrays.sort(arr);
        int n = 0;
        int sum = 0;
        for (int i = arr.length - 1; k > 0 && i >= 0; i--) {
            if (arr[i] - n > 0) {
                sum = sum + arr[i] - n;
            }
            n++;
            k--;
        }
        System.err.println(sum);

    }
}
