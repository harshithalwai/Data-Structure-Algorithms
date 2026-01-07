import java.util.Arrays;

public class Lec80 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 1 };
        Arrays.sort(arr);
        int freq = 1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                if (freq > arr.length / 2) {
                    break;
                } else {
                    freq = 1;
                    ans = arr[i];
                }
            }

        }
        System.out.println(ans);
    }
}
