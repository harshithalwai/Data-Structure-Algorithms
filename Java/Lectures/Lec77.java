import java.util.Arrays;

public class Lec77 {
    public static void notCoveringallcases(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                ans = arr[i];
            }
            count = 0;
        }
        System.out.println(ans);
    }

    public static void majorityBrute(int arr[]) {
        Arrays.sort(arr);
        int ans = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = arr[i];
            }
            if (freq > arr.length / 2) {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // int []arr={2,2,1,1,1,2,2};
        // int[] arr = { 3, 3, 4 };
        int[] arr = { 1 };
        notCoveringallcases(arr);

    }
}
