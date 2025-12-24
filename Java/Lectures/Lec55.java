import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lec55 {
    public static int kadanes(int arr[]) {
        // kadane's Algorithm O(n)
        // a. When the array is not wrapping around
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxsum = Math.max(maxsum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Brute force approach O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // System.err.print(sum + " ");
        // }
        // System.err.println();
        // }

        int initialSum = kadanes(arr);
        if (initialSum < 0){
            System.err.println(initialSum);
            System.exit(0);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int revSum=kadanes(arr);
        int wrappingSum = sum + revSum;
        System.err.println(Arrays.toString(arr));
        System.err.println("initialSum: " + initialSum);
        System.err.println("revSum: " + revSum);
        System.err.println("sum: " + sum);
        System.err.println("wrappingSum: " + wrappingSum);
        sc.close();
    }
}
