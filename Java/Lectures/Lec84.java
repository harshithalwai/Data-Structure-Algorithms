import java.util.Scanner;

public class Lec84 {
    public static void bruteForce(int[] arr) {
        int st = -1, end = -1;
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int w = j - i;
                int h = Math.min(arr[i], arr[j]);
                if (h * w > maxArea) {
                    maxArea = h * w;
                    st = i;
                    end = j;
                }
            }
        }
        System.out.println("Max Area is between index " + st + " and " + end + " with area " + maxArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int st = 0, end = arr.length - 1;
        int maxArea = 0;
        while (st < end) {
            int w = end - st;
            int h = Math.min(arr[st], arr[end]);
            int area = w * h;
            if (arr[st] < arr[end]) {
                st++;
            } else {
                end--;
            }
            maxArea = Math.max(area, maxArea);
        }
        System.out.println(maxArea);
    }
}
