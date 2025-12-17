import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lec53 {
    public static void Approach1(int[] arr) {
        int N = (int) 1e6 + 2;
        int dup[] = new int[N];

        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            dup[arr[i]]++;
        }
        for (int i = 0; i < dup.length; i++) {
            if (dup[i] > 1) {
                lst.add(i);
            }
        }

        System.err.println(lst);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
