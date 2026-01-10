import java.lang.reflect.Array;
import java.util.Arrays;

public class Lec85 {
    // 238. Product of Array Except Self
    public static void Bruteforce(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                mul *= arr[j];
            }
            newArr[i] = mul;
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void Better(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];// {1,2,6,24}
        int suffix[] = new int[n];// {,1}

        for (int i = 0; i < prefix.length; i++) {
            int mul = 1;
            if (i != 0) {
                mul = prefix[i - 1] * arr[i - 1];
            }
            prefix[i] = mul;
        }

        for (int i = suffix.length - 1; i >= 0; i--) {
            int mul = 1;
            if (i != suffix.length - 1) {
                mul = suffix[i + 1] * arr[i + 1];
            }
            suffix[i] = mul;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int[] arr) {

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        // int[] arr = { -1, 1, 0, -3, 3 };
        // Bruteforce(arr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 1;
        }
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1] * arr[i-1];
        }
        int suffix=1;
        System.out.println(Arrays.toString(ans));
        for(int i = ans.length-2;i>=0;i--){
            suffix*=arr[i+1];
            ans[i]*=suffix;
        }
        System.out.println(Arrays.toString(ans));
    }
}
